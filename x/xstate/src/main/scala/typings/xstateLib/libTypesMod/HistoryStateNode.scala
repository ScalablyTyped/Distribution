package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryStateNode[TContext]
  extends xstateLib.libStateNodeMod.StateNode[TContext, js.Any, OmniEventObject[EventObject]] {
  @JSName("history")
  var history_HistoryStateNode: xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep = js.native
}

