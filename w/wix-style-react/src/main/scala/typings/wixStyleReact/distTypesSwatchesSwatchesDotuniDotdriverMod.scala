package typings.wixStyleReact

import typings.wixStyleReact.distTypesFillPreviewFillPreviewDotuniDotdriverMod.FillPreviewUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSwatchesSwatchesDotuniDotdriverMod {
  
  trait SwatchesUniDriver
    extends StObject
       with BaseUniDriver {
    
    def addButtonExists(): js.Promise[Boolean]
    
    def clickEmptySwatch(): js.Promise[Unit]
    
    def getSwatch(index: Double): js.Promise[FillPreviewUniDriver]
    
    def getSwatchCount(): js.Promise[Double]
    
    def isEmptySwatchSelected(): js.Promise[Boolean]
    
    def isSwatchSelectedAt(index: Double): js.Promise[Boolean]
  }
  object SwatchesUniDriver {
    
    inline def apply(
      addButtonExists: () => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickEmptySwatch: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSwatch: Double => js.Promise[FillPreviewUniDriver],
      getSwatchCount: () => js.Promise[Double],
      isEmptySwatchSelected: () => js.Promise[Boolean],
      isSwatchSelectedAt: Double => js.Promise[Boolean]
    ): SwatchesUniDriver = {
      val __obj = js.Dynamic.literal(addButtonExists = js.Any.fromFunction0(addButtonExists), click = js.Any.fromFunction0(click), clickEmptySwatch = js.Any.fromFunction0(clickEmptySwatch), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSwatch = js.Any.fromFunction1(getSwatch), getSwatchCount = js.Any.fromFunction0(getSwatchCount), isEmptySwatchSelected = js.Any.fromFunction0(isEmptySwatchSelected), isSwatchSelectedAt = js.Any.fromFunction1(isSwatchSelectedAt))
      __obj.asInstanceOf[SwatchesUniDriver]
    }
    
    extension [Self <: SwatchesUniDriver](x: Self) {
      
      inline def setAddButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "addButtonExists", js.Any.fromFunction0(value))
      
      inline def setClickEmptySwatch(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickEmptySwatch", js.Any.fromFunction0(value))
      
      inline def setGetSwatch(value: Double => js.Promise[FillPreviewUniDriver]): Self = StObject.set(x, "getSwatch", js.Any.fromFunction1(value))
      
      inline def setGetSwatchCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getSwatchCount", js.Any.fromFunction0(value))
      
      inline def setIsEmptySwatchSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isEmptySwatchSelected", js.Any.fromFunction0(value))
      
      inline def setIsSwatchSelectedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSwatchSelectedAt", js.Any.fromFunction1(value))
    }
  }
}
