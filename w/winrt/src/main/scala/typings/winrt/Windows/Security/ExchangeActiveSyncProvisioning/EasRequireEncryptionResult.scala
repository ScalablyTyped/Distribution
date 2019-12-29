package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EasRequireEncryptionResult with Double] = js.native
  /* 2 */ @js.native
  object canBeCompliant extends TopLevel[canBeCompliant with Double]
  
  /* 1 */ @js.native
  object compliant extends TopLevel[compliant with Double]
  
  /* 4 */ @js.native
  object deFixedDataNotSupported extends TopLevel[deFixedDataNotSupported with Double]
  
  /* 5 */ @js.native
  object deHardwareNotCompliant extends TopLevel[deHardwareNotCompliant with Double]
  
  /* 8 */ @js.native
  object deOsVolumeNotProtected extends TopLevel[deOsVolumeNotProtected with Double]
  
  /* 9 */ @js.native
  object deProtectionNotYetEnabled extends TopLevel[deProtectionNotYetEnabled with Double]
  
  /* 7 */ @js.native
  object deProtectionSuspended extends TopLevel[deProtectionSuspended with Double]
  
  /* 6 */ @js.native
  object deWinReNotConfigured extends TopLevel[deWinReNotConfigured with Double]
  
  /* 10 */ @js.native
  object noFeatureLicense extends TopLevel[noFeatureLicense with Double]
  
  /* 0 */ @js.native
  object notEvaluated extends TopLevel[notEvaluated with Double]
  
  /* 3 */ @js.native
  object notProvisionedOnAllVolumes extends TopLevel[notProvisionedOnAllVolumes with Double]
  
  /* 11 */ @js.native
  object osNotProtected extends TopLevel[osNotProtected with Double]
  
}

