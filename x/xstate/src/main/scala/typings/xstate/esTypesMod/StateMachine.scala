package typings.xstate.esTypesMod

import typings.xstate.esStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends StateNode[TContext, TStateSchema, TEvent]

