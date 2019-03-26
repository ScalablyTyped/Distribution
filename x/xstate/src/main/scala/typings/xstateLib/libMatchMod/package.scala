package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMatchMod {
  type StatePatternTuple[T, TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */] = js.Tuple2[xstateLib.libTypesMod.StateValue, ValueFromStateGetter[T, TContext, TEvent]]
  type ValueFromStateGetter[T, TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */] = js.Function1[/* state */ xstateLib.libStateMod.State[TContext, TEvent], T]
}
