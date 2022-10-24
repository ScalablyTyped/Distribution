package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalPreviewLayoutModalPreviewLayoutDotuniDotdriverMod {
  
  trait ModalPreviewLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickClose(): js.Promise[Unit]
    
    def clickOverlay(): js.Promise[Unit]
    
    def getPreviewActions(): UniDriver[Any]
    
    def getPreviewContent(): UniDriver[Any]
    
    def getPreviewTitle(): UniDriver[Any]
  }
  object ModalPreviewLayoutUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickClose: () => js.Promise[Unit],
      clickOverlay: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getPreviewActions: () => UniDriver[Any],
      getPreviewContent: () => UniDriver[Any],
      getPreviewTitle: () => UniDriver[Any]
    ): ModalPreviewLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickClose = js.Any.fromFunction0(clickClose), clickOverlay = js.Any.fromFunction0(clickOverlay), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPreviewActions = js.Any.fromFunction0(getPreviewActions), getPreviewContent = js.Any.fromFunction0(getPreviewContent), getPreviewTitle = js.Any.fromFunction0(getPreviewTitle))
      __obj.asInstanceOf[ModalPreviewLayoutUniDriver]
    }
    
    extension [Self <: ModalPreviewLayoutUniDriver](x: Self) {
      
      inline def setClickClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickClose", js.Any.fromFunction0(value))
      
      inline def setClickOverlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOverlay", js.Any.fromFunction0(value))
      
      inline def setGetPreviewActions(value: () => UniDriver[Any]): Self = StObject.set(x, "getPreviewActions", js.Any.fromFunction0(value))
      
      inline def setGetPreviewContent(value: () => UniDriver[Any]): Self = StObject.set(x, "getPreviewContent", js.Any.fromFunction0(value))
      
      inline def setGetPreviewTitle(value: () => UniDriver[Any]): Self = StObject.set(x, "getPreviewTitle", js.Any.fromFunction0(value))
    }
  }
}
