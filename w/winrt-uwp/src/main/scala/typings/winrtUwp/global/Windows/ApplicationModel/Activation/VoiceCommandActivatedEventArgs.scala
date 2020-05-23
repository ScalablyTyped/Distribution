package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info for the app's activated event when the app is launched through a voice command. */
@JSGlobal("Windows.ApplicationModel.Activation.VoiceCommandActivatedEventArgs")
@js.native
abstract class VoiceCommandActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.VoiceCommandActivatedEventArgs {
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the SpeechRecognitionResult object representing the voice command that activated the app. */
  /* CompleteClass */
  override var result: SpeechRecognitionResult = js.native
  /** Gets info about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}

