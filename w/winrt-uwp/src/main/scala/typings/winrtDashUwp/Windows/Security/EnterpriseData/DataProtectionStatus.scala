package typings.winrtDashUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataProtectionStatus extends js.Object

/** Describes the enterprise identity protection state of a buffer or stream. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionStatus")
@js.native
object DataProtectionStatus extends js.Object {
  /** The keys to access the protected item have been dropped while the device is locked. */
  @js.native
  sealed trait accessSuspended extends DataProtectionStatus
  
  /** The item's RMS license has expired. */
  @js.native
  sealed trait licenseExpired extends DataProtectionStatus
  
  /** The item is protected. */
  @js.native
  sealed trait `protected` extends DataProtectionStatus
  
  /** The item is protected to another enterprise identity. */
  @js.native
  sealed trait protectedToOtherIdentity extends DataProtectionStatus
  
  /** The protection of the item has been revoked. */
  @js.native
  sealed trait revoked extends DataProtectionStatus
  
  /** The item is not protected to an enterprise identity. */
  @js.native
  sealed trait unprotected extends DataProtectionStatus
  
  /* 5 */ val accessSuspended: typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.accessSuspended with Double = js.native
  /* 4 */ val licenseExpired: typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.licenseExpired with Double = js.native
  /* 1 */ val `protected`: typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.`protected` with Double = js.native
  /* 0 */ val protectedToOtherIdentity: typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.protectedToOtherIdentity with Double = js.native
  /* 2 */ val revoked: typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.revoked with Double = js.native
  /* 3 */ val unprotected: typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.unprotected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataProtectionStatus with Double] = js.native
}

