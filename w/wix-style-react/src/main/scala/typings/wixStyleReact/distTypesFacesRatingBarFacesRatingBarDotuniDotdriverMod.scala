package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFacesRatingBarFacesRatingBarDotuniDotdriverMod {
  
  trait FacesRatingBarUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSelectedRating(): js.Promise[Double]
    
    def selectRating(): js.Promise[Unit]
  }
  object FacesRatingBarUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSelectedRating: () => js.Promise[Double],
      selectRating: () => js.Promise[Unit]
    ): FacesRatingBarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSelectedRating = js.Any.fromFunction0(getSelectedRating), selectRating = js.Any.fromFunction0(selectRating))
      __obj.asInstanceOf[FacesRatingBarUniDriver]
    }
    
    extension [Self <: FacesRatingBarUniDriver](x: Self) {
      
      inline def setGetSelectedRating(value: () => js.Promise[Double]): Self = StObject.set(x, "getSelectedRating", js.Any.fromFunction0(value))
      
      inline def setSelectRating(value: () => js.Promise[Unit]): Self = StObject.set(x, "selectRating", js.Any.fromFunction0(value))
    }
  }
}
