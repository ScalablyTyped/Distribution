package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsReturn extends ProtocolCommandResponse {
  var actionAcknowledgmentTimeout: js.UndefOr[Double] = js.native
  var allowInvisibleElements: js.UndefOr[Boolean] = js.native
  var elementResponseAttributes: js.UndefOr[String] = js.native
  var enableNotificationListener: js.UndefOr[Boolean] = js.native
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.native
  var keyInjectionDelay: js.UndefOr[Double] = js.native
  var mjpegScalingFactor: js.UndefOr[Double] = js.native
  var mjpegServerFramerate: js.UndefOr[Double] = js.native
  var mjpegServerScreenshotQuality: js.UndefOr[Double] = js.native
  var normalizeTagNames: js.UndefOr[Boolean] = js.native
  var screenshotQuality: js.UndefOr[Double] = js.native
  var scrollAcknowledgmentTimeout: js.UndefOr[Double] = js.native
  var shouldUseCompactResponses: js.UndefOr[Boolean] = js.native
  var shutdownOnPowerDisconnect: js.UndefOr[Boolean] = js.native
  var waitForIdleTimeout: js.UndefOr[Double] = js.native
  var waitForSelectorTimeout: js.UndefOr[Double] = js.native
}

object SettingsReturn {
  @scala.inline
  def apply(): SettingsReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsReturn]
  }
  @scala.inline
  implicit class SettingsReturnOps[Self <: SettingsReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionAcknowledgmentTimeout(value: Double): Self = this.set("actionAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionAcknowledgmentTimeout: Self = this.set("actionAcknowledgmentTimeout", js.undefined)
    @scala.inline
    def setAllowInvisibleElements(value: Boolean): Self = this.set("allowInvisibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInvisibleElements: Self = this.set("allowInvisibleElements", js.undefined)
    @scala.inline
    def setElementResponseAttributes(value: String): Self = this.set("elementResponseAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementResponseAttributes: Self = this.set("elementResponseAttributes", js.undefined)
    @scala.inline
    def setEnableNotificationListener(value: Boolean): Self = this.set("enableNotificationListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableNotificationListener: Self = this.set("enableNotificationListener", js.undefined)
    @scala.inline
    def setIgnoreUnimportantViews(value: Boolean): Self = this.set("ignoreUnimportantViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnimportantViews: Self = this.set("ignoreUnimportantViews", js.undefined)
    @scala.inline
    def setKeyInjectionDelay(value: Double): Self = this.set("keyInjectionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyInjectionDelay: Self = this.set("keyInjectionDelay", js.undefined)
    @scala.inline
    def setMjpegScalingFactor(value: Double): Self = this.set("mjpegScalingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMjpegScalingFactor: Self = this.set("mjpegScalingFactor", js.undefined)
    @scala.inline
    def setMjpegServerFramerate(value: Double): Self = this.set("mjpegServerFramerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMjpegServerFramerate: Self = this.set("mjpegServerFramerate", js.undefined)
    @scala.inline
    def setMjpegServerScreenshotQuality(value: Double): Self = this.set("mjpegServerScreenshotQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMjpegServerScreenshotQuality: Self = this.set("mjpegServerScreenshotQuality", js.undefined)
    @scala.inline
    def setNormalizeTagNames(value: Boolean): Self = this.set("normalizeTagNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeTagNames: Self = this.set("normalizeTagNames", js.undefined)
    @scala.inline
    def setScreenshotQuality(value: Double): Self = this.set("screenshotQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshotQuality: Self = this.set("screenshotQuality", js.undefined)
    @scala.inline
    def setScrollAcknowledgmentTimeout(value: Double): Self = this.set("scrollAcknowledgmentTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollAcknowledgmentTimeout: Self = this.set("scrollAcknowledgmentTimeout", js.undefined)
    @scala.inline
    def setShouldUseCompactResponses(value: Boolean): Self = this.set("shouldUseCompactResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldUseCompactResponses: Self = this.set("shouldUseCompactResponses", js.undefined)
    @scala.inline
    def setShutdownOnPowerDisconnect(value: Boolean): Self = this.set("shutdownOnPowerDisconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShutdownOnPowerDisconnect: Self = this.set("shutdownOnPowerDisconnect", js.undefined)
    @scala.inline
    def setWaitForIdleTimeout(value: Double): Self = this.set("waitForIdleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForIdleTimeout: Self = this.set("waitForIdleTimeout", js.undefined)
    @scala.inline
    def setWaitForSelectorTimeout(value: Double): Self = this.set("waitForSelectorTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForSelectorTimeout: Self = this.set("waitForSelectorTimeout", js.undefined)
  }
  
}

