package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCreativeLinear extends VastCreative {
  var adParameters: java.lang.String | scala.Null
  var duration: scala.Double
  var icons: js.Array[VastIcon]
  var mediaFiles: js.Array[VastMediaFile]
  var skipDelay: scala.Double | scala.Null
  var videoClickThroughURLTemplate: java.lang.String | scala.Null
  var videoClickTrackingURLTemplates: js.Array[java.lang.String]
  var videoCustomClickURLTempaltes: js.Array[java.lang.String]
}

object VastCreativeLinear {
  @scala.inline
  def apply(
    duration: scala.Double,
    icons: js.Array[VastIcon],
    mediaFiles: js.Array[VastMediaFile],
    trackingEvents: VastTrackingEvents,
    `type`: java.lang.String,
    videoClickTrackingURLTemplates: js.Array[java.lang.String],
    videoCustomClickURLTempaltes: js.Array[java.lang.String],
    adId: java.lang.String = null,
    adParameters: java.lang.String = null,
    apiFramework: java.lang.String = null,
    id: java.lang.String = null,
    sequence: java.lang.String | scala.Double = null,
    skipDelay: scala.Int | scala.Double = null,
    videoClickThroughURLTemplate: java.lang.String = null
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("icons")(icons)
    __obj.updateDynamic("mediaFiles")(mediaFiles)
    __obj.updateDynamic("trackingEvents")(trackingEvents)
    __obj.updateDynamic("videoClickTrackingURLTemplates")(videoClickTrackingURLTemplates)
    __obj.updateDynamic("videoCustomClickURLTempaltes")(videoCustomClickURLTempaltes)
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

