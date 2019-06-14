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
  
  /* 10 */ val accessSuspended: accessSuspended with scala.Double = js.native
  /* 9 */ val licenseExpired: licenseExpired with scala.Double = js.native
  /* 7 */ val notProtectable: notProtectable with scala.Double = js.native
  /* 4 */ val `protected`: `protected` with scala.Double = js.native
  /* 5 */ val protectedByOtherUser: protectedByOtherUser with scala.Double = js.native
  /* 6 */ val protectedToOtherEnterprise: protectedToOtherEnterprise with scala.Double = js.native
  /* 8 */ val protectedToOtherIdentity: protectedToOtherIdentity with scala.Double = js.native
  /* 3 */ val revoked: revoked with scala.Double = js.native
  /* 0 */ val undetermined: undetermined with scala.Double = js.native
  /* 1 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val unprotected: unprotected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus with scala.Double
  ] = js.native
}

