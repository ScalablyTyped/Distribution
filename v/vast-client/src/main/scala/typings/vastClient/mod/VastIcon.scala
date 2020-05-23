package typings.vastClient.mod

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
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], iconClickTrackingURLTemplates = iconClickTrackingURLTemplates.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any], apiFramework = apiFramework.asInstanceOf[js.Any], htmlResource = htmlResource.asInstanceOf[js.Any], iconClickThroughURLTemplate = iconClickThroughURLTemplate.asInstanceOf[js.Any], iconViewTrackingURLTemplate = iconViewTrackingURLTemplate.asInstanceOf[js.Any], iframeResource = iframeResource.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], staticResource = staticResource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastIcon]
  }
}

