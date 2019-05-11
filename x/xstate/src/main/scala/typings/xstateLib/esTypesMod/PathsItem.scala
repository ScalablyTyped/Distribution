package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var paths: js.Array[js.Array[Segment[TContext, TEvent]]]
  var state: xstateLib.Anon_Context[TContext]
}

object PathsItem {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](paths: js.Array[js.Array[Segment[TContext, TEvent]]], state: xstateLib.Anon_Context[TContext]): PathsItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(paths = paths, state = state)
  
    __obj.asInstanceOf[PathsItem[TContext, TEvent]]
  }
}

