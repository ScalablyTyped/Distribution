package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaunchActivatedEventArgs extends IActivatedEventArgs {
  var arguments: java.lang.String
  var tileId: java.lang.String
}

object ILaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: java.lang.String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: java.lang.String
  ): ILaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, tileId = tileId)
  
    __obj.asInstanceOf[ILaunchActivatedEventArgs]
  }
}

