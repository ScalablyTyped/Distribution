package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasRequireEncryptionResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
@js.native
object EasRequireEncryptionResult extends js.Object {
  @js.native
  sealed trait canBeCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait compliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait deFixedDataNotSupported
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait deHardwareNotCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait deOsVolumeNotProtected
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait deProtectionNotYetEnabled
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait deProtectionSuspended
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait deWinReNotConfigured
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait noFeatureLicense
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait notEvaluated
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait notProvisionedOnAllVolumes
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  @js.native
  sealed trait osNotProtected
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult
  
  /* 2 */ val canBeCompliant: canBeCompliant with scala.Double = js.native
  /* 1 */ val compliant: compliant with scala.Double = js.native
  /* 4 */ val deFixedDataNotSupported: deFixedDataNotSupported with scala.Double = js.native
  /* 5 */ val deHardwareNotCompliant: deHardwareNotCompliant with scala.Double = js.native
  /* 8 */ val deOsVolumeNotProtected: deOsVolumeNotProtected with scala.Double = js.native
  /* 9 */ val deProtectionNotYetEnabled: deProtectionNotYetEnabled with scala.Double = js.native
  /* 7 */ val deProtectionSuspended: deProtectionSuspended with scala.Double = js.native
  /* 6 */ val deWinReNotConfigured: deWinReNotConfigured with scala.Double = js.native
  /* 10 */ val noFeatureLicense: noFeatureLicense with scala.Double = js.native
  /* 0 */ val notEvaluated: notEvaluated with scala.Double = js.native
  /* 3 */ val notProvisionedOnAllVolumes: notProvisionedOnAllVolumes with scala.Double = js.native
  /* 11 */ val osNotProtected: osNotProtected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult with scala.Double
  ] = js.native
}

