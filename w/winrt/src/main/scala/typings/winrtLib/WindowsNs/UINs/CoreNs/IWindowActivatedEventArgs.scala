package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowActivatedEventArgs extends ICoreWindowEventArgs {
  var windowActivationState: CoreWindowActivationState
}

object IWindowActivatedEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, windowActivationState: CoreWindowActivationState): IWindowActivatedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("windowActivationState")(windowActivationState)
    __obj.asInstanceOf[IWindowActivatedEventArgs]
  }
}

