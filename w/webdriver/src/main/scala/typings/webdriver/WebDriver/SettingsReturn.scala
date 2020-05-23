package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsReturn extends ProtocolCommandResponse {
  var actionAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined
  var allowInvisibleElements: js.UndefOr[Boolean] = js.undefined
  var elementResponseAttributes: js.UndefOr[String] = js.undefined
  var enableNotificationListener: js.UndefOr[Boolean] = js.undefined
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined
  var keyInjectionDelay: js.UndefOr[Double] = js.undefined
  var mjpegScalingFactor: js.UndefOr[Double] = js.undefined
  var mjpegServerFramerate: js.UndefOr[Double] = js.undefined
  var mjpegServerScreenshotQuality: js.UndefOr[Double] = js.undefined
  var normalizeTagNames: js.UndefOr[Boolean] = js.undefined
  var screenshotQuality: js.UndefOr[Double] = js.undefined
  var scrollAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined
  var shouldUseCompactResponses: js.UndefOr[Boolean] = js.undefined
  var shutdownOnPowerDisconnect: js.UndefOr[Boolean] = js.undefined
  var waitForIdleTimeout: js.UndefOr[Double] = js.undefined
  var waitForSelectorTimeout: js.UndefOr[Double] = js.undefined
}

object SettingsReturn {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    actionAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined,
    allowInvisibleElements: js.UndefOr[Boolean] = js.undefined,
    elementResponseAttributes: String = null,
    enableNotificationListener: js.UndefOr[Boolean] = js.undefined,
    ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined,
    keyInjectionDelay: js.UndefOr[Double] = js.undefined,
    mjpegScalingFactor: js.UndefOr[Double] = js.undefined,
    mjpegServerFramerate: js.UndefOr[Double] = js.undefined,
    mjpegServerScreenshotQuality: js.UndefOr[Double] = js.undefined,
    normalizeTagNames: js.UndefOr[Boolean] = js.undefined,
    screenshotQuality: js.UndefOr[Double] = js.undefined,
    scrollAcknowledgmentTimeout: js.UndefOr[Double] = js.undefined,
    shouldUseCompactResponses: js.UndefOr[Boolean] = js.undefined,
    shutdownOnPowerDisconnect: js.UndefOr[Boolean] = js.undefined,
    waitForIdleTimeout: js.UndefOr[Double] = js.undefined,
    waitForSelectorTimeout: js.UndefOr[Double] = js.undefined
  ): SettingsReturn = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(actionAcknowledgmentTimeout)) __obj.updateDynamic("actionAcknowledgmentTimeout")(actionAcknowledgmentTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInvisibleElements)) __obj.updateDynamic("allowInvisibleElements")(allowInvisibleElements.get.asInstanceOf[js.Any])
    if (elementResponseAttributes != null) __obj.updateDynamic("elementResponseAttributes")(elementResponseAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNotificationListener)) __obj.updateDynamic("enableNotificationListener")(enableNotificationListener.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnimportantViews)) __obj.updateDynamic("ignoreUnimportantViews")(ignoreUnimportantViews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyInjectionDelay)) __obj.updateDynamic("keyInjectionDelay")(keyInjectionDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mjpegScalingFactor)) __obj.updateDynamic("mjpegScalingFactor")(mjpegScalingFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mjpegServerFramerate)) __obj.updateDynamic("mjpegServerFramerate")(mjpegServerFramerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mjpegServerScreenshotQuality)) __obj.updateDynamic("mjpegServerScreenshotQuality")(mjpegServerScreenshotQuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeTagNames)) __obj.updateDynamic("normalizeTagNames")(normalizeTagNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenshotQuality)) __obj.updateDynamic("screenshotQuality")(screenshotQuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollAcknowledgmentTimeout)) __obj.updateDynamic("scrollAcknowledgmentTimeout")(scrollAcknowledgmentTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUseCompactResponses)) __obj.updateDynamic("shouldUseCompactResponses")(shouldUseCompactResponses.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnPowerDisconnect)) __obj.updateDynamic("shutdownOnPowerDisconnect")(shutdownOnPowerDisconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForIdleTimeout)) __obj.updateDynamic("waitForIdleTimeout")(waitForIdleTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSelectorTimeout)) __obj.updateDynamic("waitForSelectorTimeout")(waitForSelectorTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsReturn]
  }
}

