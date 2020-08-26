package typings.sweetalert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseModal extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | js.Any] = js.native
}

object CloseModal {
  @scala.inline
  def apply(): CloseModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseModal]
  }
  @scala.inline
  implicit class CloseModalOps[Self <: CloseModal] (val x: Self) extends AnyVal {
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
    def setCloseModal(value: Boolean): Self = this.set("closeModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseModal: Self = this.set("closeModal", js.undefined)
    @scala.inline
    def setValue(value: String | js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

