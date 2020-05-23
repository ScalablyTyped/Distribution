package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a media container format. */
trait ContainerEncodingProperties extends js.Object {
  /** Gets additional format properties for the media container. */
  var properties: MediaPropertySet
  /** Gets or sets the subtype of the media container. */
  var subtype: String
  /** Gets the format type. */
  var `type`: String
}

object ContainerEncodingProperties {
  @scala.inline
  def apply(properties: MediaPropertySet, subtype: String, `type`: String): ContainerEncodingProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerEncodingProperties]
  }
}

