package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCreativeLinear extends VastCreative {
  var adParameters: String | Null
  var duration: Double
  var icons: js.Array[VastIcon]
  var mediaFiles: js.Array[VastMediaFile]
  var skipDelay: Double | Null
  var videoClickThroughURLTemplate: String | Null
  var videoClickTrackingURLTemplates: js.Array[String]
  var videoCustomClickURLTempaltes: js.Array[String]
}

object VastCreativeLinear {
  @scala.inline
  def apply(
    duration: Double,
    icons: js.Array[VastIcon],
    mediaFiles: js.Array[VastMediaFile],
    trackingEvents: VastTrackingEvents,
    `type`: String,
    videoClickTrackingURLTemplates: js.Array[String],
    videoCustomClickURLTempaltes: js.Array[String],
    adId: String = null,
    adParameters: String = null,
    apiFramework: String = null,
    id: String = null,
    sequence: String | Double = null,
    skipDelay: Int | Double = null,
    videoClickThroughURLTemplate: String = null
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(duration = duration, icons = icons, mediaFiles = mediaFiles, trackingEvents = trackingEvents, videoClickTrackingURLTemplates = videoClickTrackingURLTemplates, videoCustomClickURLTempaltes = videoCustomClickURLTempaltes)
    __obj.updateDynamic("type")(`type`)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (adParameters != null) __obj.updateDynamic("adParameters")(adParameters)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (skipDelay != null) __obj.updateDynamic("skipDelay")(skipDelay.asInstanceOf[js.Any])
    if (videoClickThroughURLTemplate != null) __obj.updateDynamic("videoClickThroughURLTemplate")(videoClickThroughURLTemplate)
    __obj.asInstanceOf[VastCreativeLinear]
  }
}

