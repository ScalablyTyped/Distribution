package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindowSizeChangedEventArgs extends ICoreWindowEventArgs {
  var size: Size = js.native
}

object IWindowSizeChangedEventArgs {
  @scala.inline
  def apply(handled: Boolean, size: Size): IWindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowSizeChangedEventArgs]
  }
  @scala.inline
  implicit class IWindowSizeChangedEventArgsOps[Self <: IWindowSizeChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

