package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCompanionAd extends js.Object {
  var altText: java.lang.String | scala.Null
  var companionClickThroughURLTemplate: java.lang.String | scala.Null
  var companionClickTrackingURLTemplate: js.UndefOr[java.lang.String | scala.Null]
  var companionClickTrackingURLTemplates: js.Array[java.lang.String]
  var height: java.lang.String
  var htmlResource: java.lang.String | scala.Null
  var id: java.lang.String | scala.Null
  var iframeResource: java.lang.String | scala.Null
  var staticResource: java.lang.String | scala.Null
  var trackingEvents: VastCompanionTrackingEvents
  var `type`: java.lang.String | scala.Null
  var width: java.lang.String
}

object VastCompanionAd {
  @scala.inline
  def apply(
    companionClickTrackingURLTemplates: js.Array[java.lang.String],
    height: java.lang.String,
    trackingEvents: VastCompanionTrackingEvents,
    width: java.lang.String,
    altText: java.lang.String = null,
    companionClickThroughURLTemplate: java.lang.String = null,
    companionClickTrackingURLTemplate: java.lang.String = null,
    htmlResource: java.lang.String = null,
    id: java.lang.String = null,
    iframeResource: java.lang.String = null,
    staticResource: java.lang.String = null,
    `type`: java.lang.String = null
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

