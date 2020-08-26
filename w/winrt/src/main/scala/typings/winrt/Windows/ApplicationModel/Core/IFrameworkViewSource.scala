package typings.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFrameworkViewSource extends js.Object {
  def createView(): IFrameworkView = js.native
}

object IFrameworkViewSource {
  @scala.inline
  def apply(createView: () => IFrameworkView): IFrameworkViewSource = {
    val __obj = js.Dynamic.literal(createView = js.Any.fromFunction0(createView))
    __obj.asInstanceOf[IFrameworkViewSource]
  }
  @scala.inline
  implicit class IFrameworkViewSourceOps[Self <: IFrameworkViewSource] (val x: Self) extends AnyVal {
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
    def setCreateView(value: () => IFrameworkView): Self = this.set("createView", js.Any.fromFunction0(value))
  }
  
}

