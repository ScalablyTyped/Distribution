package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCompanionAd extends js.Object {
  var altText: String | Null
  var companionClickThroughURLTemplate: String | Null
  var companionClickTrackingURLTemplate: js.UndefOr[String | Null] = js.undefined
  var companionClickTrackingURLTemplates: js.Array[String]
  var height: String
  var htmlResource: String | Null
  var id: String | Null
  var iframeResource: String | Null
  var staticResource: String | Null
  var trackingEvents: VastCompanionTrackingEvents
  var `type`: String | Null
  var width: String
}

object VastCompanionAd {
  @scala.inline
  def apply(
    companionClickTrackingURLTemplates: js.Array[String],
    height: String,
    trackingEvents: VastCompanionTrackingEvents,
    width: String,
    altText: String = null,
    companionClickThroughURLTemplate: String = null,
    companionClickTrackingURLTemplate: String = null,
    htmlResource: String = null,
    id: String = null,
    iframeResource: String = null,
    staticResource: String = null,
    `type`: String = null
  ): VastCompanionAd = {
    val __obj = js.Dynamic.literal(companionClickTrackingURLTemplates = companionClickTrackingURLTemplates, height = height, trackingEvents = trackingEvents, width = width)
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (companionClickThroughURLTemplate != null) __obj.updateDynamic("companionClickThroughURLTemplate")(companionClickThroughURLTemplate)
    if (companionClickTrackingURLTemplate != null) __obj.updateDynamic("companionClickTrackingURLTemplate")(companionClickTrackingURLTemplate)
    if (htmlResource != null) __obj.updateDynamic("htmlResource")(htmlResource)
    if (id != null) __obj.updateDynamic("id")(id)
    if (iframeResource != null) __obj.updateDynamic("iframeResource")(iframeResource)
    if (staticResource != null) __obj.updateDynamic("staticResource")(staticResource)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VastCompanionAd]
  }
}

