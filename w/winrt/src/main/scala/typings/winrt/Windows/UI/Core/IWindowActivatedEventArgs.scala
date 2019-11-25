package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowActivatedEventArgs extends ICoreWindowEventArgs {
  var windowActivationState: CoreWindowActivationState
}

object IWindowActivatedEventArgs {
  @scala.inline
  def apply(handled: Boolean, windowActivationState: CoreWindowActivationState): IWindowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], windowActivationState = windowActivationState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWindowActivatedEventArgs]
  }
}

