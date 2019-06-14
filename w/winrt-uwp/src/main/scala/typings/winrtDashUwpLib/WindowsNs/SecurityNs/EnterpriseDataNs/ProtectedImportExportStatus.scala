package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

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
  sealed trait accessSuspended
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file's RMS license has expired. */
  @js.native
  sealed trait licenseExpired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file cannot be roamed to another device. */
  @js.native
  sealed trait notRoamable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file's protection is OK. */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file is inaccessible, as it is protected to a different enterprise identity. */
  @js.native
  sealed trait protectedToOtherIdentity
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file's protection has been revoked, and it is inaccessible. */
  @js.native
  sealed trait revoked
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file's protection can not be determined. */
  @js.native
  sealed trait undetermined
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /** The file is not protected. */
  @js.native
  sealed trait unprotected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus
  
  /* 7 */ val accessSuspended: accessSuspended with scala.Double = js.native
  /* 6 */ val licenseExpired: licenseExpired with scala.Double = js.native
  /* 4 */ val notRoamable: notRoamable with scala.Double = js.native
  /* 0 */ val ok: ok with scala.Double = js.native
  /* 5 */ val protectedToOtherIdentity: protectedToOtherIdentity with scala.Double = js.native
  /* 3 */ val revoked: revoked with scala.Double = js.native
  /* 1 */ val undetermined: undetermined with scala.Double = js.native
  /* 2 */ val unprotected: unprotected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus with scala.Double
  ] = js.native
}

