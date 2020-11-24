package typings.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the enterprise identity protection state of a buffer or stream. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionStatus")
@js.native
object DataProtectionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus with Double
  ] = js.native
  
  /* 5 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.accessSuspended with Double = js.native
  
  /* 4 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.licenseExpired with Double = js.native
  
  /* 1 */ val `protected`: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.`protected` with Double = js.native
  
  /* 0 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.protectedToOtherIdentity with Double = js.native
  
  /* 2 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.revoked with Double = js.native
  
  /* 3 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.unprotected with Double = js.native
}
