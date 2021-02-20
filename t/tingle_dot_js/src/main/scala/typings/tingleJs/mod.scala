package typings.tingleJs

import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tingle.js", "modal")
  @js.native
  class modal () extends StObject {
    def this(options: Options) = this()
    
    def addFooterBtn(label: String): HTMLButtonElement = js.native
    def addFooterBtn(
      label: String,
      cssClass: js.UndefOr[scala.Nothing],
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
    ): HTMLButtonElement = js.native
    def addFooterBtn(label: String, cssClass: String): HTMLButtonElement = js.native
    def addFooterBtn(
      label: String,
      cssClass: String,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
    ): HTMLButtonElement = js.native
    
    def checkOverflow(): Unit = js.native
    
    def close(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getContent(): HTMLDivElement = js.native
    
    def getFooterContent(): js.UndefOr[HTMLDivElement] = js.native
    
    def isOpen(): Boolean = js.native
    
    def isOverflow(): Boolean = js.native
    
    def open(): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    def setContent(content: Node): Unit = js.native
    
    def setFooterContent(content: String): Unit = js.native
    
    def setStickyFooter(sticky: Boolean): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var beforeClose: js.UndefOr[js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]] = js.native
    
    var beforeOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var closeLabel: js.UndefOr[String] = js.native
    
    var closeMethods: js.UndefOr[js.Array[String]] = js.native
    
    var cssClass: js.UndefOr[js.Array[String]] = js.native
    
    var footer: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.native
    
    var onOpen: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.native
    
    var stickyFooter: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeClose(value: js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: () => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      @scala.inline
      def setCloseMethods(value: js.Array[String]): Self = StObject.set(x, "closeMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseMethodsUndefined: Self = StObject.set(x, "closeMethods", js.undefined)
      
      @scala.inline
      def setCloseMethodsVarargs(value: String*): Self = StObject.set(x, "closeMethods", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setOnClose(value: js.ThisFunction0[/* this */ modal, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: js.ThisFunction0[/* this */ modal, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setStickyFooter(value: Boolean): Self = StObject.set(x, "stickyFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyFooterUndefined: Self = StObject.set(x, "stickyFooter", js.undefined)
    }
  }
}
