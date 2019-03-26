package typings
package xstateLib.libMatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/match", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def matchState[T, TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    state: xstateLib.libStateMod.State[TContext, TEvent],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    state: xstateLib.libTypesMod.StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
}

