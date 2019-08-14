package typings.webdriver.WebDriverNs

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
    actionAcknowledgmentTimeout: Int | Double = null,
    allowInvisibleElements: js.UndefOr[Boolean] = js.undefined,
    elementResponseAttributes: String = null,
    enableNotificationListener: js.UndefOr[Boolean] = js.undefined,
    ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined,
    keyInjectionDelay: Int | Double = null,
    mjpegScalingFactor: Int | Double = null,
    mjpegServerFramerate: Int | Double = null,
    mjpegServerScreenshotQuality: Int | Double = null,
    normalizeTagNames: js.UndefOr[Boolean] = js.undefined,
    screenshotQuality: Int | Double = null,
    scrollAcknowledgmentTimeout: Int | Double = null,
    shouldUseCompactResponses: js.UndefOr[Boolean] = js.undefined,
    shutdownOnPowerDisconnect: js.UndefOr[Boolean] = js.undefined,
    waitForIdleTimeout: Int | Double = null,
    waitForSelectorTimeout: Int | Double = null
  ): SettingsReturn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actionAcknowledgmentTimeout != null) __obj.updateDynamic("actionAcknowledgmentTimeout")(actionAcknowledgmentTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInvisibleElements)) __obj.updateDynamic("allowInvisibleElements")(allowInvisibleElements)
    if (elementResponseAttributes != null) __obj.updateDynamic("elementResponseAttributes")(elementResponseAttributes)
    if (!js.isUndefined(enableNotificationListener)) __obj.updateDynamic("enableNotificationListener")(enableNotificationListener)
    if (!js.isUndefined(ignoreUnimportantViews)) __obj.updateDynamic("ignoreUnimportantViews")(ignoreUnimportantViews)
    if (keyInjectionDelay != null) __obj.updateDynamic("keyInjectionDelay")(keyInjectionDelay.asInstanceOf[js.Any])
    if (mjpegScalingFactor != null) __obj.updateDynamic("mjpegScalingFactor")(mjpegScalingFactor.asInstanceOf[js.Any])
    if (mjpegServerFramerate != null) __obj.updateDynamic("mjpegServerFramerate")(mjpegServerFramerate.asInstanceOf[js.Any])
    if (mjpegServerScreenshotQuality != null) __obj.updateDynamic("mjpegServerScreenshotQuality")(mjpegServerScreenshotQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeTagNames)) __obj.updateDynamic("normalizeTagNames")(normalizeTagNames)
    if (screenshotQuality != null) __obj.updateDynamic("screenshotQuality")(screenshotQuality.asInstanceOf[js.Any])
    if (scrollAcknowledgmentTimeout != null) __obj.updateDynamic("scrollAcknowledgmentTimeout")(scrollAcknowledgmentTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUseCompactResponses)) __obj.updateDynamic("shouldUseCompactResponses")(shouldUseCompactResponses)
    if (!js.isUndefined(shutdownOnPowerDisconnect)) __obj.updateDynamic("shutdownOnPowerDisconnect")(shutdownOnPowerDisconnect)
    if (waitForIdleTimeout != null) __obj.updateDynamic("waitForIdleTimeout")(waitForIdleTimeout.asInstanceOf[js.Any])
    if (waitForSelectorTimeout != null) __obj.updateDynamic("waitForSelectorTimeout")(waitForSelectorTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsReturn]
  }
}

