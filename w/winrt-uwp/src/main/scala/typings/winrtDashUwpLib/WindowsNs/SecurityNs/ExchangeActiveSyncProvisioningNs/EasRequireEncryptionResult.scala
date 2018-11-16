package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

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
  sealed trait canBeCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer is already DeviceProtected. */
  @js.native
  sealed trait compliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use FixedDataNotSupported. */
  @js.native
  sealed trait deFixedDataNotSupported
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use HardwareNotCompliant. */
  @js.native
  sealed trait deHardwareNotCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use OsVolumeNotProtected. */
  @js.native
  sealed trait deOsVolumeNotProtected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use ProtectionNotYetEnabled. */
  @js.native
  sealed trait deProtectionNotYetEnabled
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use ProtectionSuspended. */
  @js.native
  sealed trait deProtectionSuspended
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This value is no longer supported. Starting with Windows 8.1, use LockNotConfigured. */
  @js.native
  sealed trait deWinReNotConfigured
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer cannot support device encryption because unencrypted fixed data volumes are present. */
  @js.native
  sealed trait fixedDataNotSupported
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer does not meet the hardware requirements to support device encryption. */
  @js.native
  sealed trait hardwareNotCompliant
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer cannot support device encryption because WinRE is not properly configured. */
  @js.native
  sealed trait lockNotConfigured
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer does not have a feature license. */
  @js.native
  sealed trait noFeatureLicense
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** The policy is not set for evaluation. */
  @js.native
  sealed trait notEvaluated
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer is not provisioned to support device encryption. Enable BitLocker on all volumes to comply with device encryption policy. */
  @js.native
  sealed trait notProvisionedOnAllVolumes
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** The operating system drive is not protected by BitLocker drive encryption. */
  @js.native
  sealed trait osNotProtected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** This computer is not provisioned with device encryption. Enable Device encryption on all volumes to comply with device encryption policy if it is supported. */
  @js.native
  sealed trait osVolumeNotProtected
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** Protection has not been enabled on the volume. Enabling protection requires a connected account. If you already have a connected account and are seeing this error, refer to the event log for more information. */
  @js.native
  sealed trait protectionNotYetEnabled
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** Protection is enabled on this volume but has been suspended. This is most likely due to an update of your computer. Reboot and try again. */
  @js.native
  sealed trait protectionSuspended
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /** An unexpected failure occurred. */
  @js.native
  sealed trait unexpectedFailure
    extends winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val deFixedDataNotSupported: deFixedDataNotSupported with java.lang.String = js.native
  val deHardwareNotCompliant: deHardwareNotCompliant with java.lang.String = js.native
  val deOsVolumeNotProtected: deOsVolumeNotProtected with java.lang.String = js.native
  val deProtectionNotYetEnabled: deProtectionNotYetEnabled with java.lang.String = js.native
  val deProtectionSuspended: deProtectionSuspended with java.lang.String = js.native
  val deWinReNotConfigured: deWinReNotConfigured with java.lang.String = js.native
  val fixedDataNotSupported: fixedDataNotSupported with java.lang.String = js.native
  val hardwareNotCompliant: hardwareNotCompliant with java.lang.String = js.native
  val lockNotConfigured: lockNotConfigured with java.lang.String = js.native
  val noFeatureLicense: noFeatureLicense with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val notProvisionedOnAllVolumes: notProvisionedOnAllVolumes with java.lang.String = js.native
  val osNotProtected: osNotProtected with java.lang.String = js.native
  val osVolumeNotProtected: osVolumeNotProtected with java.lang.String = js.native
  val protectionNotYetEnabled: protectionNotYetEnabled with java.lang.String = js.native
  val protectionSuspended: protectionSuspended with java.lang.String = js.native
  val unexpectedFailure: unexpectedFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult with java.lang.String
  ] = js.native
}

