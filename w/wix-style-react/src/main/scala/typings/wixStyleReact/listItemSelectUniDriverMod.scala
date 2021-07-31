package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSelectUniDriverMod {
  
  trait ListItemSelectUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getPrefix(): js.Promise[BaseUniDriver]
    
    def getSubtitle(): js.Promise[String]
    
    def getSuffix(): js.Promise[BaseUniDriver]
    
    def getTitle(): js.Promise[String]
    
    def hasCheckbox(): js.Promise[Boolean]
  }
  object ListItemSelectUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getPrefix: () => js.Promise[BaseUniDriver],
      getSubtitle: () => js.Promise[String],
      getSuffix: () => js.Promise[BaseUniDriver],
      getTitle: () => js.Promise[String],
      hasCheckbox: () => js.Promise[Boolean]
    ): ListItemSelectUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPrefix = js.Any.fromFunction0(getPrefix), getSubtitle = js.Any.fromFunction0(getSubtitle), getSuffix = js.Any.fromFunction0(getSuffix), getTitle = js.Any.fromFunction0(getTitle), hasCheckbox = js.Any.fromFunction0(hasCheckbox))
      __obj.asInstanceOf[ListItemSelectUniDriver]
    }
    
    @scala.inline
    implicit class ListItemSelectUniDriverMutableBuilder[Self <: ListItemSelectUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPrefix(value: () => js.Promise[BaseUniDriver]): Self = StObject.set(x, "getPrefix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubtitle(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSuffix(value: () => js.Promise[BaseUniDriver]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasCheckbox(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasCheckbox", js.Any.fromFunction0(value))
    }
  }
}
