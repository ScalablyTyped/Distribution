package typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProtectedImportExportStatus extends js.Object

/** Possible status values for an enterprise protected file that has been imported from or exported to a container file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedImportExportStatus")
@js.native
object ProtectedImportExportStatus extends js.Object {
  /** The keys to access the protected file have been dropped while the device is locked. */
  @js.native
  sealed trait accessSuspended extends ProtectedImportExportStatus
  
  /** The file's RMS license has expired. */
  @js.native
  sealed trait licenseExpired extends ProtectedImportExportStatus
  
  /** The file cannot be roamed to another device. */
  @js.native
  sealed trait notRoamable extends ProtectedImportExportStatus
  
  /** The file's protection is OK. */
  @js.native
  sealed trait ok extends ProtectedImportExportStatus
  
  /** The file is inaccessible, as it is protected to a different enterprise identity. */
  @js.native
  sealed trait protectedToOtherIdentity extends ProtectedImportExportStatus
  
  /** The file's protection has been revoked, and it is inaccessible. */
  @js.native
  sealed trait revoked extends ProtectedImportExportStatus
  
  /** The file's protection can not be determined. */
  @js.native
  sealed trait undetermined extends ProtectedImportExportStatus
  
  /** The file is not protected. */
  @js.native
  sealed trait unprotected extends ProtectedImportExportStatus
  
  /* 7 */ val accessSuspended: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.accessSuspended with Double = js.native
  /* 6 */ val licenseExpired: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.licenseExpired with Double = js.native
  /* 4 */ val notRoamable: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.notRoamable with Double = js.native
  /* 0 */ val ok: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.ok with Double = js.native
  /* 5 */ val protectedToOtherIdentity: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.protectedToOtherIdentity with Double = js.native
  /* 3 */ val revoked: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.revoked with Double = js.native
  /* 1 */ val undetermined: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.undetermined with Double = js.native
  /* 2 */ val unprotected: typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus.unprotected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectedImportExportStatus with Double] = js.native
}

