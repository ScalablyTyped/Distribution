package typings.testingLibraryReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@testing-library/react-hooks.@testing-library/react-hooks.WaitOptions, 'timeout'> */
  trait PickWaitOptionstimeout extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PickWaitOptionstimeout {
    
    inline def apply(): PickWaitOptionstimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickWaitOptionstimeout]
    }
    
    extension [Self <: PickWaitOptionstimeout](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@testing-library/react-hooks.@testing-library/react-hooks.WaitOptions, 'timeout' | 'suppressErrors'> */
  trait PickWaitOptionstimeoutsup extends StObject {
    
    var suppressErrors: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PickWaitOptionstimeoutsup {
    
    inline def apply(): PickWaitOptionstimeoutsup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickWaitOptionstimeoutsup]
    }
    
    extension [Self <: PickWaitOptionstimeoutsup](x: Self) {
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
