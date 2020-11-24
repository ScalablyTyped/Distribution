package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
