package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent]
  - typings.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
*/
trait SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object

object SimpleOrStateNodeConfig {
  @scala.inline
  def AtomicStateNodeConfig[TContext, /* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent](): SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  def StateNodeConfig[TContext, /* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent](): SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent]]
  }
}

