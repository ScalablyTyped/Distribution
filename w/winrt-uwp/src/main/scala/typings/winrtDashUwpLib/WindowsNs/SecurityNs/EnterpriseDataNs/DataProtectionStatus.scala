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
  
  val accessSuspended: accessSuspended with java.lang.String = js.native
  val licenseExpired: licenseExpired with java.lang.String = js.native
  val `protected`: `protected` with java.lang.String = js.native
  val protectedToOtherIdentity: protectedToOtherIdentity with java.lang.String = js.native
  val revoked: revoked with java.lang.String = js.native
  val unprotected: unprotected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.DataProtectionStatus with java.lang.String
  ] = js.native
}

