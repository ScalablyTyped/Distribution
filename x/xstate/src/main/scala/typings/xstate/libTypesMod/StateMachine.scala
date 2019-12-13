package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */, TState /* <: Typestate[TContext] */] extends StateNode[TContext, TStateSchema, TEvent, TState]

