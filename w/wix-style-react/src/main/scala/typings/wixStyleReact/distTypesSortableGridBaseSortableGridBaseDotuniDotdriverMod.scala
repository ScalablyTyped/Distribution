package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortableGridBaseSortableGridBaseDotuniDotdriverMod {
  
  trait SortableGridBaseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def endFixedElementExists(): js.Promise[Boolean]
    
    def startFixedElementExists(): js.Promise[Boolean]
  }
  object SortableGridBaseUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      endFixedElementExists: () => js.Promise[Boolean],
      exists: () => js.Promise[Boolean],
      startFixedElementExists: () => js.Promise[Boolean]
    ): SortableGridBaseUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), endFixedElementExists = js.Any.fromFunction0(endFixedElementExists), exists = js.Any.fromFunction0(exists), startFixedElementExists = js.Any.fromFunction0(startFixedElementExists))
      __obj.asInstanceOf[SortableGridBaseUniDriver]
    }
    
    extension [Self <: SortableGridBaseUniDriver](x: Self) {
      
      inline def setEndFixedElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "endFixedElementExists", js.Any.fromFunction0(value))
      
      inline def setStartFixedElementExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "startFixedElementExists", js.Any.fromFunction0(value))
    }
  }
}
