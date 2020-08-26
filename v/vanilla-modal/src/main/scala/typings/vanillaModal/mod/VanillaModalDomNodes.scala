package typings.vanillaModal.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VanillaModalDomNodes extends js.Object {
  var modal: HTMLElement = js.native
  var modalContent: HTMLElement = js.native
  var modalInner: HTMLElement = js.native
  var page: HTMLElement = js.native
}

object VanillaModalDomNodes {
  @scala.inline
  def apply(modal: HTMLElement, modalContent: HTMLElement, modalInner: HTMLElement, page: HTMLElement): VanillaModalDomNodes = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any], modalContent = modalContent.asInstanceOf[js.Any], modalInner = modalInner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[VanillaModalDomNodes]
  }
  @scala.inline
  implicit class VanillaModalDomNodesOps[Self <: VanillaModalDomNodes] (val x: Self) extends AnyVal {
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
    def setModal(value: HTMLElement): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setModalContent(value: HTMLElement): Self = this.set("modalContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setModalInner(value: HTMLElement): Self = this.set("modalInner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: HTMLElement): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

