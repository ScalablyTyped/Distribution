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
  
  val accessSuspended: accessSuspended with java.lang.String = js.native
  val licenseExpired: licenseExpired with java.lang.String = js.native
  val notRoamable: notRoamable with java.lang.String = js.native
  val ok: ok with java.lang.String = js.native
  val protectedToOtherIdentity: protectedToOtherIdentity with java.lang.String = js.native
  val revoked: revoked with java.lang.String = js.native
  val undetermined: undetermined with java.lang.String = js.native
  val unprotected: unprotected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedImportExportStatus with java.lang.String
  ] = js.native
}

