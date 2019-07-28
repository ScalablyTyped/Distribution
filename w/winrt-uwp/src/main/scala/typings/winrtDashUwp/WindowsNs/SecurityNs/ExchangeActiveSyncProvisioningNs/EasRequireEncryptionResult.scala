package typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

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
  
  /* 2 */ val canBeCompliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.compliant with Double = js.native
  /* 4 */ val deFixedDataNotSupported: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.deFixedDataNotSupported with Double = js.native
  /* 6 */ val deHardwareNotCompliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.deHardwareNotCompliant with Double = js.native
  /* 12 */ val deOsVolumeNotProtected: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.deOsVolumeNotProtected with Double = js.native
  /* 14 */ val deProtectionNotYetEnabled: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.deProtectionNotYetEnabled with Double = js.native
  /* 10 */ val deProtectionSuspended: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.deProtectionSuspended with Double = js.native
  /* 8 */ val deWinReNotConfigured: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.deWinReNotConfigured with Double = js.native
  /* 5 */ val fixedDataNotSupported: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.fixedDataNotSupported with Double = js.native
  /* 7 */ val hardwareNotCompliant: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.hardwareNotCompliant with Double = js.native
  /* 9 */ val lockNotConfigured: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.lockNotConfigured with Double = js.native
  /* 16 */ val noFeatureLicense: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.noFeatureLicense with Double = js.native
  /* 0 */ val notEvaluated: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.notEvaluated with Double = js.native
  /* 3 */ val notProvisionedOnAllVolumes: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.notProvisionedOnAllVolumes with Double = js.native
  /* 17 */ val osNotProtected: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.osNotProtected with Double = js.native
  /* 13 */ val osVolumeNotProtected: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.osVolumeNotProtected with Double = js.native
  /* 15 */ val protectionNotYetEnabled: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.protectionNotYetEnabled with Double = js.native
  /* 11 */ val protectionSuspended: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.protectionSuspended with Double = js.native
  /* 18 */ val unexpectedFailure: typings.winrtDashUwp.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult.unexpectedFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasRequireEncryptionResult with Double] = js.native
}

