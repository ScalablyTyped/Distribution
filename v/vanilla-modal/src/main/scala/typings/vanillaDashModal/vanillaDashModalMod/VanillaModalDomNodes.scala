package typings.vanillaDashModal.vanillaDashModalMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaModalDomNodes extends js.Object {
  var modal: HTMLElement
  var modalContent: HTMLElement
  var modalInner: HTMLElement
  var page: HTMLElement
}

object VanillaModalDomNodes {
  @scala.inline
  def apply(modal: HTMLElement, modalContent: HTMLElement, modalInner: HTMLElement, page: HTMLElement): VanillaModalDomNodes = {
    val __obj = js.Dynamic.literal(modal = modal, modalContent = modalContent, modalInner = modalInner, page = page)
  
    __obj.asInstanceOf[VanillaModalDomNodes]
  }
}

