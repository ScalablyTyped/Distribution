package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

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
  sealed trait accessSuspended
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus
  
  /** The item's RMS license has expired. */
  @js.native
  sealed trait licenseExpired
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus
  
  /** The item is protected. */
  @js.native
  sealed trait `protected`
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus
  
  /** The item is protected to another enterprise identity. */
  @js.native
  sealed trait protectedToOtherIdentity
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus
  
  /** The protection of the item has been revoked. */
  @js.native
  sealed trait revoked
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus
  
  /** The item is not protected to an enterprise identity. */
  @js.native
  sealed trait unprotected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus
  
  /* 5 */ val accessSuspended: accessSuspended with scala.Double = js.native
  /* 4 */ val licenseExpired: licenseExpired with scala.Double = js.native
  /* 1 */ val `protected`: `protected` with scala.Double = js.native
  /* 0 */ val protectedToOtherIdentity: protectedToOtherIdentity with scala.Double = js.native
  /* 2 */ val revoked: revoked with scala.Double = js.native
  /* 3 */ val unprotected: unprotected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus with scala.Double
  ] = js.native
}

