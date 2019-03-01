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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.updateDynamic("tileId")(tileId)
    __obj.asInstanceOf[ILaunchActivatedEventArgs]
  }
}

