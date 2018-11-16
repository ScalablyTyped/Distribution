package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileProtectionStatus extends js.Object

/** Describes the enterprise protection state of a file or folder. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionStatus")
@js.native
object FileProtectionStatus extends js.Object {
  /** The keys to access the protected item have been dropped while the device is locked. */
  @js.native
  sealed trait accessSuspended
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item's RMS license has expired. */
  @js.native
  sealed trait licenseExpired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is encrypted or is a system file and cannot be protected using enterprise protection. */
  @js.native
  sealed trait notProtectable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is protected using enterprise protection. */
  @js.native
  sealed trait `protected`
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** Another user has protected the item using enterprise protection. */
  @js.native
  sealed trait protectedByOtherUser
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is protected for another enterprise id using enterprise protection. */
  @js.native
  sealed trait protectedToOtherEnterprise
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is protected for another enterprise identity using enterprise protection. */
  @js.native
  sealed trait protectedToOtherIdentity
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item has been revoked using enterprise protection. */
  @js.native
  sealed trait revoked
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait undetermined
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  /** The item is not protected using enterprise protection. */
  @js.native
  sealed trait unprotected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus
  
  val accessSuspended: accessSuspended with java.lang.String = js.native
  val licenseExpired: licenseExpired with java.lang.String = js.native
  val notProtectable: notProtectable with java.lang.String = js.native
  val `protected`: `protected` with java.lang.String = js.native
  val protectedByOtherUser: protectedByOtherUser with java.lang.String = js.native
  val protectedToOtherEnterprise: protectedToOtherEnterprise with java.lang.String = js.native
  val protectedToOtherIdentity: protectedToOtherIdentity with java.lang.String = js.native
  val revoked: revoked with java.lang.String = js.native
  val undetermined: undetermined with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unprotected: unprotected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus with java.lang.String
  ] = js.native
}

