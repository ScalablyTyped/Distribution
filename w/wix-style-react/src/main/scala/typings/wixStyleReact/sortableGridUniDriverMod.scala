package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortableGridUniDriverMod {
  
  trait SortableGridUniDriver
    extends StObject
       with BaseUniDriver {
    
    def endFixedElementExists(): js.Promise[Boolean]
    
    def startFixedElementExists(): js.Promise[Boolean]
  }
  object SortableGridUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      endFixedElementExists: () => js.Promise[Boolean],
      exists: () => js.Promise[Boolean],
      startFixedElementExists: () => js.Promise[Boolean]
    ): SortableGridUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), endFixedElementExists = js.Any.fromFunction0(endFixedElementExists), exists = js.Any.fromFunction0(exists), startFixedElementExists = js.Any.fromFunction0(startFixedElementExists))
      __obj.asInstanceOf[SortableGridUniDriver]
    }
    
    extension [Self <: SortableGridUniDriver](x: Self) {
      
      inline def setEndFixedElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "endFixedElementExists", js.Any.fromFunction0(value))
      
      inline def setStartFixedElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "startFixedElementExists", js.Any.fromFunction0(value))
    }
  }
}
