package typings.xstate

import typings.xstate.libMatchMod.StatePatternTuple
import typings.xstate.libMatchMod.ValueFromStateGetter
import typings.xstate.libStateMod.State
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/match", JSImport.Namespace)
@js.native
object libMatchMod extends js.Object {
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
  type StatePatternTuple[T, TContext, TEvent /* <: EventObject */] = js.Tuple2[StateValue, ValueFromStateGetter[T, TContext, TEvent]]
  type ValueFromStateGetter[T, TContext, TEvent /* <: EventObject */] = js.Function1[/* state */ State[TContext, TEvent], T]
}

