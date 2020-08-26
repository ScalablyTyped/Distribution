package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowEventArgs extends js.Object {
  var handled: Boolean = js.native
}

object ICoreWindowEventArgs {
  @scala.inline
  def apply(handled: Boolean): ICoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindowEventArgs]
  }
  @scala.inline
  implicit class ICoreWindowEventArgsOps[Self <: ICoreWindowEventArgs] (val x: Self) extends AnyVal {
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
  }
  
}

