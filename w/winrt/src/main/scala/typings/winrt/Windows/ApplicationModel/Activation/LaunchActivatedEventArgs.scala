package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchActivatedEventArgs extends ILaunchActivatedEventArgs

object LaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): LaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchActivatedEventArgs]
  }
}

