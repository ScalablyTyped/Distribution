package typings.wixStyleReact

import typings.wixStyleReact.distTypesSkeletonMod.SkeletonAlignment
import typings.wixStyleReact.distTypesSkeletonMod.SkeletonContentSize
import typings.wixStyleReact.distTypesSkeletonMod.SkeletonSpacing
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonSkeletonDotuniDotdriverMod {
  
  trait SkeletonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getNumLines(): js.Promise[Double]
    
    def hasAlignment(alignment: SkeletonAlignment): js.Promise[Boolean]
    
    def hasSizes(sizes: SkeletonContentSize): js.Promise[Boolean]
    
    def hasSpacing(spacing: SkeletonSpacing): js.Promise[Boolean]
  }
  object SkeletonUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getNumLines: () => js.Promise[Double],
      hasAlignment: SkeletonAlignment => js.Promise[Boolean],
      hasSizes: SkeletonContentSize => js.Promise[Boolean],
      hasSpacing: SkeletonSpacing => js.Promise[Boolean]
    ): SkeletonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getNumLines = js.Any.fromFunction0(getNumLines), hasAlignment = js.Any.fromFunction1(hasAlignment), hasSizes = js.Any.fromFunction1(hasSizes), hasSpacing = js.Any.fromFunction1(hasSpacing))
      __obj.asInstanceOf[SkeletonUniDriver]
    }
    
    extension [Self <: SkeletonUniDriver](x: Self) {
      
      inline def setGetNumLines(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumLines", js.Any.fromFunction0(value))
      
      inline def setHasAlignment(value: SkeletonAlignment => js.Promise[Boolean]): Self = StObject.set(x, "hasAlignment", js.Any.fromFunction1(value))
      
      inline def setHasSizes(value: SkeletonContentSize => js.Promise[Boolean]): Self = StObject.set(x, "hasSizes", js.Any.fromFunction1(value))
      
      inline def setHasSpacing(value: SkeletonSpacing => js.Promise[Boolean]): Self = StObject.set(x, "hasSpacing", js.Any.fromFunction1(value))
    }
  }
}
