package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[TC] extends StObject {
  
  var context: TC
  
  var value: js.Any
}
object Context {
  
  @scala.inline
  def apply[TC](context: TC, value: js.Any): Context[TC] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TC]]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context[?], TC] (val x: Self & Context[TC]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TC): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
