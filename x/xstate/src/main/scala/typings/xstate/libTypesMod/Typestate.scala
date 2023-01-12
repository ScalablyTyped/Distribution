package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typestate[TContext] extends StObject {
  
  var context: TContext
  
  var value: StateValue
}
object Typestate {
  
  inline def apply[TContext](context: TContext, value: StateValue): Typestate[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typestate[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typestate[?], TContext] (val x: Self & Typestate[TContext]) extends AnyVal {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
