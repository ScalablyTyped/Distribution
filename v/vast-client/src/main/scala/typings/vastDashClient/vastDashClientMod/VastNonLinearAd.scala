package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastNonLinearAd extends js.Object {
  var adParameters: String | Null
  var apiFramework: String
  var expandedHeight: String
  var expandedWidth: String
  var height: String
  var htmlResource: String | Null
  var id: String | Null
  var iframeResource: String | Null
  var maintainAspectRatio: Boolean
  var minSuggestedDuration: Double
  var nonLinearClickThroughURLTemplate: String | Null
  var nonLinearClickTrackingURLTemplates: js.Array[String]
  var scalable: Boolean
  var staticResource: String | Null
  var `type`: String | Null
  var width: String
}

object VastNonLinearAd {
  @scala.inline
  def apply(
    apiFramework: String,
    expandedHeight: String,
    expandedWidth: String,
    height: String,
    maintainAspectRatio: Boolean,
    minSuggestedDuration: Double,
    nonLinearClickTrackingURLTemplates: js.Array[String],
    scalable: Boolean,
    width: String,
    adParameters: String = null,
    htmlResource: String = null,
    id: String = null,
    iframeResource: String = null,
    nonLinearClickThroughURLTemplate: String = null,
    staticResource: String = null,
    `type`: String = null
  ): VastNonLinearAd = {
    val __obj = js.Dynamic.literal(apiFramework = apiFramework, expandedHeight = expandedHeight, expandedWidth = expandedWidth, height = height, maintainAspectRatio = maintainAspectRatio, minSuggestedDuration = minSuggestedDuration, nonLinearClickTrackingURLTemplates = nonLinearClickTrackingURLTemplates, scalable = scalable, width = width)
    if (adParameters != null) __obj.updateDynamic("adParameters")(adParameters)
    if (htmlResource != null) __obj.updateDynamic("htmlResource")(htmlResource)
    if (id != null) __obj.updateDynamic("id")(id)
    if (iframeResource != null) __obj.updateDynamic("iframeResource")(iframeResource)
    if (nonLinearClickThroughURLTemplate != null) __obj.updateDynamic("nonLinearClickThroughURLTemplate")(nonLinearClickThroughURLTemplate)
    if (staticResource != null) __obj.updateDynamic("staticResource")(staticResource)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VastNonLinearAd]
  }
}

