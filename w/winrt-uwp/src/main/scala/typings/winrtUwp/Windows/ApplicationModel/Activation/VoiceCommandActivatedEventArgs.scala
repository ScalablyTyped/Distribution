package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info for the app's activated event when the app is launched through a voice command. */
@js.native
trait VoiceCommandActivatedEventArgs extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the SpeechRecognitionResult object representing the voice command that activated the app. */
  var result: SpeechRecognitionResult = js.native
  /** Gets info about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
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
  @scala.inline
  implicit class VoiceCommandActivatedEventArgsOps[Self <: VoiceCommandActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: SpeechRecognitionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

