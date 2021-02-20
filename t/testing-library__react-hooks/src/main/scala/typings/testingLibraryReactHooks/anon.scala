package typings.testingLibraryReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@testing-library/react-hooks.@testing-library/react-hooks.WaitOptions, 'timeout'> */
  @js.native
  trait PickWaitOptionstimeout extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object PickWaitOptionstimeout {
    
    @scala.inline
    def apply(): PickWaitOptionstimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickWaitOptionstimeout]
    }
    
    @scala.inline
    implicit class PickWaitOptionstimeoutMutableBuilder[Self <: PickWaitOptionstimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@testing-library/react-hooks.@testing-library/react-hooks.WaitOptions, 'timeout' | 'suppressErrors'> */
  @js.native
  trait PickWaitOptionstimeoutsup extends StObject {
    
    var suppressErrors: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object PickWaitOptionstimeoutsup {
    
    @scala.inline
    def apply(): PickWaitOptionstimeoutsup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickWaitOptionstimeoutsup]
    }
    
    @scala.inline
    implicit class PickWaitOptionstimeoutsupMutableBuilder[Self <: PickWaitOptionstimeoutsup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
