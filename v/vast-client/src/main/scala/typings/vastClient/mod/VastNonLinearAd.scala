package typings.vastClient.mod

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
    val __obj = js.Dynamic.literal(apiFramework = apiFramework.asInstanceOf[js.Any], expandedHeight = expandedHeight.asInstanceOf[js.Any], expandedWidth = expandedWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], minSuggestedDuration = minSuggestedDuration.asInstanceOf[js.Any], nonLinearClickTrackingURLTemplates = nonLinearClickTrackingURLTemplates.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (adParameters != null) __obj.updateDynamic("adParameters")(adParameters.asInstanceOf[js.Any])
    if (htmlResource != null) __obj.updateDynamic("htmlResource")(htmlResource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iframeResource != null) __obj.updateDynamic("iframeResource")(iframeResource.asInstanceOf[js.Any])
    if (nonLinearClickThroughURLTemplate != null) __obj.updateDynamic("nonLinearClickThroughURLTemplate")(nonLinearClickThroughURLTemplate.asInstanceOf[js.Any])
    if (staticResource != null) __obj.updateDynamic("staticResource")(staticResource.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastNonLinearAd]
  }
}

