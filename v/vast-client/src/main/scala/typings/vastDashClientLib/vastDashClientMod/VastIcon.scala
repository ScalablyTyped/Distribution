package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastIcon extends js.Object {
  var apiFramework: java.lang.String | scala.Null
  var duration: scala.Double
  var height: scala.Double
  var htmlResource: java.lang.String | scala.Null
  var iconClickThroughURLTemplate: java.lang.String | scala.Null
  var iconClickTrackingURLTemplates: js.Array[java.lang.String]
  var iconViewTrackingURLTemplate: java.lang.String | scala.Null
  var iframeResource: java.lang.String | scala.Null
  var offset: java.lang.String | scala.Null
  var program: java.lang.String | scala.Null
  var staticResource: java.lang.String | scala.Null
  var `type`: java.lang.String | scala.Null
  var width: scala.Double
  var xPosition: scala.Double
  var yPosition: scala.Double
}

object VastIcon {
  @scala.inline
  def apply(
    duration: scala.Double,
    height: scala.Double,
    iconClickTrackingURLTemplates: js.Array[java.lang.String],
    width: scala.Double,
    xPosition: scala.Double,
    yPosition: scala.Double,
    apiFramework: java.lang.String = null,
    htmlResource: java.lang.String = null,
    iconClickThroughURLTemplate: java.lang.String = null,
    iconViewTrackingURLTemplate: java.lang.String = null,
    iframeResource: java.lang.String = null,
    offset: java.lang.String = null,
    program: java.lang.String = null,
    staticResource: java.lang.String = null,
    `type`: java.lang.String = null
  ): VastIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("iconClickTrackingURLTemplates")(iconClickTrackingURLTemplates)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("xPosition")(xPosition)
    __obj.updateDynamic("yPosition")(yPosition)
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

