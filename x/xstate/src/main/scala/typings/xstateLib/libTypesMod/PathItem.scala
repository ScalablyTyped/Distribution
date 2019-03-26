package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathItem[TContext, TEvent /* <: EventObject */] extends js.Object {
  var path: js.Array[Segment[TContext, TEvent]]
  var state: xstateLib.Anon_Context[TContext]
}

object PathItem {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](path: js.Array[Segment[TContext, TEvent]], state: xstateLib.Anon_Context[TContext]): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path, state = state)
  
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
}

