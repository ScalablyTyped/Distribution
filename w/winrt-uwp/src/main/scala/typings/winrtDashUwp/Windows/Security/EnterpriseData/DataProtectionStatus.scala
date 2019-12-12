package typings.winrtDashUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.`protected`
import typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.accessSuspended
import typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.licenseExpired
import typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.protectedToOtherIdentity
import typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.revoked
import typings.winrtDashUwp.Windows.Security.EnterpriseData.DataProtectionStatus.unprotected
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataProtectionStatus with Double] = js.native
  /* 5 */ @js.native
  object accessSuspended extends TopLevel[accessSuspended with Double]
  
  /* 4 */ @js.native
  object licenseExpired extends TopLevel[licenseExpired with Double]
  
  /* 1 */ @js.native
  object `protected` extends TopLevel[`protected` with Double]
  
  /* 0 */ @js.native
  object protectedToOtherIdentity extends TopLevel[protectedToOtherIdentity with Double]
  
  /* 2 */ @js.native
  object revoked extends TopLevel[revoked with Double]
  
  /* 3 */ @js.native
  object unprotected extends TopLevel[unprotected with Double]
  
}

