package typings
package uploadcareLib.uploadcareMod.UploadcareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var datetime_original: scala.Null
  var dpi: js.Array[scala.Double]
  var format: java.lang.String
  var geo_location: scala.Null
  var height: scala.Double
  var orientation: scala.Null
  var sequence: scala.Boolean
  var width: scala.Double
}

object ImageInfo {
  @scala.inline
  def apply(
    datetime_original: scala.Null,
    dpi: js.Array[scala.Double],
    format: java.lang.String,
    geo_location: scala.Null,
    height: scala.Double,
    orientation: scala.Null,
    sequence: scala.Boolean,
    width: scala.Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("datetime_original")(datetime_original)
    __obj.updateDynamic("dpi")(dpi)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("geo_location")(geo_location)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("orientation")(orientation)
    __obj.updateDynamic("sequence")(sequence)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ImageInfo]
  }
}

