package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryExitEffectMap[TContext, TEvent /* <: EventObject */] extends js.Object {
  var entry: js.Array[ActionObject[TContext, TEvent]]
  var exit: js.Array[ActionObject[TContext, TEvent]]
}

object EntryExitEffectMap {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](entry: js.Array[ActionObject[TContext, TEvent]], exit: js.Array[ActionObject[TContext, TEvent]]): EntryExitEffectMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryExitEffectMap[TContext, TEvent]]
  }
}

