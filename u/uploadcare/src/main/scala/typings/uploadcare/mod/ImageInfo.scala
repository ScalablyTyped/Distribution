package typings.uploadcare.mod

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
    val __obj = js.Dynamic.literal(datetime_original = datetime_original.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], geo_location = geo_location.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
}

