package typings.vanillaModal.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VanillaModalConfig extends js.Object {
  
  var `class`: js.UndefOr[String] = js.native
  
  var clickOutside: js.UndefOr[Boolean] = js.native
  
  var close: js.UndefOr[String] = js.native
  
  var closeKeys: js.UndefOr[js.Array[js.UndefOr[Double]] | Boolean] = js.native
  
  var loadClass: js.UndefOr[String] = js.native
  
  var modal: js.UndefOr[String | HTMLElement] = js.native
  
  var modalContent: js.UndefOr[String] = js.native
  
  var modalInner: js.UndefOr[String] = js.native
  
  var onBeforeClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  
  var onBeforeOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  
  var onClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  
  var open: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[String] = js.native
  
  var transitionEnd: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  
  var transitions: js.UndefOr[String] = js.native
}
object VanillaModalConfig {
  
  @scala.inline
  def apply(): VanillaModalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VanillaModalConfig]
  }
  
  @scala.inline
  implicit class VanillaModalConfigOps[Self <: VanillaModalConfig] (val x: Self) extends AnyVal {
    
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClickOutside(value: Boolean): Self = this.set("clickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickOutside: Self = this.set("clickOutside", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseKeysVarargs(value: js.UndefOr[Double]*): Self = this.set("closeKeys", js.Array(value :_*))
    
    @scala.inline
    def setCloseKeys(value: js.Array[js.UndefOr[Double]] | Boolean): Self = this.set("closeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseKeys: Self = this.set("closeKeys", js.undefined)
    
    @scala.inline
    def setLoadClass(value: String): Self = this.set("loadClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadClass: Self = this.set("loadClass", js.undefined)
    
    @scala.inline
    def setModal(value: String | HTMLElement): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setModalContent(value: String): Self = this.set("modalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalContent: Self = this.set("modalContent", js.undefined)
    
    @scala.inline
    def setModalInner(value: String): Self = this.set("modalInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalInner: Self = this.set("modalInner", js.undefined)
    
    @scala.inline
    def setOnBeforeClose(value: () => js.UndefOr[scala.Nothing]): Self = this.set("onBeforeClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBeforeClose: Self = this.set("onBeforeClose", js.undefined)
    
    @scala.inline
    def setOnBeforeOpen(value: () => js.UndefOr[scala.Nothing]): Self = this.set("onBeforeOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBeforeOpen: Self = this.set("onBeforeOpen", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => js.UndefOr[scala.Nothing]): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => js.UndefOr[scala.Nothing]): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setTransitionEnd(value: () => js.UndefOr[scala.Nothing]): Self = this.set("transitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTransitionEnd: Self = this.set("transitionEnd", js.undefined)
    
    @scala.inline
    def setTransitions(value: String): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
}
