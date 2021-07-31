package typings.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileProtectionStatus extends StObject
/** Describes the enterprise protection state of a file or folder. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionStatus")
@js.native
object FileProtectionStatus extends StObject {
  
  /** The keys to access the protected item have been dropped while the device is locked. */
  @js.native
  sealed trait accessSuspended
    extends StObject
       with FileProtectionStatus
  
  /** The item's RMS license has expired. */
  @js.native
  sealed trait licenseExpired
    extends StObject
       with FileProtectionStatus
  
  /** The item is encrypted or is a system file and cannot be protected using enterprise protection. */
  @js.native
  sealed trait notProtectable
    extends StObject
       with FileProtectionStatus
  
  /** The item is protected using enterprise protection. */
  @js.native
  sealed trait `protected`
    extends StObject
       with FileProtectionStatus
  
  /** Another user has protected the item using enterprise protection. */
  @js.native
  sealed trait protectedByOtherUser
    extends StObject
       with FileProtectionStatus
  
  /** The item is protected for another enterprise id using enterprise protection. */
  @js.native
  sealed trait protectedToOtherEnterprise
    extends StObject
       with FileProtectionStatus
  
  /** The item is protected for another enterprise identity using enterprise protection. */
  @js.native
  sealed trait protectedToOtherIdentity
    extends StObject
       with FileProtectionStatus
  
  /** The item has been revoked using enterprise protection. */
  @js.native
  sealed trait revoked
    extends StObject
       with FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait undetermined
    extends StObject
       with FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait unknown
    extends StObject
       with FileProtectionStatus
  
  /** The item is not protected using enterprise protection. */
  @js.native
  sealed trait unprotected
    extends StObject
       with FileProtectionStatus
}
