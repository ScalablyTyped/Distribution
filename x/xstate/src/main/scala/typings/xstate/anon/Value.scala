package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[TContext] extends StObject {
  
  var context: TContext
  
  var value: js.Any
}
object Value {
  
  inline def apply[TContext](context: TContext, value: js.Any): Value[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TContext]]
  }
  
  extension [Self <: Value[?], TContext](x: Self & Value[TContext]) {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
