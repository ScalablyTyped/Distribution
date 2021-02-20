package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typestate[TContext] extends StObject {
  
  var context: TContext = js.native
  
  var value: StateValue = js.native
}
object Typestate {
  
  @scala.inline
  def apply[TContext](context: TContext, value: StateValue): Typestate[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typestate[TContext]]
  }
  
  @scala.inline
  implicit class TypestateMutableBuilder[Self <: Typestate[_], TContext] (val x: Self with Typestate[TContext]) extends AnyVal {
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
