package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextAny extends StObject {
  
  var context: js.Any
  
  var value: js.Any
}
object ContextAny {
  
  @scala.inline
  def apply(context: js.Any, value: js.Any): ContextAny = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextAny]
  }
  
  @scala.inline
  implicit class ContextAnyMutableBuilder[Self <: ContextAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
