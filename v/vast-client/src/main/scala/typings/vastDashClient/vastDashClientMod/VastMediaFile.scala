package typings.vastDashClient.vastDashClientMod

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
    maintainAspectRatio: js.UndefOr[Boolean] = js.undefined,
    mimeType: String = null,
    scalable: js.UndefOr[Boolean] = js.undefined
  ): VastMediaFile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], deliveryType = deliveryType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxBitrate = maxBitrate.asInstanceOf[js.Any], minBitrate = minBitrate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (fileURL != null) __obj.updateDynamic("fileURL")(fileURL.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainAspectRatio)) __obj.updateDynamic("maintainAspectRatio")(maintainAspectRatio.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastMediaFile]
  }
}

