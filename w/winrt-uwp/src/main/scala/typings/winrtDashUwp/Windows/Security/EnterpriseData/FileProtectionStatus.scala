package typings.winrtDashUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileProtectionStatus extends js.Object

/** Describes the enterprise protection state of a file or folder. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionStatus")
@js.native
object FileProtectionStatus extends js.Object {
  /** The keys to access the protected item have been dropped while the device is locked. */
  @js.native
  sealed trait accessSuspended extends FileProtectionStatus
  
  /** The item's RMS license has expired. */
  @js.native
  sealed trait licenseExpired extends FileProtectionStatus
  
  /** The item is encrypted or is a system file and cannot be protected using enterprise protection. */
  @js.native
  sealed trait notProtectable extends FileProtectionStatus
  
  /** The item is protected using enterprise protection. */
  @js.native
  sealed trait `protected` extends FileProtectionStatus
  
  /** Another user has protected the item using enterprise protection. */
  @js.native
  sealed trait protectedByOtherUser extends FileProtectionStatus
  
  /** The item is protected for another enterprise id using enterprise protection. */
  @js.native
  sealed trait protectedToOtherEnterprise extends FileProtectionStatus
  
  /** The item is protected for another enterprise identity using enterprise protection. */
  @js.native
  sealed trait protectedToOtherIdentity extends FileProtectionStatus
  
  /** The item has been revoked using enterprise protection. */
  @js.native
  sealed trait revoked extends FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait undetermined extends FileProtectionStatus
  
  /** The item is either encrypting or decrypting and the enterprise protection status cannot be determined. Check again later. */
  @js.native
  sealed trait unknown extends FileProtectionStatus
  
  /** The item is not protected using enterprise protection. */
  @js.native
  sealed trait unprotected extends FileProtectionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileProtectionStatus with Double] = js.native
  /* 10 */ @js.native
  object accessSuspended extends TopLevel[accessSuspended with Double]
  
  /* 9 */ @js.native
  object licenseExpired extends TopLevel[licenseExpired with Double]
  
  /* 7 */ @js.native
  object notProtectable extends TopLevel[notProtectable with Double]
  
  /* 4 */ @js.native
  object `protected` extends TopLevel[`protected` with Double]
  
  /* 5 */ @js.native
  object protectedByOtherUser extends TopLevel[protectedByOtherUser with Double]
  
  /* 6 */ @js.native
  object protectedToOtherEnterprise extends TopLevel[protectedToOtherEnterprise with Double]
  
  /* 8 */ @js.native
  object protectedToOtherIdentity extends TopLevel[protectedToOtherIdentity with Double]
  
  /* 3 */ @js.native
  object revoked extends TopLevel[revoked with Double]
  
  /* 0 */ @js.native
  object undetermined extends TopLevel[undetermined with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object unprotected extends TopLevel[unprotected with Double]
  
}

