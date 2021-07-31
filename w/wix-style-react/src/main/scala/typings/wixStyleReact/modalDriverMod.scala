package typings.wixStyleReact

import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDriverMod {
  
  trait ModalDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickOnCloseButton(): Boolean
    
    def clickOnOverlay(): Boolean
    
    def closeButtonExists(): Boolean
    
    def element(): T
    
    def getChildBySelector(selector: String): HTMLElement | Null
    
    def getContent(): Element
    
    def getContentLabel(): String | Null
    
    def getContentStyle(): CSSStyleDeclaration
    
    def getZIndex(): String | Null
    
    def isOpen(): Boolean
    
    def isScrollable(): Boolean
  }
  object ModalDriver {
    
    @scala.inline
    def apply[T](
      clickOnCloseButton: () => Boolean,
      clickOnOverlay: () => Boolean,
      closeButtonExists: () => Boolean,
      element: () => T,
      exists: () => Boolean,
      getChildBySelector: String => HTMLElement | Null,
      getContent: () => Element,
      getContentLabel: () => String | Null,
      getContentStyle: () => CSSStyleDeclaration,
      getZIndex: () => String | Null,
      isOpen: () => Boolean,
      isScrollable: () => Boolean
    ): ModalDriver[T] = {
      val __obj = js.Dynamic.literal(clickOnCloseButton = js.Any.fromFunction0(clickOnCloseButton), clickOnOverlay = js.Any.fromFunction0(clickOnOverlay), closeButtonExists = js.Any.fromFunction0(closeButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildBySelector = js.Any.fromFunction1(getChildBySelector), getContent = js.Any.fromFunction0(getContent), getContentLabel = js.Any.fromFunction0(getContentLabel), getContentStyle = js.Any.fromFunction0(getContentStyle), getZIndex = js.Any.fromFunction0(getZIndex), isOpen = js.Any.fromFunction0(isOpen), isScrollable = js.Any.fromFunction0(isScrollable))
      __obj.asInstanceOf[ModalDriver[T]]
    }
    
    @scala.inline
    implicit class ModalDriverMutableBuilder[Self <: ModalDriver[?], T] (val x: Self & ModalDriver[T]) extends AnyVal {
      
      @scala.inline
      def setClickOnCloseButton(value: () => Boolean): Self = StObject.set(x, "clickOnCloseButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnOverlay(value: () => Boolean): Self = StObject.set(x, "clickOnOverlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseButtonExists(value: () => Boolean): Self = StObject.set(x, "closeButtonExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: () => T): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChildBySelector(value: String => HTMLElement | Null): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContent(value: () => Element): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentLabel(value: () => String | Null): Self = StObject.set(x, "getContentLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentStyle(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getContentStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetZIndex(value: () => String | Null): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsScrollable(value: () => Boolean): Self = StObject.set(x, "isScrollable", js.Any.fromFunction0(value))
    }
  }
}
