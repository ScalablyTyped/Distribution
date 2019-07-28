package typings.winrt.WindowsNs.MediaNs.ProtectionNs

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
  
  /* 3 */ val appComponentsMayNeedUpdating: typings.winrt.WindowsNs.MediaNs.ProtectionNs.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
  /* 4 */ val noComponentsFound: typings.winrt.WindowsNs.MediaNs.ProtectionNs.RenewalStatus.noComponentsFound with Double = js.native
  /* 0 */ val notStarted: typings.winrt.WindowsNs.MediaNs.ProtectionNs.RenewalStatus.notStarted with Double = js.native
  /* 1 */ val updatesInProgress: typings.winrt.WindowsNs.MediaNs.ProtectionNs.RenewalStatus.updatesInProgress with Double = js.native
  /* 2 */ val userCancelled: typings.winrt.WindowsNs.MediaNs.ProtectionNs.RenewalStatus.userCancelled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenewalStatus with Double] = js.native
}

