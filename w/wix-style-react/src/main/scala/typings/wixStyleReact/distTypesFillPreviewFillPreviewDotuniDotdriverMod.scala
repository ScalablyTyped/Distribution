package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillPreviewFillPreviewDotuniDotdriverMod {
  
  trait FillPreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isSelected(): js.Promise[Boolean]
  }
  object FillPreviewUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      isSelected: () => js.Promise[Boolean]
    ): FillPreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isSelected = js.Any.fromFunction0(isSelected))
      __obj.asInstanceOf[FillPreviewUniDriver]
    }
    
    extension [Self <: FillPreviewUniDriver](x: Self) {
      
      inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    }
  }
}
