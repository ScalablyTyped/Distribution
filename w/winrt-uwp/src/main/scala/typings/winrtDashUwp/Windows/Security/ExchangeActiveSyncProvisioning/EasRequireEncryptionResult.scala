package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasRequireEncryptionResult extends js.Object

/** Represents the type of encryption required. These values are mapped against the HRESULT codes returned from the EAS policy engine. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
@js.native
object EasRequireEncryptionResult extends js.Object {
  /** This computer can be compliant by using the ApplyAsync method. */
  @js.native
  sealed trait canBeCompliant extends EasRequireEncryptionResult
  
  /** This computer is already DeviceProtected. */
  @js.native
  sealed trait compliant extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use FixedDataNotSupported. */
  @js.native
  sealed trait deFixedDataNotSupported extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use HardwareNotCompliant. */
  @js.native
  sealed trait deHardwareNotCompliant extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use OsVolumeNotProtected. */
  @js.native
  sealed trait deOsVolumeNotProtected extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use ProtectionNotYetEnabled. */
  @js.native
  sealed trait deProtectionNotYetEnabled extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use ProtectionSuspended. */
  @js.native
  sealed trait deProtectionSuspended extends EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use LockNotConfigured. */
  @js.native
  sealed trait deWinReNotConfigured extends EasRequireEncryptionResult
  
  /** This computer cannot support device encryption because unencrypted fixed data volumes are present. */
  @js.native
  sealed trait fixedDataNotSupported extends EasRequireEncryptionResult
  
  /** This computer does not meet the hardware requirements to support device encryption. */
  @js.native
  sealed trait hardwareNotCompliant extends EasRequireEncryptionResult
  
  /** This computer cannot support device encryption because WinRE is not properly configured. */
  @js.native
  sealed trait lockNotConfigured extends EasRequireEncryptionResult
  
  /** This computer does not have a feature license. */
  @js.native
  sealed trait noFeatureLicense extends EasRequireEncryptionResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated extends EasRequireEncryptionResult
  
  /** This computer is not provisioned to support device encryption. Enable BitLocker on all volumes to comply with device encryption policy. */
  @js.native
  sealed trait notProvisionedOnAllVolumes extends EasRequireEncryptionResult
  
  /** The operating system drive is not protected by BitLocker drive encryption. */
  @js.native
  sealed trait osNotProtected extends EasRequireEncryptionResult
  
  /** This computer is not provisioned with device encryption. Enable Device encryption on all volumes to comply with device encryption policy if it is supported. */
  @js.native
  sealed trait osVolumeNotProtected extends EasRequireEncryptionResult
  
  /** Protection has not been enabled on the volume. Enabling protection requires a connected account. If you already have a connected account and are seeing this error, refer to the event log for more information. */
  @js.native
  sealed trait protectionNotYetEnabled extends EasRequireEncryptionResult
  
  /** Protection is enabled on this volume but has been suspended. This is most likely due to an update of your computer. Reboot and try again. */
  @js.native
  sealed trait protectionSuspended extends EasRequireEncryptionResult
  
  /** An unexpected failure occurred. */
  @js.native
  sealed trait unexpectedFailure extends EasRequireEncryptionResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasRequireEncryptionResult with Double] = js.native
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 4 */ @js.native
  object deFixedDataNotSupported extends TopLevel[deFixedDataNotSupported with Double]
  
  /* 6 */ @js.native
  object deHardwareNotCompliant extends TopLevel[deHardwareNotCompliant with Double]
  
  /* 12 */ @js.native
  object deOsVolumeNotProtected extends TopLevel[deOsVolumeNotProtected with Double]
  
  /* 14 */ @js.native
  object deProtectionNotYetEnabled extends TopLevel[deProtectionNotYetEnabled with Double]
  
  /* 10 */ @js.native
  object deProtectionSuspended extends TopLevel[deProtectionSuspended with Double]
  
  /* 8 */ @js.native
  object deWinReNotConfigured extends TopLevel[deWinReNotConfigured with Double]
  
  /* 5 */ @js.native
  object fixedDataNotSupported extends TopLevel[fixedDataNotSupported with Double]
  
  /* 7 */ @js.native
  object hardwareNotCompliant extends TopLevel[hardwareNotCompliant with Double]
  
  /* 9 */ @js.native
  object lockNotConfigured extends TopLevel[lockNotConfigured with Double]
  
  /* 16 */ @js.native
  object noFeatureLicense extends TopLevel[noFeatureLicense with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object notProvisionedOnAllVolumes extends TopLevel[notProvisionedOnAllVolumes with Double]
  
  /* 17 */ @js.native
  object osNotProtected extends TopLevel[osNotProtected with Double]
  
  /* 13 */ @js.native
  object osVolumeNotProtected extends TopLevel[osVolumeNotProtected with Double]
  
  /* 15 */ @js.native
  object protectionNotYetEnabled extends TopLevel[protectionNotYetEnabled with Double]
  
  /* 11 */ @js.native
  object protectionSuspended extends TopLevel[protectionSuspended with Double]
  
  /* 18 */ @js.native
  object unexpectedFailure extends TopLevel[unexpectedFailure with Double]
  
}

