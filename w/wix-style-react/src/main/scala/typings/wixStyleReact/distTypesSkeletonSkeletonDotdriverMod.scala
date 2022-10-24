package typings.wixStyleReact

import typings.wixStyleReact.distTypesSkeletonMod.SkeletonAlignment
import typings.wixStyleReact.distTypesSkeletonMod.SkeletonContentSize
import typings.wixStyleReact.distTypesSkeletonMod.SkeletonSpacing
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonSkeletonDotdriverMod {
  
  trait SkeletonDriver
    extends StObject
       with BaseDriver {
    
    def getNumLines(): Double
    
    def hasAlignment(alignment: SkeletonAlignment): Boolean
    
    def hasSizes(sizes: SkeletonContentSize): Boolean
    
    def hasSpacing(spacing: SkeletonSpacing): Boolean
  }
  object SkeletonDriver {
    
    inline def apply(
      exists: () => Boolean,
      getNumLines: () => Double,
      hasAlignment: SkeletonAlignment => Boolean,
      hasSizes: SkeletonContentSize => Boolean,
      hasSpacing: SkeletonSpacing => Boolean
    ): SkeletonDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getNumLines = js.Any.fromFunction0(getNumLines), hasAlignment = js.Any.fromFunction1(hasAlignment), hasSizes = js.Any.fromFunction1(hasSizes), hasSpacing = js.Any.fromFunction1(hasSpacing))
      __obj.asInstanceOf[SkeletonDriver]
    }
    
    extension [Self <: SkeletonDriver](x: Self) {
      
      inline def setGetNumLines(value: () => Double): Self = StObject.set(x, "getNumLines", js.Any.fromFunction0(value))
      
      inline def setHasAlignment(value: SkeletonAlignment => Boolean): Self = StObject.set(x, "hasAlignment", js.Any.fromFunction1(value))
      
      inline def setHasSizes(value: SkeletonContentSize => Boolean): Self = StObject.set(x, "hasSizes", js.Any.fromFunction1(value))
      
      inline def setHasSpacing(value: SkeletonSpacing => Boolean): Self = StObject.set(x, "hasSpacing", js.Any.fromFunction1(value))
    }
  }
}
