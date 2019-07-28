package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends StateNode[TContext, TStateSchema, TEvent]

