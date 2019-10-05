package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenewalStatus extends js.Object

@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  @js.native
  sealed trait appComponentsMayNeedUpdating extends RenewalStatus
  
  @js.native
  sealed trait noComponentsFound extends RenewalStatus
  
  @js.native
  sealed trait notStarted extends RenewalStatus
  
  @js.native
  sealed trait updatesInProgress extends RenewalStatus
  
  @js.native
  sealed trait userCancelled extends RenewalStatus
  
  /* 3 */ val appComponentsMayNeedUpdating: typings.winrt.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
  /* 4 */ val noComponentsFound: typings.winrt.Windows.Media.Protection.RenewalStatus.noComponentsFound with Double = js.native
  /* 0 */ val notStarted: typings.winrt.Windows.Media.Protection.RenewalStatus.notStarted with Double = js.native
  /* 1 */ val updatesInProgress: typings.winrt.Windows.Media.Protection.RenewalStatus.updatesInProgress with Double = js.native
  /* 2 */ val userCancelled: typings.winrt.Windows.Media.Protection.RenewalStatus.userCancelled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenewalStatus with Double] = js.native
}

