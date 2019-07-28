package typings.xstate.esMatchMod

import typings.xstate.esStateMod.State
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/match", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: State[TContext, TEvent],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
}

