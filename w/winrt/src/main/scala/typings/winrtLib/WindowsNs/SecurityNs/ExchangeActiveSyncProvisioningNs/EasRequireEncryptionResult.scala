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
  
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val deFixedDataNotSupported: deFixedDataNotSupported with java.lang.String = js.native
  val deHardwareNotCompliant: deHardwareNotCompliant with java.lang.String = js.native
  val deOsVolumeNotProtected: deOsVolumeNotProtected with java.lang.String = js.native
  val deProtectionNotYetEnabled: deProtectionNotYetEnabled with java.lang.String = js.native
  val deProtectionSuspended: deProtectionSuspended with java.lang.String = js.native
  val deWinReNotConfigured: deWinReNotConfigured with java.lang.String = js.native
  val noFeatureLicense: noFeatureLicense with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val notProvisionedOnAllVolumes: notProvisionedOnAllVolumes with java.lang.String = js.native
  val osNotProtected: osNotProtected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasRequireEncryptionResult with java.lang.String
  ] = js.native
}

