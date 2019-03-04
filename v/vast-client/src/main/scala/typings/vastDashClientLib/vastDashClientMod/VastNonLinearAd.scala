package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastNonLinearAd extends js.Object {
  var adParameters: java.lang.String | scala.Null
  var apiFramework: java.lang.String
  var expandedHeight: java.lang.String
  var expandedWidth: java.lang.String
  var height: java.lang.String
  var htmlResource: java.lang.String | scala.Null
  var id: java.lang.String | scala.Null
  var iframeResource: java.lang.String | scala.Null
  var maintainAspectRatio: scala.Boolean
  var minSuggestedDuration: scala.Double
  var nonLinearClickThroughURLTemplate: java.lang.String | scala.Null
  var nonLinearClickTrackingURLTemplates: js.Array[java.lang.String]
  var scalable: scala.Boolean
  var staticResource: java.lang.String | scala.Null
  var `type`: java.lang.String | scala.Null
  var width: java.lang.String
}

object VastNonLinearAd {
  @scala.inline
  def apply(
    apiFramework: java.lang.String,
    expandedHeight: java.lang.String,
    expandedWidth: java.lang.String,
    height: java.lang.String,
    maintainAspectRatio: scala.Boolean,
    minSuggestedDuration: scala.Double,
    nonLinearClickTrackingURLTemplates: js.Array[java.lang.String],
    scalable: scala.Boolean,
    width: java.lang.String,
    adParameters: java.lang.String = null,
    htmlResource: java.lang.String = null,
    id: java.lang.String = null,
    iframeResource: java.lang.String = null,
    nonLinearClickThroughURLTemplate: java.lang.String = null,
    staticResource: java.lang.String = null,
    `type`: java.lang.String = null
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

