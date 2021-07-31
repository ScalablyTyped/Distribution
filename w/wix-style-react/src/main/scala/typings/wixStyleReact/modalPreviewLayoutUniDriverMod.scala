package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalPreviewLayoutUniDriverMod {
  
  trait ModalPreviewLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickClose(): js.Promise[Unit]
    
    def clickOverlay(): js.Promise[Unit]
    
    def getPreviewActions(): UniDriver[js.Any]
    
    def getPreviewContent(): UniDriver[js.Any]
    
    def getPreviewTitle(): UniDriver[js.Any]
  }
  object ModalPreviewLayoutUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickClose: () => js.Promise[Unit],
      clickOverlay: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getPreviewActions: () => UniDriver[js.Any],
      getPreviewContent: () => UniDriver[js.Any],
      getPreviewTitle: () => UniDriver[js.Any]
    ): ModalPreviewLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickClose = js.Any.fromFunction0(clickClose), clickOverlay = js.Any.fromFunction0(clickOverlay), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPreviewActions = js.Any.fromFunction0(getPreviewActions), getPreviewContent = js.Any.fromFunction0(getPreviewContent), getPreviewTitle = js.Any.fromFunction0(getPreviewTitle))
      __obj.asInstanceOf[ModalPreviewLayoutUniDriver]
    }
    
    @scala.inline
    implicit class ModalPreviewLayoutUniDriverMutableBuilder[Self <: ModalPreviewLayoutUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOverlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOverlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviewActions(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getPreviewActions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviewContent(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getPreviewContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviewTitle(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getPreviewTitle", js.Any.fromFunction0(value))
    }
  }
}
