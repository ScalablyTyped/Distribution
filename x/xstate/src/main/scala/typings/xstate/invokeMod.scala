package typings.xstate

import typings.xstate.anon.Pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeMod {
  
  @js.native
  trait InvokedPromiseOptions extends StObject {
    
    var id: js.UndefOr[String] = js.native
  }
  object InvokedPromiseOptions {
    
    @scala.inline
    def apply(): InvokedPromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokedPromiseOptions]
    }
    
    @scala.inline
    implicit class InvokedPromiseOptionsMutableBuilder[Self <: InvokedPromiseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait PromiseMachineSchema extends StObject {
    
    var states: Pending = js.native
  }
  object PromiseMachineSchema {
    
    @scala.inline
    def apply(states: Pending): PromiseMachineSchema = {
      val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseMachineSchema]
    }
    
    @scala.inline
    implicit class PromiseMachineSchemaMutableBuilder[Self <: PromiseMachineSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStates(value: Pending): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
}
