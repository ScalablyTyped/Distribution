package typings
package vortexDashWebDashClientLib.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HistoryKind extends js.Object

@JSGlobal("DDS.HistoryKind")
@js.native
object HistoryKind extends js.Object {
  @js.native
  sealed trait KeepAll
    extends vortexDashWebDashClientLib.DDSNs.HistoryKind
  
  @js.native
  sealed trait KeepLast
    extends vortexDashWebDashClientLib.DDSNs.HistoryKind
  
  /* 0 */ val KeepAll: KeepAll with scala.Double = js.native
  /* 1 */ val KeepLast: KeepLast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vortexDashWebDashClientLib.DDSNs.HistoryKind with scala.Double] = js.native
}

