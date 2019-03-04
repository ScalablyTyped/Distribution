package typings
package vanillaDashModalLib.vanillaDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VanillaModalDomNodes extends js.Object {
  var modal: stdLib.HTMLElement
  var modalContent: stdLib.HTMLElement
  var modalInner: stdLib.HTMLElement
  var page: stdLib.HTMLElement
}

object VanillaModalDomNodes {
  @scala.inline
  def apply(
    modal: stdLib.HTMLElement,
    modalContent: stdLib.HTMLElement,
    modalInner: stdLib.HTMLElement,
    page: stdLib.HTMLElement
  ): VanillaModalDomNodes = {
    val __obj = js.Dynamic.literal(modal = modal, modalContent = modalContent, modalInner = modalInner, page = page)
  
    __obj.asInstanceOf[VanillaModalDomNodes]
  }
}

