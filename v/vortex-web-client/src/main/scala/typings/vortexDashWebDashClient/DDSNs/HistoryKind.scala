package typings.vortexDashWebDashClient.DDSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HistoryKind extends js.Object

@JSGlobal("DDS.HistoryKind")
@js.native
object HistoryKind extends js.Object {
  @js.native
  sealed trait KeepAll extends HistoryKind
  
  @js.native
  sealed trait KeepLast extends HistoryKind
  
  /* 0 */ val KeepAll: typings.vortexDashWebDashClient.DDSNs.HistoryKind.KeepAll with Double = js.native
  /* 1 */ val KeepLast: typings.vortexDashWebDashClient.DDSNs.HistoryKind.KeepLast with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HistoryKind with Double] = js.native
}

