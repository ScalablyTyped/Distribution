package typings.vanillaModal

import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanilla-modal", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VanillaModal {
    def this(settings: VanillaModalConfig) = this()
  }
  
  @js.native
  trait VanillaModal extends StObject {
    
    def addLoadedCssClass(): Unit = js.native
    
    def captureNode(node: Node): Unit = js.native
    
    def close(): Unit = js.native
    def close(e: Event): Unit = js.native
    
    def closeKeyHandler(e: Event): Unit = js.native
    
    def closeModal(e: Event): Unit = js.native
    
    def closeModalWithTransition(e: Event): Unit = js.native
    
    def delegateClose(e: Event): Unit = js.native
    
    def delegateOpen(e: Event): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def detectTransition(): Boolean = js.native
    
    def getDomNodes(): VanillaModalDomNodes = js.native
    
    def listen(): Unit = js.native
    
    def open(allMatches: String): Unit = js.native
    def open(allMatches: String, e: Event): Unit = js.native
    
    def outsideClickHandler(e: Event): Unit = js.native
    
    def releaseNode(node: Node): Unit = js.native
    
    def removeOpenId(): Unit = js.native
    
    def setOpenId(id: String): Unit = js.native
  }
  
  trait VanillaModalConfig extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var clickOutside: js.UndefOr[Boolean] = js.undefined
    
    var close: js.UndefOr[String] = js.undefined
    
    var closeKeys: js.UndefOr[(js.Array[Double | Unit]) | Boolean] = js.undefined
    
    var loadClass: js.UndefOr[String] = js.undefined
    
    var modal: js.UndefOr[String | HTMLElement] = js.undefined
    
    var modalContent: js.UndefOr[String] = js.undefined
    
    var modalInner: js.UndefOr[String] = js.undefined
    
    var onBeforeClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBeforeOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var open: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[String] = js.undefined
    
    var transitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var transitions: js.UndefOr[String] = js.undefined
  }
  object VanillaModalConfig {
    
    inline def apply(): VanillaModalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VanillaModalConfig]
    }
    
    extension [Self <: VanillaModalConfig](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setClickOutside(value: Boolean): Self = StObject.set(x, "clickOutside", value.asInstanceOf[js.Any])
      
      inline def setClickOutsideUndefined: Self = StObject.set(x, "clickOutside", js.undefined)
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseKeys(value: (js.Array[Double | Unit]) | Boolean): Self = StObject.set(x, "closeKeys", value.asInstanceOf[js.Any])
      
      inline def setCloseKeysUndefined: Self = StObject.set(x, "closeKeys", js.undefined)
      
      inline def setCloseKeysVarargs(value: (Double | Unit)*): Self = StObject.set(x, "closeKeys", js.Array(value*))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setLoadClass(value: String): Self = StObject.set(x, "loadClass", value.asInstanceOf[js.Any])
      
      inline def setLoadClassUndefined: Self = StObject.set(x, "loadClass", js.undefined)
      
      inline def setModal(value: String | HTMLElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalContent(value: String): Self = StObject.set(x, "modalContent", value.asInstanceOf[js.Any])
      
      inline def setModalContentUndefined: Self = StObject.set(x, "modalContent", js.undefined)
      
      inline def setModalInner(value: String): Self = StObject.set(x, "modalInner", value.asInstanceOf[js.Any])
      
      inline def setModalInnerUndefined: Self = StObject.set(x, "modalInner", js.undefined)
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnBeforeClose(value: () => Unit): Self = StObject.set(x, "onBeforeClose", js.Any.fromFunction0(value))
      
      inline def setOnBeforeCloseUndefined: Self = StObject.set(x, "onBeforeClose", js.undefined)
      
      inline def setOnBeforeOpen(value: () => Unit): Self = StObject.set(x, "onBeforeOpen", js.Any.fromFunction0(value))
      
      inline def setOnBeforeOpenUndefined: Self = StObject.set(x, "onBeforeOpen", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setTransitionEnd(value: () => Unit): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction0(value))
      
      inline def setTransitionEndUndefined: Self = StObject.set(x, "transitionEnd", js.undefined)
      
      inline def setTransitions(value: String): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
  
  trait VanillaModalDomNodes extends StObject {
    
    var modal: HTMLElement
    
    var modalContent: HTMLElement
    
    var modalInner: HTMLElement
    
    var page: HTMLElement
  }
  object VanillaModalDomNodes {
    
    inline def apply(modal: HTMLElement, modalContent: HTMLElement, modalInner: HTMLElement, page: HTMLElement): VanillaModalDomNodes = {
      val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any], modalContent = modalContent.asInstanceOf[js.Any], modalInner = modalInner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[VanillaModalDomNodes]
    }
    
    extension [Self <: VanillaModalDomNodes](x: Self) {
      
      inline def setModal(value: HTMLElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalContent(value: HTMLElement): Self = StObject.set(x, "modalContent", value.asInstanceOf[js.Any])
      
      inline def setModalInner(value: HTMLElement): Self = StObject.set(x, "modalInner", value.asInstanceOf[js.Any])
      
      inline def setPage(value: HTMLElement): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
}
