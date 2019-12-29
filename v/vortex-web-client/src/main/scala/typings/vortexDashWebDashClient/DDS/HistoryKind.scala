package typings.vortexDashWebDashClient.DDS

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HistoryKind with Double] = js.native
  /* 0 */ @js.native
  object KeepAll extends TopLevel[KeepAll with Double]
  
  /* 1 */ @js.native
  object KeepLast extends TopLevel[KeepLast with Double]
  
}

