package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    VoxImplant SDK Configuration
  */
trait Config extends js.Object {
  /**
    *    XSS protection for inbound instant messages that can contain HTML content
    */
  var imXSSprotection: js.UndefOr[Boolean] = js.undefined
  /**
    *    If set to true microphone access dialog will be shown and all functions will become available only after user allowed access
    */
  var micRequired: js.UndefOr[Boolean] = js.undefined
  /**
    *    Automatically plays progress tone by means of SDK according to specified progressToneCountry
    */
  var progressTone: js.UndefOr[Boolean] = js.undefined
  /**
    *    Country code for progress tone generated automatically if progressTone set to true
    */
  var progressToneCountry: js.UndefOr[String] = js.undefined
  /**
    *    Show debug info in console
    */
  var showDebugInfo: js.UndefOr[Boolean] = js.undefined
  /**
    *    Show Flash Settings panel instead of standard Allow/Deny dialog (in Flash mode)
    */
  var showFlashSettings: js.UndefOr[Boolean] = js.undefined
  /**
    *    Id of HTMLElement that will be used as container for Flash component of SDK (Mic/cam access dialog will appear in the container). If micRequired set to true element should have size not less than 215x138 (px) for access dialog to be shown
    */
  var swfContainer: js.UndefOr[String] = js.undefined
  /**
    *    Force VoxImplant to use Flash (WebRTC is used if available by default)
    */
  var useFlashOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *    Force VoxImplant to use WebRTC (WebRTC is used if available by default). Error will be thrown if WebRTC in unavailable
    */
  var useRTCOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *    Default constraints that will be applied while the next attachRecordingDevice function call or if micRequired set to true
    */
  var videoConstraints: js.UndefOr[VideoSettings | Boolean] = js.undefined
  /**
    *    Video support
    */
  var videoSupport: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    imXSSprotection: js.UndefOr[Boolean] = js.undefined,
    micRequired: js.UndefOr[Boolean] = js.undefined,
    progressTone: js.UndefOr[Boolean] = js.undefined,
    progressToneCountry: String = null,
    showDebugInfo: js.UndefOr[Boolean] = js.undefined,
    showFlashSettings: js.UndefOr[Boolean] = js.undefined,
    swfContainer: String = null,
    useFlashOnly: js.UndefOr[Boolean] = js.undefined,
    useRTCOnly: js.UndefOr[Boolean] = js.undefined,
    videoConstraints: VideoSettings | Boolean = null,
    videoSupport: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imXSSprotection)) __obj.updateDynamic("imXSSprotection")(imXSSprotection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(micRequired)) __obj.updateDynamic("micRequired")(micRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressTone)) __obj.updateDynamic("progressTone")(progressTone.get.asInstanceOf[js.Any])
    if (progressToneCountry != null) __obj.updateDynamic("progressToneCountry")(progressToneCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(showDebugInfo)) __obj.updateDynamic("showDebugInfo")(showDebugInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFlashSettings)) __obj.updateDynamic("showFlashSettings")(showFlashSettings.get.asInstanceOf[js.Any])
    if (swfContainer != null) __obj.updateDynamic("swfContainer")(swfContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlashOnly)) __obj.updateDynamic("useFlashOnly")(useFlashOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useRTCOnly)) __obj.updateDynamic("useRTCOnly")(useRTCOnly.get.asInstanceOf[js.Any])
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(videoSupport)) __obj.updateDynamic("videoSupport")(videoSupport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

