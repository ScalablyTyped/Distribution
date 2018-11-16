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
  
  val appComponentsMayNeedUpdating: appComponentsMayNeedUpdating with java.lang.String = js.native
  val noComponentsFound: noComponentsFound with java.lang.String = js.native
  val notStarted: notStarted with java.lang.String = js.native
  val updatesInProgress: updatesInProgress with java.lang.String = js.native
  val userCancelled: userCancelled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus with java.lang.String] = js.native
}

