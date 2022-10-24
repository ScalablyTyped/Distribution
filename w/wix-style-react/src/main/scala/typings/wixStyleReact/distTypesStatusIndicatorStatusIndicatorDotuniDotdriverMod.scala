package typings.wixStyleReact

import typings.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorState
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatusIndicatorStatusIndicatorDotuniDotdriverMod {
  
  trait StatusIndicatorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getMessage(): js.Promise[String]
    
    def getStatus(): js.Promise[StatusIndicatorState]
    
    def hasMessage(): js.Promise[Boolean]
  }
  object StatusIndicatorUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getMessage: () => js.Promise[String],
      getStatus: () => js.Promise[StatusIndicatorState],
      hasMessage: () => js.Promise[Boolean]
    ): StatusIndicatorUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getMessage = js.Any.fromFunction0(getMessage), getStatus = js.Any.fromFunction0(getStatus), hasMessage = js.Any.fromFunction0(hasMessage))
      __obj.asInstanceOf[StatusIndicatorUniDriver]
    }
    
    extension [Self <: StatusIndicatorUniDriver](x: Self) {
      
      inline def setGetMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
      
      inline def setGetStatus(value: () => js.Promise[StatusIndicatorState]): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      inline def setHasMessage(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasMessage", js.Any.fromFunction0(value))
    }
  }
}
