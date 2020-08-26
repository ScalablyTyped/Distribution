package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowDialogFactory extends js.Object {
  def createWithTitle(title: String): CoreWindowDialog = js.native
}

object ICoreWindowDialogFactory {
  @scala.inline
  def apply(createWithTitle: String => CoreWindowDialog): ICoreWindowDialogFactory = {
    val __obj = js.Dynamic.literal(createWithTitle = js.Any.fromFunction1(createWithTitle))
    __obj.asInstanceOf[ICoreWindowDialogFactory]
  }
  @scala.inline
  implicit class ICoreWindowDialogFactoryOps[Self <: ICoreWindowDialogFactory] (val x: Self) extends AnyVal {
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
    def setCreateWithTitle(value: String => CoreWindowDialog): Self = this.set("createWithTitle", js.Any.fromFunction1(value))
  }
  
}

