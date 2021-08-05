package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contactItemBuilderUniDriverMod {
  
  trait ContactItemBuilderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSubtitle(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object ContactItemBuilderUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getSubtitle: () => js.Promise[String],
      getTitle: () => js.Promise[String]
    ): ContactItemBuilderUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[ContactItemBuilderUniDriver]
    }
    
    extension [Self <: ContactItemBuilderUniDriver](x: Self) {
      
      inline def setGetSubtitle(value: () => js.Promise[String]): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
