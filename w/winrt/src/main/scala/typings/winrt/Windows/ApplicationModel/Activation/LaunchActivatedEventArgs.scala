package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.LaunchActivatedEventArgs")
@js.native
class LaunchActivatedEventArgs () extends ILaunchActivatedEventArgs {
  /* CompleteClass */
  override var arguments: String = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var tileId: String = js.native
}

