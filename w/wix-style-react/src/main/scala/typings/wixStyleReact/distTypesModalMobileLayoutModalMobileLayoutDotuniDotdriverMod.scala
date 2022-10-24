package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalMobileLayoutModalMobileLayoutDotuniDotdriverMod {
  
  trait ModalMobileLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickOverlay(): js.Promise[Unit]
    
    def closeButtonExists(): js.Promise[Boolean]
    
    def getContent(): UniDriver[Any]
    
    def getFooter(): UniDriver[Any]
    
    def getTitle(): UniDriver[Any]
  }
  object ModalMobileLayoutUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickOverlay: () => js.Promise[Unit],
      closeButtonExists: () => js.Promise[Boolean],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getContent: () => UniDriver[Any],
      getFooter: () => UniDriver[Any],
      getTitle: () => UniDriver[Any]
    ): ModalMobileLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickOverlay = js.Any.fromFunction0(clickOverlay), closeButtonExists = js.Any.fromFunction0(closeButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getFooter = js.Any.fromFunction0(getFooter), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[ModalMobileLayoutUniDriver]
    }
    
    extension [Self <: ModalMobileLayoutUniDriver](x: Self) {
      
      inline def setClickCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
      
      inline def setClickOverlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOverlay", js.Any.fromFunction0(value))
      
      inline def setCloseButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "closeButtonExists", js.Any.fromFunction0(value))
      
      inline def setGetContent(value: () => UniDriver[Any]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetFooter(value: () => UniDriver[Any]): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => UniDriver[Any]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
