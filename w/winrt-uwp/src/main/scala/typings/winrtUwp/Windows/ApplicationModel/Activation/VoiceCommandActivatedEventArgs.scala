package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info for the app's activated event when the app is launched through a voice command. */
trait VoiceCommandActivatedEventArgs extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the SpeechRecognitionResult object representing the voice command that activated the app. */
  var result: SpeechRecognitionResult
  /** Gets info about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}

object VoiceCommandActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    result: SpeechRecognitionResult,
    splashScreen: SplashScreen
  ): VoiceCommandActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandActivatedEventArgs]
  }
}

