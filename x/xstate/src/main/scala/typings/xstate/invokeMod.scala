package typings.xstate

import typings.xstate.anon.Pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeMod {
  
  trait InvokedPromiseOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
  }
  object InvokedPromiseOptions {
    
    inline def apply(): InvokedPromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokedPromiseOptions]
    }
    
    extension [Self <: InvokedPromiseOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait PromiseMachineSchema extends StObject {
    
    var states: Pending
  }
  object PromiseMachineSchema {
    
    inline def apply(states: Pending): PromiseMachineSchema = {
      val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseMachineSchema]
    }
    
    extension [Self <: PromiseMachineSchema](x: Self) {
      
      inline def setStates(value: Pending): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
}
