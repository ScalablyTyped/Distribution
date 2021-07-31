package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMobileLayoutUniDriverMod {
  
  trait ModalMobileLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickOverlay(): js.Promise[Unit]
    
    def closeButtonExists(): js.Promise[Boolean]
    
    def getContent(): UniDriver[js.Any]
    
    def getFooter(): UniDriver[js.Any]
    
    def getTitle(): UniDriver[js.Any]
  }
  object ModalMobileLayoutUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickOverlay: () => js.Promise[Unit],
      closeButtonExists: () => js.Promise[Boolean],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContent: () => UniDriver[js.Any],
      getFooter: () => UniDriver[js.Any],
      getTitle: () => UniDriver[js.Any]
    ): ModalMobileLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickOverlay = js.Any.fromFunction0(clickOverlay), closeButtonExists = js.Any.fromFunction0(closeButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getFooter = js.Any.fromFunction0(getFooter), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[ModalMobileLayoutUniDriver]
    }
    
    @scala.inline
    implicit class ModalMobileLayoutUniDriverMutableBuilder[Self <: ModalMobileLayoutUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickCloseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOverlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOverlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "closeButtonExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContent(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFooter(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
