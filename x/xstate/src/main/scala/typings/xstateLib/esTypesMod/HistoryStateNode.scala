package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryStateNode[TContext]
  extends xstateLib.esStateNodeMod.StateNode[TContext, js.Any, OmniEventObject[EventObject]] {
  @JSName("history")
  var history_HistoryStateNode: xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep = js.native
}

