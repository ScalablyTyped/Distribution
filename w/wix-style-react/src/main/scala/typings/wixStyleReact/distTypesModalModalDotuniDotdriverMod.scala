package typings.wixStyleReact

import typings.std.Element
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalModalDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Modal/Modal.uni.driver", "modalUniDriverFactory")
  @js.native
  val modalUniDriverFactory: UniDriverFactory[ModalUniDriver] = js.native
  
  trait ModalUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCloseButton(): js.Promise[Unit]
    
    def clickOnNavigationNext(): js.Promise[Unit]
    
    def clickOnNavigationPrevious(): js.Promise[Unit]
    
    def clickOnOverlay(): js.Promise[Unit]
    
    def closeButtonExists(): js.Promise[Boolean]
    
    def getChildBySelector(selector: String): js.Promise[UniDriver[Any] | Null]
    
    def getContent(): js.Promise[Element]
    
    def getContentLabel(): js.Promise[String | Null]
    
    def getContentStyle(): js.Promise[Any]
    
    def getNavigationNextLabel(): js.Promise[String]
    
    def getNavigationPreviousLabel(): js.Promise[String]
    
    def getZIndex(): js.Promise[Any]
    
    def isOpen(): js.Promise[Boolean]
    
    def isScrollable(): js.Promise[Boolean]
    
    def navigationNextExists(): js.Promise[Boolean]
    
    def navigationPreviousExists(): js.Promise[Boolean]
  }
  object ModalUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnCloseButton: () => js.Promise[Unit],
      clickOnNavigationNext: () => js.Promise[Unit],
      clickOnNavigationPrevious: () => js.Promise[Unit],
      clickOnOverlay: () => js.Promise[Unit],
      closeButtonExists: () => js.Promise[Boolean],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getChildBySelector: String => js.Promise[UniDriver[Any] | Null],
      getContent: () => js.Promise[Element],
      getContentLabel: () => js.Promise[String | Null],
      getContentStyle: () => js.Promise[Any],
      getNavigationNextLabel: () => js.Promise[String],
      getNavigationPreviousLabel: () => js.Promise[String],
      getZIndex: () => js.Promise[Any],
      isOpen: () => js.Promise[Boolean],
      isScrollable: () => js.Promise[Boolean],
      navigationNextExists: () => js.Promise[Boolean],
      navigationPreviousExists: () => js.Promise[Boolean]
    ): ModalUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnCloseButton = js.Any.fromFunction0(clickOnCloseButton), clickOnNavigationNext = js.Any.fromFunction0(clickOnNavigationNext), clickOnNavigationPrevious = js.Any.fromFunction0(clickOnNavigationPrevious), clickOnOverlay = js.Any.fromFunction0(clickOnOverlay), closeButtonExists = js.Any.fromFunction0(closeButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildBySelector = js.Any.fromFunction1(getChildBySelector), getContent = js.Any.fromFunction0(getContent), getContentLabel = js.Any.fromFunction0(getContentLabel), getContentStyle = js.Any.fromFunction0(getContentStyle), getNavigationNextLabel = js.Any.fromFunction0(getNavigationNextLabel), getNavigationPreviousLabel = js.Any.fromFunction0(getNavigationPreviousLabel), getZIndex = js.Any.fromFunction0(getZIndex), isOpen = js.Any.fromFunction0(isOpen), isScrollable = js.Any.fromFunction0(isScrollable), navigationNextExists = js.Any.fromFunction0(navigationNextExists), navigationPreviousExists = js.Any.fromFunction0(navigationPreviousExists))
      __obj.asInstanceOf[ModalUniDriver]
    }
    
    extension [Self <: ModalUniDriver](x: Self) {
      
      inline def setClickOnCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnCloseButton", js.Any.fromFunction0(value))
      
      inline def setClickOnNavigationNext(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnNavigationNext", js.Any.fromFunction0(value))
      
      inline def setClickOnNavigationPrevious(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnNavigationPrevious", js.Any.fromFunction0(value))
      
      inline def setClickOnOverlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnOverlay", js.Any.fromFunction0(value))
      
      inline def setCloseButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "closeButtonExists", js.Any.fromFunction0(value))
      
      inline def setGetChildBySelector(value: String => js.Promise[UniDriver[Any] | Null]): Self = StObject.set(x, "getChildBySelector", js.Any.fromFunction1(value))
      
      inline def setGetContent(value: () => js.Promise[Element]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetContentLabel(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getContentLabel", js.Any.fromFunction0(value))
      
      inline def setGetContentStyle(value: () => js.Promise[Any]): Self = StObject.set(x, "getContentStyle", js.Any.fromFunction0(value))
      
      inline def setGetNavigationNextLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getNavigationNextLabel", js.Any.fromFunction0(value))
      
      inline def setGetNavigationPreviousLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getNavigationPreviousLabel", js.Any.fromFunction0(value))
      
      inline def setGetZIndex(value: () => js.Promise[Any]): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      inline def setIsOpen(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
      
      inline def setIsScrollable(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isScrollable", js.Any.fromFunction0(value))
      
      inline def setNavigationNextExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "navigationNextExists", js.Any.fromFunction0(value))
      
      inline def setNavigationPreviousExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "navigationPreviousExists", js.Any.fromFunction0(value))
    }
  }
}
