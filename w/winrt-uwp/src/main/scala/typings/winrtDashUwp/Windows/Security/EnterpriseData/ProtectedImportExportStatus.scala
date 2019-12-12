package typings.winrtDashUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.accessSuspended
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.licenseExpired
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.notRoamable
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.ok
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.protectedToOtherIdentity
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.revoked
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.undetermined
import typings.winrtDashUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.unprotected
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectedImportExportStatus with Double] = js.native
  /* 7 */ @js.native
  object accessSuspended extends TopLevel[accessSuspended with Double]
  
  /* 6 */ @js.native
  object licenseExpired extends TopLevel[licenseExpired with Double]
  
  /* 4 */ @js.native
  object notRoamable extends TopLevel[notRoamable with Double]
  
  /* 0 */ @js.native
  object ok extends TopLevel[ok with Double]
  
  /* 5 */ @js.native
  object protectedToOtherIdentity extends TopLevel[protectedToOtherIdentity with Double]
  
  /* 3 */ @js.native
  object revoked extends TopLevel[revoked with Double]
  
  /* 1 */ @js.native
  object undetermined extends TopLevel[undetermined with Double]
  
  /* 2 */ @js.native
  object unprotected extends TopLevel[unprotected with Double]
  
}

