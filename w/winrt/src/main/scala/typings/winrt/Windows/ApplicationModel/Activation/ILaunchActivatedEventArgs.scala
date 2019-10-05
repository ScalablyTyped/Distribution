package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaunchActivatedEventArgs extends IActivatedEventArgs {
  var arguments: String
  var tileId: String
}

object ILaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): ILaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, tileId = tileId)
  
    __obj.asInstanceOf[ILaunchActivatedEventArgs]
  }
}

