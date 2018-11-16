package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event raised when the app is activated from a voice command. */
@JSGlobal("Windows.UI.WebUI.WebUIVoiceCommandActivatedEventArgs")
@js.native
abstract class WebUIVoiceCommandActivatedEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the activation type. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets the SpeechRecognitionResult object representing the voice command that activated the app. */
  var result: winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResult = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
}

