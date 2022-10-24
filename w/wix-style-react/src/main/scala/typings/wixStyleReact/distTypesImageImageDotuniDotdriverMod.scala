package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageImageDotuniDotdriverMod {
  
  trait ImageUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isTransparent(): js.Promise[Boolean]
  }
  object ImageUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      isTransparent: () => js.Promise[Boolean]
    ): ImageUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isTransparent = js.Any.fromFunction0(isTransparent))
      __obj.asInstanceOf[ImageUniDriver]
    }
    
    extension [Self <: ImageUniDriver](x: Self) {
      
      inline def setIsTransparent(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTransparent", js.Any.fromFunction0(value))
    }
  }
}
