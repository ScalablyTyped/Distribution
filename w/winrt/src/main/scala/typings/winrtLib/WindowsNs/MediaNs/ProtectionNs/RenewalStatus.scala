package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenewalStatus extends js.Object

@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  @js.native
  sealed trait appComponentsMayNeedUpdating
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  @js.native
  sealed trait noComponentsFound
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  @js.native
  sealed trait notStarted
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  @js.native
  sealed trait updatesInProgress
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  @js.native
  sealed trait userCancelled
    extends winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  /* 3 */ val appComponentsMayNeedUpdating: appComponentsMayNeedUpdating with scala.Double = js.native
  /* 4 */ val noComponentsFound: noComponentsFound with scala.Double = js.native
  /* 0 */ val notStarted: notStarted with scala.Double = js.native
  /* 1 */ val updatesInProgress: updatesInProgress with scala.Double = js.native
  /* 2 */ val userCancelled: userCancelled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus with scala.Double] = js.native
}

