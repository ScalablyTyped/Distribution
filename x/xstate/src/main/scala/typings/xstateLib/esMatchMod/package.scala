package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMatchMod {
  type StatePatternTuple[T, TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] = js.Tuple2[xstateLib.esTypesMod.StateValue, ValueFromStateGetter[T, TContext, TEvent]]
  type ValueFromStateGetter[T, TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] = js.Function1[/* state */ xstateLib.esStateMod.State[TContext, TEvent], T]
}
