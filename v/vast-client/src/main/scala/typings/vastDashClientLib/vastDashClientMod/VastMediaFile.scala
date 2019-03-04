package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastMediaFile extends js.Object {
  var apiFramework: java.lang.String | scala.Null
  var bitrate: scala.Double
  var codec: java.lang.String | scala.Null
  var deliveryType: java.lang.String
  var fileURL: java.lang.String | scala.Null
  var height: scala.Double
  var id: java.lang.String | scala.Null
  var maintainAspectRatio: scala.Boolean | scala.Null
  var maxBitrate: scala.Double
  var mimeType: java.lang.String | scala.Null
  var minBitrate: scala.Double
  var scalable: scala.Boolean | scala.Null
  var width: scala.Double
}

object VastMediaFile {
  @scala.inline
  def apply(
    bitrate: scala.Double,
    deliveryType: java.lang.String,
    height: scala.Double,
    maxBitrate: scala.Double,
    minBitrate: scala.Double,
    width: scala.Double,
    apiFramework: java.lang.String = null,
    codec: java.lang.String = null,
    fileURL: java.lang.String = null,
    id: java.lang.String = null,
    maintainAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    mimeType: java.lang.String = null,
    scalable: js.UndefOr[scala.Boolean] = js.undefined
  ): VastMediaFile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate, deliveryType = deliveryType, height = height, maxBitrate = maxBitrate, minBitrate = minBitrate, width = width)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (fileURL != null) __obj.updateDynamic("fileURL")(fileURL)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(maintainAspectRatio)) __obj.updateDynamic("maintainAspectRatio")(maintainAspectRatio)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    __obj.asInstanceOf[VastMediaFile]
  }
}

