package typings.xstate.typesMod

import typings.xstate.xstateStrings.parallel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelMachineConfig[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */]
  extends StObject
     with StateNodeConfig[TContext, TStateSchema, TEvent] {
  
  @JSName("initial")
  var initial_ParallelMachineConfig: Unit
  
  @JSName("type")
  var type_ParallelMachineConfig: js.UndefOr[parallel] = js.undefined
}
object ParallelMachineConfig {
  
  inline def apply[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](initial: Unit): ParallelMachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelMachineConfig[TContext, TStateSchema, TEvent]]
  }
  
  extension [Self <: ParallelMachineConfig[?, ?, ?], TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](x: Self & (ParallelMachineConfig[TContext, TStateSchema, TEvent])) {
    
    inline def setInitial(value: Unit): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setType(value: parallel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
