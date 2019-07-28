package typings.uploadcare.uploadcareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var datetime_original: Null
  var dpi: js.Array[Double]
  var format: String
  var geo_location: Null
  var height: Double
  var orientation: Null
  var sequence: Boolean
  var width: Double
}

object ImageInfo {
  @scala.inline
  def apply(
    datetime_original: Null,
    dpi: js.Array[Double],
    format: String,
    geo_location: Null,
    height: Double,
    orientation: Null,
    sequence: Boolean,
    width: Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(datetime_original = datetime_original, dpi = dpi, format = format, geo_location = geo_location, height = height, orientation = orientation, sequence = sequence, width = width)
  
    __obj.asInstanceOf[ImageInfo]
  }
}

