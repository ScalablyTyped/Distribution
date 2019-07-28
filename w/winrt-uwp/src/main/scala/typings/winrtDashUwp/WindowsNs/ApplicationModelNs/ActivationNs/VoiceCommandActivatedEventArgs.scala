package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info for the app's activated event when the app is launched through a voice command. */
@JSGlobal("Windows.ApplicationModel.Activation.VoiceCommandActivatedEventArgs")
@js.native
abstract class VoiceCommandActivatedEventArgs () extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the SpeechRecognitionResult object representing the voice command that activated the app. */
  var result: SpeechRecognitionResult = js.native
  /** Gets info about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

