package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	VoxImplant SDK Configuration
	*/
trait Config extends js.Object {
  /**
  		*	XSS protection for inbound instant messages that can contain HTML content
  		*/
  var imXSSprotection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	If set to true microphone access dialog will be shown and all functions will become available only after user allowed access
  		*/
  var micRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	Automatically plays progress tone by means of SDK according to specified progressToneCountry
  		*/
  var progressTone: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	Country code for progress tone generated automatically if progressTone set to true
  		*/
  var progressToneCountry: js.UndefOr[java.lang.String] = js.undefined
  /**
  		*	Show debug info in console
  		*/
  var showDebugInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	Show Flash Settings panel instead of standard Allow/Deny dialog (in Flash mode)
  		*/
  var showFlashSettings: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	Id of HTMLElement that will be used as container for Flash component of SDK (Mic/cam access dialog will appear in the container). If micRequired set to true element should have size not less than 215x138 (px) for access dialog to be shown
  		*/
  var swfContainer: js.UndefOr[java.lang.String] = js.undefined
  /**
  		*	Force VoxImplant to use Flash (WebRTC is used if available by default)
  		*/
  var useFlashOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	Force VoxImplant to use WebRTC (WebRTC is used if available by default). Error will be thrown if WebRTC in unavailable
  		*/
  var useRTCOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*	Default constraints that will be applied while the next attachRecordingDevice function call or if micRequired set to true
  		*/
  var videoConstraints: js.UndefOr[VideoSettings | scala.Boolean] = js.undefined
  /**
  		*	Video support
  		*/
  var videoSupport: js.UndefOr[scala.Boolean] = js.undefined
}

