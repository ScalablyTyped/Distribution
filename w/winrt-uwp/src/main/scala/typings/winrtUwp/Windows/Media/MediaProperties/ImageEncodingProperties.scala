package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an image stream. */
trait ImageEncodingProperties extends js.Object {
  /** Gets or sets the image height. */
  var height: Double
  /** Gets additional format properties for the image stream. */
  var properties: MediaPropertySet
  /** Gets or sets the subtype of the format. */
  var subtype: String
  /** Gets the format type. */
  var `type`: String
  /** Gets or sets the image width. */
  var width: Double
}

object ImageEncodingProperties {
  @scala.inline
  def apply(height: Double, properties: MediaPropertySet, subtype: String, `type`: String, width: Double): ImageEncodingProperties = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEncodingProperties]
  }
}

