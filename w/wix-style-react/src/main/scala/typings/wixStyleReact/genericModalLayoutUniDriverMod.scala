package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericModalLayoutUniDriverMod {
  
  trait GenericModalLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def isFullscreen(): js.Promise[Boolean]
  }
  object GenericModalLayoutUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      isFullscreen: () => js.Promise[Boolean]
    ): GenericModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), isFullscreen = js.Any.fromFunction0(isFullscreen))
      __obj.asInstanceOf[GenericModalLayoutUniDriver]
    }
    
    extension [Self <: GenericModalLayoutUniDriver](x: Self) {
      
      inline def setIsFullscreen(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFullscreen", js.Any.fromFunction0(value))
    }
  }
}
