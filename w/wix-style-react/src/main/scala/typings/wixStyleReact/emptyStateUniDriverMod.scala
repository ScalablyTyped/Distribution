package typings.wixStyleReact

import typings.wixStyleReact.emptyStateMod.EmptyStateAlign
import typings.wixStyleReact.emptyStateMod.EmptyStateTheme
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyStateUniDriverMod {
  
  trait EmptyStateUniDriver
    extends StObject
       with BaseUniDriver {
    
    def childrenContentExists(): js.Promise[Boolean]
    
    def getImageContainerClassName(): js.Promise[js.Any]
    
    def getImageUrl(): js.Function1[/* name */ String, js.Promise[String]]
    
    def getSubtitleText(): js.Promise[String]
    
    def getTitleText(): js.Promise[String]
    
    def hasAlign(align: EmptyStateAlign): js.Promise[Boolean]
    
    def hasTheme(themeName: EmptyStateTheme): js.Promise[Boolean]
    
    def imageNodeExists(): js.Promise[Boolean]
  }
  object EmptyStateUniDriver {
    
    @scala.inline
    def apply(
      childrenContentExists: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getImageContainerClassName: () => js.Promise[js.Any],
      getImageUrl: () => js.Function1[/* name */ String, js.Promise[String]],
      getSubtitleText: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      hasAlign: EmptyStateAlign => js.Promise[Boolean],
      hasTheme: EmptyStateTheme => js.Promise[Boolean],
      imageNodeExists: () => js.Promise[Boolean]
    ): EmptyStateUniDriver = {
      val __obj = js.Dynamic.literal(childrenContentExists = js.Any.fromFunction0(childrenContentExists), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getImageContainerClassName = js.Any.fromFunction0(getImageContainerClassName), getImageUrl = js.Any.fromFunction0(getImageUrl), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTitleText = js.Any.fromFunction0(getTitleText), hasAlign = js.Any.fromFunction1(hasAlign), hasTheme = js.Any.fromFunction1(hasTheme), imageNodeExists = js.Any.fromFunction0(imageNodeExists))
      __obj.asInstanceOf[EmptyStateUniDriver]
    }
    
    @scala.inline
    implicit class EmptyStateUniDriverMutableBuilder[Self <: EmptyStateUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenContentExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "childrenContentExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImageContainerClassName(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getImageContainerClassName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImageUrl(value: () => js.Function1[/* name */ String, js.Promise[String]]): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubtitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleText(value: () => js.Promise[String]): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasAlign(value: EmptyStateAlign => js.Promise[Boolean]): Self = StObject.set(x, "hasAlign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasTheme(value: EmptyStateTheme => js.Promise[Boolean]): Self = StObject.set(x, "hasTheme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImageNodeExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "imageNodeExists", js.Any.fromFunction0(value))
    }
  }
}
