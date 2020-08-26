package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindowActivatedEventArgs extends ICoreWindowEventArgs {
  var windowActivationState: CoreWindowActivationState = js.native
}

object IWindowActivatedEventArgs {
  @scala.inline
  def apply(handled: Boolean, windowActivationState: CoreWindowActivationState): IWindowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], windowActivationState = windowActivationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowActivatedEventArgs]
  }
  @scala.inline
  implicit class IWindowActivatedEventArgsOps[Self <: IWindowActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWindowActivationState(value: CoreWindowActivationState): Self = this.set("windowActivationState", value.asInstanceOf[js.Any])
  }
  
}

