package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasRequireEncryptionResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult")
@js.native
object EasRequireEncryptionResult extends StObject {
  
  @js.native
  sealed trait canBeCompliant
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait compliant
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait deFixedDataNotSupported
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait deHardwareNotCompliant
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait deOsVolumeNotProtected
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait deProtectionNotYetEnabled
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait deProtectionSuspended
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait deWinReNotConfigured
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait noFeatureLicense
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait notEvaluated
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait notProvisionedOnAllVolumes
    extends StObject
       with EasRequireEncryptionResult
  
  @js.native
  sealed trait osNotProtected
    extends StObject
       with EasRequireEncryptionResult
}
