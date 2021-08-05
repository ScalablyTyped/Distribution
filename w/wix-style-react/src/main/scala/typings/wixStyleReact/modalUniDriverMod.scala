package typings.wixStyleReact

import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalUniDriverMod {
  
  trait ModalUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCloseButton(): js.Promise[Unit]
    
    def clickOnOverlay(): js.Promise[Unit]
    
    def closeButtonExists(): js.Promise[Boolean]
    
    def getChildBySelector(selector: String): js.Promise[UniDriver[js.Any] | Null]
    
    def getContent(): js.Promise[Element]
    
    def getContentLabel(): js.Promise[String | Null]
    
    def getContentStyle(): js.Promise[js.Any]
    
    def getZIndex(): js.Promise[js.Any]
    
    def isOpen(): js.Promise[Boolean]
    
    def isScrollable(): js.Promise[Boolean]
  }
  object ModalUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnCloseButton: () => js.Promise[Unit],
      clickOnOverlay: () => js.Promise[Unit],
      closeButtonExists: () => js.Promise[Boolean],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getChildBySelector: String => js.Promise[UniDriver[js.Any] | Null],
      getContent: () => js.Promise[Element],
      getContentLabel: () => js.Promise[String | Null],
      getContentStyle: () => js.Promise[js.Any],
      getZIndex: () => js.Promise[js.Any],
      isOpen: () => js.Promise[Boolean],
      isScrollable: () => js.Promise[Boolean]
    ): ModalUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnCloseButton = js.Any.fromFunction0(clickOnCloseButton), clickOnOverlay = js.Any.fromFunction0(clickOnOverlay), closeButtonExists = js.Any.fromFunction0(closeButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildBySelector = js.Any.fromFunction1(getChildBySelector), getContent = js.Any.fromFunction0(getContent), getContentLabel = js.Any.fromFunction0(getContentLabel), getContentStyle = js.Any.fromFunction0(getContentStyle), getZIndex = js.Any.fromFunction0(getZIndex), isOpen = js.Any.fromFunction0(isOpen), isScrollable = js.Any.fromFunction0(isScrollable))
      __obj.asInstanceOf[ModalUniDriver]
    }
    
    extension [Self <: ModalUniDriver](x: Self) {
      
      inline def setClickOnCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnCloseButton", js.Any.fromFunction0(value))
      
      inline def setClickOnOverlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnOverlay", js.Any.fromFunction0(value))
      
      inline def setCloseButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "closeButtonExists", js.Any.fromFunction0(value))
      
      inline def setGetChildBySelector(value: String => js.Promise[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: () => js.Promise[Element]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetContentLabel(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getContentLabel", js.Any.fromFunction0(value))
      
      inline def setGetContentStyle(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getContentStyle", js.Any.fromFunction0(value))
      
      inline def setGetZIndex(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      inline def setIsOpen(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      inline def setIsScrollable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isScrollable", js.Any.fromFunction0(value))
    }
  }
}
