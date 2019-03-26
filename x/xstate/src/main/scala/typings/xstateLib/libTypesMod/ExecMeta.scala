package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  var action: ActionObject[TContext, TEvent]
}

object ExecMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](action: ActionObject[TContext, TEvent]): ExecMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(action = action)
  
    __obj.asInstanceOf[ExecMeta[TContext, TEvent]]
  }
}

