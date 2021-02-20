package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasRequireEncryptionResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
@js.native
object EasRequireEncryptionResult extends StObject {
  
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
}
