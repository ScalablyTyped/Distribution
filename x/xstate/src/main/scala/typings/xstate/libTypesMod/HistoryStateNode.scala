package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryStateNode[TContext]
  extends StateNode[TContext, js.Any, OmniEventObject[EventObject]] {
  @JSName("history")
  var history_HistoryStateNode: shallow | deep = js.native
}

