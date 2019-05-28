package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var path: js.Array[Segment[TContext, TEvent]]
  var state: xstateLib.libStateMod.State[TContext, TEvent]
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object PathItem {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    path: js.Array[Segment[TContext, TEvent]],
    state: xstateLib.libStateMod.State[TContext, TEvent],
    weight: scala.Int | scala.Double = null
  ): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path, state = state)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
}

