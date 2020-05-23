package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastMediaFile extends js.Object {
  var apiFramework: String | Null
  var bitrate: Double
  var codec: String | Null
  var deliveryType: String
  var fileURL: String | Null
  var height: Double
  var id: String | Null
  var maintainAspectRatio: Boolean | Null
  var maxBitrate: Double
  var mimeType: String | Null
  var minBitrate: Double
  var scalable: Boolean | Null
  var width: Double
}

object VastMediaFile {
  @scala.inline
  def apply(
    bitrate: Double,
    deliveryType: String,
    height: Double,
    maxBitrate: Double,
    minBitrate: Double,
    width: Double,
    apiFramework: String = null,
    codec: String = null,
    fileURL: String = null,
    id: String = null,
    maintainAspectRatio: Boolean = null.asInstanceOf[Boolean],
    mimeType: String = null,
    scalable: Boolean = null.asInstanceOf[Boolean]
  ): VastMediaFile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], deliveryType = deliveryType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxBitrate = maxBitrate.asInstanceOf[js.Any], minBitrate = minBitrate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], apiFramework = apiFramework.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], fileURL = fileURL.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastMediaFile]
  }
}

