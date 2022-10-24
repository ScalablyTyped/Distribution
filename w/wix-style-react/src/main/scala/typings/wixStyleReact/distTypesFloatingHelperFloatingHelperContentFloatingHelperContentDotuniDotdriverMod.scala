package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.horizontal
import typings.wixStyleReact.wixStyleReactStrings.vertical
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperContentFloatingHelperContentDotuniDotdriverMod {
  
  trait FloatingHelperContentUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickActionButton(): js.Promise[Unit]
    
    def getActionButtonText(): js.Promise[String]
    
    def getBodyContent(): js.Promise[String]
    
    def getDirection(): js.Promise[horizontal | vertical]
    
    def getFooter(): js.Promise[HTMLElement]
    
    def getImage(): js.Promise[HTMLElement]
    
    def getTitleContent(): js.Promise[String]
    
    def hasActionButton(): js.Promise[Boolean]
    
    def hasBody(): js.Promise[Boolean]
    
    def hasFooter(): js.Promise[Boolean]
    
    def hasImage(): js.Promise[Boolean]
    
    def hasTitle(): js.Promise[Boolean]
  }
  object FloatingHelperContentUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickActionButton: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getActionButtonText: () => js.Promise[String],
      getBodyContent: () => js.Promise[String],
      getDirection: () => js.Promise[horizontal | vertical],
      getFooter: () => js.Promise[HTMLElement],
      getImage: () => js.Promise[HTMLElement],
      getTitleContent: () => js.Promise[String],
      hasActionButton: () => js.Promise[Boolean],
      hasBody: () => js.Promise[Boolean],
      hasFooter: () => js.Promise[Boolean],
      hasImage: () => js.Promise[Boolean],
      hasTitle: () => js.Promise[Boolean]
    ): FloatingHelperContentUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickActionButton = js.Any.fromFunction0(clickActionButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getActionButtonText = js.Any.fromFunction0(getActionButtonText), getBodyContent = js.Any.fromFunction0(getBodyContent), getDirection = js.Any.fromFunction0(getDirection), getFooter = js.Any.fromFunction0(getFooter), getImage = js.Any.fromFunction0(getImage), getTitleContent = js.Any.fromFunction0(getTitleContent), hasActionButton = js.Any.fromFunction0(hasActionButton), hasBody = js.Any.fromFunction0(hasBody), hasFooter = js.Any.fromFunction0(hasFooter), hasImage = js.Any.fromFunction0(hasImage), hasTitle = js.Any.fromFunction0(hasTitle))
      __obj.asInstanceOf[FloatingHelperContentUniDriver]
    }
    
    extension [Self <: FloatingHelperContentUniDriver](x: Self) {
      
      inline def setClickActionButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickActionButton", js.Any.fromFunction0(value))
      
      inline def setGetActionButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getActionButtonText", js.Any.fromFunction0(value))
      
      inline def setGetBodyContent(value: () => js.Promise[String]): Self = StObject.set(x, "getBodyContent", js.Any.fromFunction0(value))
      
      inline def setGetDirection(value: () => js.Promise[horizontal | vertical]): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetFooter(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
      
      inline def setGetImage(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
      
      inline def setGetTitleContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleContent", js.Any.fromFunction0(value))
      
      inline def setHasActionButton(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasActionButton", js.Any.fromFunction0(value))
      
      inline def setHasBody(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasBody", js.Any.fromFunction0(value))
      
      inline def setHasFooter(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasFooter", js.Any.fromFunction0(value))
      
      inline def setHasImage(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasImage", js.Any.fromFunction0(value))
      
      inline def setHasTitle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTitle", js.Any.fromFunction0(value))
    }
  }
}
