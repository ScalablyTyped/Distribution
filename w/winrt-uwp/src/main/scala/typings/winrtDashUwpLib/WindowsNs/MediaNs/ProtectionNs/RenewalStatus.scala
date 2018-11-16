package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenewalStatus extends js.Object

/** Defines the possible values returned from RenewSystemComponentsAsync . */
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  /** Specifies that no system components were detected that need updating. But app components may need to be updated, in which case the user may need to get an updated application from the store. */
  @js.native
  sealed trait appComponentsMayNeedUpdating
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  /** Specifies that no components were found that need to be updated. */
  @js.native
  sealed trait noComponentsFound
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  /** Specifies that renewal has not started. */
  @js.native
  sealed trait notStarted
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  /** Specifies that there are updates and the user has allowed updated to proceed */
  @js.native
  sealed trait updatesInProgress
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  /** Specifies that the user declined to allow updates to proceed. */
  @js.native
  sealed trait userCancelled
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus
  
  val appComponentsMayNeedUpdating: appComponentsMayNeedUpdating with java.lang.String = js.native
  val noComponentsFound: noComponentsFound with java.lang.String = js.native
  val notStarted: notStarted with java.lang.String = js.native
  val updatesInProgress: updatesInProgress with java.lang.String = js.native
  val userCancelled: userCancelled with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus with java.lang.String
  ] = js.native
}

