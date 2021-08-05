package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagListUniDriverMod {
  
  trait TagListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def actionButtonExists(): js.Promise[Boolean]
    
    def actionButtonLabel(): js.Promise[String]
    
    def clickActionButton(): js.Promise[Unit]
    
    def clickToggleMoreButton(): js.Promise[Unit]
    
    def removeTag(id: String): js.Promise[Unit]
    
    def toggleMoreButtonExists(): js.Promise[Boolean]
    
    def toggleMoreButtonLabel(): js.Promise[String]
  }
  object TagListUniDriver {
    
    inline def apply(
      actionButtonExists: () => js.Promise[Boolean],
      actionButtonLabel: () => js.Promise[String],
      click: () => js.Promise[Unit],
      clickActionButton: () => js.Promise[Unit],
      clickToggleMoreButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      removeTag: String => js.Promise[Unit],
      toggleMoreButtonExists: () => js.Promise[Boolean],
      toggleMoreButtonLabel: () => js.Promise[String]
    ): TagListUniDriver = {
      val __obj = js.Dynamic.literal(actionButtonExists = js.Any.fromFunction0(actionButtonExists), actionButtonLabel = js.Any.fromFunction0(actionButtonLabel), click = js.Any.fromFunction0(click), clickActionButton = js.Any.fromFunction0(clickActionButton), clickToggleMoreButton = js.Any.fromFunction0(clickToggleMoreButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), removeTag = js.Any.fromFunction1(removeTag), toggleMoreButtonExists = js.Any.fromFunction0(toggleMoreButtonExists), toggleMoreButtonLabel = js.Any.fromFunction0(toggleMoreButtonLabel))
      __obj.asInstanceOf[TagListUniDriver]
    }
    
    extension [Self <: TagListUniDriver](x: Self) {
      
      inline def setActionButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "actionButtonExists", js.Any.fromFunction0(value))
      
      inline def setActionButtonLabel(value: () => js.Promise[String]): Self = StObject.set(x, "actionButtonLabel", js.Any.fromFunction0(value))
      
      inline def setClickActionButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickActionButton", js.Any.fromFunction0(value))
      
      inline def setClickToggleMoreButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickToggleMoreButton", js.Any.fromFunction0(value))
      
      inline def setRemoveTag(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeTag", js.Any.fromFunction1(value))
      
      inline def setToggleMoreButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "toggleMoreButtonExists", js.Any.fromFunction0(value))
      
      inline def setToggleMoreButtonLabel(value: () => js.Promise[String]): Self = StObject.set(x, "toggleMoreButtonLabel", js.Any.fromFunction0(value))
    }
  }
}
