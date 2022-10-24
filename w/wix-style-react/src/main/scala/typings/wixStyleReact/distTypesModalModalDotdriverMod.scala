package typings.wixStyleReact

import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLElement
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalModalDotdriverMod {
  
  trait ModalDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickOnCloseButton(): Boolean
    
    def clickOnNavigationNext(): Unit
    
    def clickOnNavigationPrevious(): Unit
    
    def clickOnOverlay(): Boolean
    
    def closeButtonExists(): Boolean
    
    def element(): T
    
    def getChildBySelector(selector: String): HTMLElement | Null
    
    def getContent(): Element
    
    def getContentLabel(): String | Null
    
    def getContentStyle(): CSSStyleDeclaration
    
    def getNavigationNextLabel(): String
    
    def getNavigationPreviousLabel(): String
    
    def getZIndex(): String | Null
    
    def isOpen(): Boolean
    
    def isScrollable(): Boolean
    
    def navigationNextExists(): Boolean
    
    def navigationPreviousExists(): Boolean
  }
  object ModalDriver {
    
    inline def apply[T](
      clickOnCloseButton: () => Boolean,
      clickOnNavigationNext: () => Unit,
      clickOnNavigationPrevious: () => Unit,
      clickOnOverlay: () => Boolean,
      closeButtonExists: () => Boolean,
      element: () => T,
      exists: () => Boolean,
      getChildBySelector: String => HTMLElement | Null,
      getContent: () => Element,
      getContentLabel: () => String | Null,
      getContentStyle: () => CSSStyleDeclaration,
      getNavigationNextLabel: () => String,
      getNavigationPreviousLabel: () => String,
      getZIndex: () => String | Null,
      isOpen: () => Boolean,
      isScrollable: () => Boolean,
      navigationNextExists: () => Boolean,
      navigationPreviousExists: () => Boolean
    ): ModalDriver[T] = {
      val __obj = js.Dynamic.literal(clickOnCloseButton = js.Any.fromFunction0(clickOnCloseButton), clickOnNavigationNext = js.Any.fromFunction0(clickOnNavigationNext), clickOnNavigationPrevious = js.Any.fromFunction0(clickOnNavigationPrevious), clickOnOverlay = js.Any.fromFunction0(clickOnOverlay), closeButtonExists = js.Any.fromFunction0(closeButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildBySelector = js.Any.fromFunction1(getChildBySelector), getContent = js.Any.fromFunction0(getContent), getContentLabel = js.Any.fromFunction0(getContentLabel), getContentStyle = js.Any.fromFunction0(getContentStyle), getNavigationNextLabel = js.Any.fromFunction0(getNavigationNextLabel), getNavigationPreviousLabel = js.Any.fromFunction0(getNavigationPreviousLabel), getZIndex = js.Any.fromFunction0(getZIndex), isOpen = js.Any.fromFunction0(isOpen), isScrollable = js.Any.fromFunction0(isScrollable), navigationNextExists = js.Any.fromFunction0(navigationNextExists), navigationPreviousExists = js.Any.fromFunction0(navigationPreviousExists))
      __obj.asInstanceOf[ModalDriver[T]]
    }
    
    extension [Self <: ModalDriver[?], T](x: Self & ModalDriver[T]) {
      
      inline def setClickOnCloseButton(value: () => Boolean): Self = StObject.set(x, "clickOnCloseButton", js.Any.fromFunction0(value))
      
      inline def setClickOnNavigationNext(value: () => Unit): Self = StObject.set(x, "clickOnNavigationNext", js.Any.fromFunction0(value))
      
      inline def setClickOnNavigationPrevious(value: () => Unit): Self = StObject.set(x, "clickOnNavigationPrevious", js.Any.fromFunction0(value))
      
      inline def setClickOnOverlay(value: () => Boolean): Self = StObject.set(x, "clickOnOverlay", js.Any.fromFunction0(value))
      
      inline def setCloseButtonExists(value: () => Boolean): Self = StObject.set(x, "closeButtonExists", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => T): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetChildBySelector(value: String => HTMLElement | Null): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: () => Element): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetContentLabel(value: () => String | Null): Self = StObject.set(x, "getContentLabel", js.Any.fromFunction0(value))
      
      inline def setGetContentStyle(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getContentStyle", js.Any.fromFunction0(value))
      
      inline def setGetNavigationNextLabel(value: () => String): Self = StObject.set(x, "getNavigationNextLabel", js.Any.fromFunction0(value))
      
      inline def setGetNavigationPreviousLabel(value: () => String): Self = StObject.set(x, "getNavigationPreviousLabel", js.Any.fromFunction0(value))
      
      inline def setGetZIndex(value: () => String | Null): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      inline def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      inline def setIsScrollable(value: () => Boolean): Self = StObject.set(x, "isScrollable", js.Any.fromFunction0(value))
      
      inline def setNavigationNextExists(value: () => Boolean): Self = StObject.set(x, "navigationNextExists", js.Any.fromFunction0(value))
      
      inline def setNavigationPreviousExists(value: () => Boolean): Self = StObject.set(x, "navigationPreviousExists", js.Any.fromFunction0(value))
    }
  }
}
