package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastIcon extends js.Object {
  var apiFramework: String | Null
  var duration: Double
  var height: Double
  var htmlResource: String | Null
  var iconClickThroughURLTemplate: String | Null
  var iconClickTrackingURLTemplates: js.Array[String]
  var iconViewTrackingURLTemplate: String | Null
  var iframeResource: String | Null
  var offset: String | Null
  var program: String | Null
  var staticResource: String | Null
  var `type`: String | Null
  var width: Double
  var xPosition: Double
  var yPosition: Double
}

object VastIcon {
  @scala.inline
  def apply(
    duration: Double,
    height: Double,
    iconClickTrackingURLTemplates: js.Array[String],
    width: Double,
    xPosition: Double,
    yPosition: Double,
    apiFramework: String = null,
    htmlResource: String = null,
    iconClickThroughURLTemplate: String = null,
    iconViewTrackingURLTemplate: String = null,
    iframeResource: String = null,
    offset: String = null,
    program: String = null,
    staticResource: String = null,
    `type`: String = null
  ): VastIcon = {
    val __obj = js.Dynamic.literal(duration = duration, height = height, iconClickTrackingURLTemplates = iconClickTrackingURLTemplates, width = width, xPosition = xPosition, yPosition = yPosition)
    if (apiFramework != null) __obj.updateDynamic("apiFramework")(apiFramework)
    if (htmlResource != null) __obj.updateDynamic("htmlResource")(htmlResource)
    if (iconClickThroughURLTemplate != null) __obj.updateDynamic("iconClickThroughURLTemplate")(iconClickThroughURLTemplate)
    if (iconViewTrackingURLTemplate != null) __obj.updateDynamic("iconViewTrackingURLTemplate")(iconViewTrackingURLTemplate)
    if (iframeResource != null) __obj.updateDynamic("iframeResource")(iframeResource)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (program != null) __obj.updateDynamic("program")(program)
    if (staticResource != null) __obj.updateDynamic("staticResource")(staticResource)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VastIcon]
  }
}

