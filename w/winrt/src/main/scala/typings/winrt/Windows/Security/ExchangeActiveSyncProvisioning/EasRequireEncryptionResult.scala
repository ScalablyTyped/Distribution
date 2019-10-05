package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasRequireEncryptionResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
@js.native
object EasRequireEncryptionResult extends js.Object {
  @js.native
  sealed trait canBeCompliant extends EasRequireEncryptionResult
  
  @js.native
  sealed trait compliant extends EasRequireEncryptionResult
  
  @js.native
  sealed trait deFixedDataNotSupported extends EasRequireEncryptionResult
  
  @js.native
  sealed trait deHardwareNotCompliant extends EasRequireEncryptionResult
  
  @js.native
  sealed trait deOsVolumeNotProtected extends EasRequireEncryptionResult
  
  @js.native
  sealed trait deProtectionNotYetEnabled extends EasRequireEncryptionResult
  
  @js.native
  sealed trait deProtectionSuspended extends EasRequireEncryptionResult
  
  @js.native
  sealed trait deWinReNotConfigured extends EasRequireEncryptionResult
  
  @js.native
  sealed trait noFeatureLicense extends EasRequireEncryptionResult
  
  @js.native
  sealed trait notEvaluated extends EasRequireEncryptionResult
  
  @js.native
  sealed trait notProvisionedOnAllVolumes extends EasRequireEncryptionResult
  
  @js.native
  sealed trait osNotProtected extends EasRequireEncryptionResult
  
  /* 2 */ val canBeCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.canBeCompliant with Double = js.native
  /* 1 */ val compliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.compliant with Double = js.native
  /* 4 */ val deFixedDataNotSupported: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deFixedDataNotSupported with Double = js.native
  /* 5 */ val deHardwareNotCompliant: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deHardwareNotCompliant with Double = js.native
  /* 8 */ val deOsVolumeNotProtected: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deOsVolumeNotProtected with Double = js.native
  /* 9 */ val deProtectionNotYetEnabled: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionNotYetEnabled with Double = js.native
  /* 7 */ val deProtectionSuspended: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deProtectionSuspended with Double = js.native
  /* 6 */ val deWinReNotConfigured: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.deWinReNotConfigured with Double = js.native
  /* 10 */ val noFeatureLicense: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.noFeatureLicense with Double = js.native
  /* 0 */ val notEvaluated: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notEvaluated with Double = js.native
  /* 3 */ val notProvisionedOnAllVolumes: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.notProvisionedOnAllVolumes with Double = js.native
  /* 11 */ val osNotProtected: typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult.osNotProtected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasRequireEncryptionResult with Double] = js.native
}

