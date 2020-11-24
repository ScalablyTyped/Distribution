package typings.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the enterprise protection state of a file or folder. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionStatus")
@js.native
object FileProtectionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus with Double
  ] = js.native
  
  /* 10 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.accessSuspended with Double = js.native
  
  /* 9 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.licenseExpired with Double = js.native
  
  /* 7 */ val notProtectable: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.notProtectable with Double = js.native
  
  /* 4 */ val `protected`: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.`protected` with Double = js.native
  
  /* 5 */ val protectedByOtherUser: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedByOtherUser with Double = js.native
  
  /* 6 */ val protectedToOtherEnterprise: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedToOtherEnterprise with Double = js.native
  
  /* 8 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedToOtherIdentity with Double = js.native
  
  /* 3 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.revoked with Double = js.native
  
  /* 0 */ val undetermined: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.undetermined with Double = js.native
  
  /* 1 */ val unknown: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.unknown with Double = js.native
  
  /* 2 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.unprotected with Double = js.native
}
