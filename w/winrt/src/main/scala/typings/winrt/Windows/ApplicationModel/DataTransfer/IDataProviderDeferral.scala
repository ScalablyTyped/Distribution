package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataProviderDeferral extends js.Object {
  def complete(): Unit = js.native
}

object IDataProviderDeferral {
  @scala.inline
  def apply(complete: () => Unit): IDataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IDataProviderDeferral]
  }
  @scala.inline
  implicit class IDataProviderDeferralOps[Self <: IDataProviderDeferral] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
  
}

