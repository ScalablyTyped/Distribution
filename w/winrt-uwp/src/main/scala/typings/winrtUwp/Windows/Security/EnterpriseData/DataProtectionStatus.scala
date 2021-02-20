package typings.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataProtectionStatus extends StObject
/** Describes the enterprise identity protection state of a buffer or stream. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionStatus")
@js.native
object DataProtectionStatus extends StObject {
  
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
}
