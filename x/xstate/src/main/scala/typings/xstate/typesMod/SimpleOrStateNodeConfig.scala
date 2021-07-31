package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent]
  - typings.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
*/
trait SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */] extends StObject
object SimpleOrStateNodeConfig {
  
  @scala.inline
  def AtomicStateNodeConfig[TContext, TEvent /* <: EventObject */](initial: Unit, onDone: Unit, states: Unit): typings.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], onDone = onDone.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent]]
  }
  
  @scala.inline
  def StateNodeConfig[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](): typings.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]]
  }
}
