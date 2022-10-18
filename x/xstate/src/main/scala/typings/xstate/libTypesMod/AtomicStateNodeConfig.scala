package typings.xstate.libTypesMod

import typings.xstate.xstateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtomicStateNodeConfig[TContext, TEvent /* <: EventObject */]
  extends StObject
     with StateNodeConfig[TContext, StateSchema[Any], TEvent, BaseActionObject] {
  
  @JSName("initial")
  var initial_AtomicStateNodeConfig: Unit
  
  @JSName("onDone")
  var onDone_AtomicStateNodeConfig: Unit
  
  @JSName("parallel")
  var parallel_AtomicStateNodeConfig: js.UndefOr[`false`] = js.undefined
  
  @JSName("states")
  var states_AtomicStateNodeConfig: Unit
}
object AtomicStateNodeConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](initial: Unit, onDone: Unit, states: Unit): AtomicStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], onDone = onDone.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomicStateNodeConfig[TContext, TEvent]]
  }
  
  extension [Self <: AtomicStateNodeConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (AtomicStateNodeConfig[TContext, TEvent])) {
    
    inline def setInitial(value: Unit): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setOnDone(value: Unit): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
    
    inline def setParallel(value: `false`): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setStates(value: Unit): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
