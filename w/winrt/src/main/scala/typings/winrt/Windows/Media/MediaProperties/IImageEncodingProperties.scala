package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageEncodingProperties extends IMediaEncodingProperties {
  var height: Double
  var width: Double
}

object IImageEncodingProperties {
  @scala.inline
  def apply(height: Double, properties: MediaPropertySet, subtype: String, `type`: String, width: Double): IImageEncodingProperties = {
    val __obj = js.Dynamic.literal(height = height, properties = properties, subtype = subtype, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IImageEncodingProperties]
  }
}

