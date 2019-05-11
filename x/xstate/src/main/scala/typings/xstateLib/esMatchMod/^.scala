package typings
package xstateLib.esMatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/match", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchState[T, TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    state: xstateLib.esStateMod.State[TContext, TEvent],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    state: xstateLib.esTypesMod.StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
}

