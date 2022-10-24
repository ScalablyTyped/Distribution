package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionTransitionDotuniDotdriverMod {
  
  trait TransitionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def hasAnimationStarted(): js.Promise[Boolean]
  }
  object TransitionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      hasAnimationStarted: () => js.Promise[Boolean]
    ): TransitionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), hasAnimationStarted = js.Any.fromFunction0(hasAnimationStarted))
      __obj.asInstanceOf[TransitionUniDriver]
    }
    
    extension [Self <: TransitionUniDriver](x: Self) {
      
      inline def setHasAnimationStarted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasAnimationStarted", js.Any.fromFunction0(value))
    }
  }
}
