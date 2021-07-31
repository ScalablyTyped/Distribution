package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSectionUniDriverMod {
  
  trait ListItemSectionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSuffix(): js.Promise[BaseUniDriver]
    
    def getTitle(): js.Promise[String]
  }
  object ListItemSectionUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getSuffix: () => js.Promise[BaseUniDriver],
      getTitle: () => js.Promise[String]
    ): ListItemSectionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSuffix = js.Any.fromFunction0(getSuffix), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[ListItemSectionUniDriver]
    }
    
    @scala.inline
    implicit class ListItemSectionUniDriverMutableBuilder[Self <: ListItemSectionUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSuffix(value: () => js.Promise[BaseUniDriver]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
