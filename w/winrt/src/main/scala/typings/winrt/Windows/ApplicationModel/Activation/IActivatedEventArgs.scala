package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedEventArgs extends js.Object {
  var kind: ActivationKind
  var previousExecutionState: ApplicationExecutionState
  var splashScreen: SplashScreen
}

object IActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[IActivatedEventArgs]
  }
}

