package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFileDialog extends js.Object {
  def openFileDialog(): Unit = js.native
}

object OpenFileDialog {
  @scala.inline
  def apply(openFileDialog: () => Unit): OpenFileDialog = {
    val __obj = js.Dynamic.literal(openFileDialog = js.Any.fromFunction0(openFileDialog))
    __obj.asInstanceOf[OpenFileDialog]
  }
  @scala.inline
  implicit class OpenFileDialogOps[Self <: OpenFileDialog] (val x: Self) extends AnyVal {
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
    def setOpenFileDialog(value: () => Unit): Self = this.set("openFileDialog", js.Any.fromFunction0(value))
  }
  
}

