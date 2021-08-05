package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.emptyStateMod.EmptyStateAlign
import typings.wixStyleReact.emptyStateMod.EmptyStateTheme
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyStateDriverMod {
  
  trait EmptyStateDriver
    extends StObject
       with BaseDriver {
    
    def childrenContentExists(): Boolean
    
    def element(): HTMLElement
    
    def getImageContainerClassName(): String
    
    def getImageUrl(): String
    
    def getSubtitleText(): String
    
    def getTitleText(): String
    
    def hasAlign(align: EmptyStateAlign): Boolean
    
    def hasTheme(themeName: EmptyStateTheme): Boolean
    
    def imageNodeExists(): Boolean
  }
  object EmptyStateDriver {
    
    inline def apply(
      childrenContentExists: () => Boolean,
      element: () => HTMLElement,
      exists: () => Boolean,
      getImageContainerClassName: () => String,
      getImageUrl: () => String,
      getSubtitleText: () => String,
      getTitleText: () => String,
      hasAlign: EmptyStateAlign => Boolean,
      hasTheme: EmptyStateTheme => Boolean,
      imageNodeExists: () => Boolean
    ): EmptyStateDriver = {
      val __obj = js.Dynamic.literal(childrenContentExists = js.Any.fromFunction0(childrenContentExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getImageContainerClassName = js.Any.fromFunction0(getImageContainerClassName), getImageUrl = js.Any.fromFunction0(getImageUrl), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTitleText = js.Any.fromFunction0(getTitleText), hasAlign = js.Any.fromFunction1(hasAlign), hasTheme = js.Any.fromFunction1(hasTheme), imageNodeExists = js.Any.fromFunction0(imageNodeExists))
      __obj.asInstanceOf[EmptyStateDriver]
    }
    
    extension [Self <: EmptyStateDriver](x: Self) {
      
      inline def setChildrenContentExists(value: () => Boolean): Self = StObject.set(x, "childrenContentExists", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => HTMLElement): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetImageContainerClassName(value: () => String): Self = StObject.set(x, "getImageContainerClassName", js.Any.fromFunction0(value))
      
      inline def setGetImageUrl(value: () => String): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
      
      inline def setGetSubtitleText(value: () => String): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      inline def setGetTitleText(value: () => String): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      inline def setHasAlign(value: EmptyStateAlign => Boolean): Self = StObject.set(x, "hasAlign", js.Any.fromFunction1(value))
      
      inline def setHasTheme(value: EmptyStateTheme => Boolean): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      inline def setImageNodeExists(value: () => Boolean): Self = StObject.set(x, "imageNodeExists", js.Any.fromFunction0(value))
    }
  }
}
