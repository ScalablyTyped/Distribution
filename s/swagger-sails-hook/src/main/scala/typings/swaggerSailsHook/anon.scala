package typings.swaggerSailsHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After extends StObject {
    
    /** routes specified in the `after` object will be bound after custom and blueprint routes */
    var after: _empty
  }
  object After {
    
    inline def apply(after: _empty): After = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[After]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: _empty): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    /**
      * This route will match any routes that aren't bound in the app via a custom route configuration
      * or a blueprint.
      */
    @JSName("/*")
    def SlashAsterisk(req: Any, res: Any, next: js.Function0[Any]): Any
  }
  object _empty {
    
    inline def apply(SlashAsterisk: (Any, Any, js.Function0[Any]) => Any): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("/*")(js.Any.fromFunction3(SlashAsterisk))
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def setSlashAsterisk(value: (Any, Any, js.Function0[Any]) => Any): Self = StObject.set(x, "/*", js.Any.fromFunction3(value))
    }
  }
}
