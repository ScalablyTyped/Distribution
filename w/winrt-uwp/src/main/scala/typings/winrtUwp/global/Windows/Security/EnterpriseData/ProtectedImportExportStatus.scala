package typings.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Possible status values for an enterprise protected file that has been imported from or exported to a container file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedImportExportStatus")
@js.native
object ProtectedImportExportStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus with Double
  ] = js.native
  
  /* 7 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.accessSuspended with Double = js.native
  
  /* 6 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.licenseExpired with Double = js.native
  
  /* 4 */ val notRoamable: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.notRoamable with Double = js.native
  
  /* 0 */ val ok: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.ok with Double = js.native
  
  /* 5 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.protectedToOtherIdentity with Double = js.native
  
  /* 3 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.revoked with Double = js.native
  
  /* 1 */ val undetermined: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.undetermined with Double = js.native
  
  /* 2 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.unprotected with Double = js.native
}
