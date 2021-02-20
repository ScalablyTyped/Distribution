package typings.swaggerSailsHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait After extends StObject {
    
    /** routes specified in the `after` object will be bound after custom and blueprint routes */
    var after: _empty = js.native
  }
  object After {
    
    @scala.inline
    def apply(after: _empty): After = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: _empty): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    /**
      * This route will match any routes that aren't bound in the app via a custom route configuration
      * or a blueprint.
      */
    @JSName("/*")
    def SlashAsterisk(req: js.Any, res: js.Any, next: js.Function0[_]): js.Any = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(SlashAsterisk: (js.Any, js.Any, js.Function0[_]) => js.Any): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("/*")(js.Any.fromFunction3(SlashAsterisk))
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlashAsterisk(value: (js.Any, js.Any, js.Function0[_]) => js.Any): Self = StObject.set(x, "/*", js.Any.fromFunction3(value))
    }
  }
}
