package typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs

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
  sealed trait accessSuspended extends FileProtectionStatus
  
  /** The item's RMS license has expired. */
  @js.native
  sealed trait licenseExpired extends FileProtectionStatus
  
  /** The item is encrypted or is a system file and cannot be protected using enterprise protection. */
  @js.native
  sealed trait notProtectable extends FileProtectionStatus
  
  /** The item is protected using enterprise protection. */
  @js.native
  sealed trait `protected` extends FileProtectionStatus
  
  /** Another user has protected the item using enterprise protection. */
  @js.native
  sealed trait protectedByOtherUser extends FileProtectionStatus
  
  /** The item is protected for another enterprise id using enterprise protection. */
  @js.native
  sealed trait protectedToOtherEnterprise extends FileProtectionStatus
  
  /** The item is protected for another enterprise identity using enterprise protection. */
  @js.native
  sealed trait protectedToOtherIdentity extends FileProtectionStatus
  
  /** The item has been revoked using enterprise protection. */
  @js.native
  sealed trait revoked extends FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait undetermined extends FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait unknown extends FileProtectionStatus
  
  /** The item is not protected using enterprise protection. */
  @js.native
  sealed trait unprotected extends FileProtectionStatus
  
  /* 10 */ val accessSuspended: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.accessSuspended with Double = js.native
  /* 9 */ val licenseExpired: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.licenseExpired with Double = js.native
  /* 7 */ val notProtectable: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.notProtectable with Double = js.native
  /* 4 */ val `protected`: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.`protected` with Double = js.native
  /* 5 */ val protectedByOtherUser: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.protectedByOtherUser with Double = js.native
  /* 6 */ val protectedToOtherEnterprise: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.protectedToOtherEnterprise with Double = js.native
  /* 8 */ val protectedToOtherIdentity: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.protectedToOtherIdentity with Double = js.native
  /* 3 */ val revoked: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.revoked with Double = js.native
  /* 0 */ val undetermined: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.undetermined with Double = js.native
  /* 1 */ val unknown: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.unknown with Double = js.native
  /* 2 */ val unprotected: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus.unprotected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileProtectionStatus with Double] = js.native
}

