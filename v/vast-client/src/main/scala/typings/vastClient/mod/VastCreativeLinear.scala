package typings.vastClient.mod

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
  var videoCustomClickURLTemplates: js.Array[String]
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
    videoCustomClickURLTemplates: js.Array[String],
    adId: String = null,
    adParameters: String = null,
    apiFramework: String = null,
    id: String = null,
    sequence: String | Double = null,
    skipDelay: Int | Double = null,
    videoClickThroughURLTemplate: String = null
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], mediaFiles = mediaFiles.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], videoClickTrackingURLTemplates = videoClickTrackingURLTemplates.asInstanceOf[js.Any], videoCustomClickURLTemplates = videoCustomClickURLTemplates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (adParameters != null) __obj.updateDynamic("adParameters")(adParameters.asInstanceOf[js.Any])
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (skipDelay != null) __obj.updateDynamic("skipDelay")(skipDelay.asInstanceOf[js.Any])
    if (videoClickThroughURLTemplate != null) __obj.updateDynamic("videoClickThroughURLTemplate")(videoClickThroughURLTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeLinear]
  }
}

