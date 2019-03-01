package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtocolActivatedEventArgs extends IActivatedEventArgs {
  var uri: winrtLib.WindowsNs.FoundationNs.Uri
}

object IProtocolActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    uri: winrtLib.WindowsNs.FoundationNs.Uri
  ): IProtocolActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("previousExecutionState")(previousExecutionState)
    __obj.updateDynamic("splashScreen")(splashScreen)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[IProtocolActivatedEventArgs]
  }
}

