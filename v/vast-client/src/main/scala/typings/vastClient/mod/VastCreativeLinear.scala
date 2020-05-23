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
    skipDelay: Double = null.asInstanceOf[Double],
    videoClickThroughURLTemplate: String = null
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], mediaFiles = mediaFiles.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], videoClickTrackingURLTemplates = videoClickTrackingURLTemplates.asInstanceOf[js.Any], videoCustomClickURLTemplates = videoCustomClickURLTemplates.asInstanceOf[js.Any], adId = adId.asInstanceOf[js.Any], adParameters = adParameters.asInstanceOf[js.Any], apiFramework = apiFramework.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], skipDelay = skipDelay.asInstanceOf[js.Any], videoClickThroughURLTemplate = videoClickThroughURLTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeLinear]
  }
}

