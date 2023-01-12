package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEasComplianceResults extends StObject {
  
  var compliant: Boolean
  
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult
  
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult
  
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult
  
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult
  
  var minPasswordLengthResult: EasMinPasswordLengthResult
  
  var passwordExpirationResult: EasPasswordExpirationResult
  
  var passwordHistoryResult: EasPasswordHistoryResult
  
  var requireEncryptionResult: EasRequireEncryptionResult
}
object IEasComplianceResults {
  
  inline def apply(
    compliant: Boolean,
    disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult,
    maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult,
    maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult,
    minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult,
    minPasswordLengthResult: EasMinPasswordLengthResult,
    passwordExpirationResult: EasPasswordExpirationResult,
    passwordHistoryResult: EasPasswordHistoryResult,
    requireEncryptionResult: EasRequireEncryptionResult
  ): IEasComplianceResults = {
    val __obj = js.Dynamic.literal(compliant = compliant.asInstanceOf[js.Any], disallowConvenienceLogonResult = disallowConvenienceLogonResult.asInstanceOf[js.Any], maxInactivityTimeLockResult = maxInactivityTimeLockResult.asInstanceOf[js.Any], maxPasswordFailedAttemptsResult = maxPasswordFailedAttemptsResult.asInstanceOf[js.Any], minPasswordComplexCharactersResult = minPasswordComplexCharactersResult.asInstanceOf[js.Any], minPasswordLengthResult = minPasswordLengthResult.asInstanceOf[js.Any], passwordExpirationResult = passwordExpirationResult.asInstanceOf[js.Any], passwordHistoryResult = passwordHistoryResult.asInstanceOf[js.Any], requireEncryptionResult = requireEncryptionResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasComplianceResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEasComplianceResults] (val x: Self) extends AnyVal {
    
    inline def setCompliant(value: Boolean): Self = StObject.set(x, "compliant", value.asInstanceOf[js.Any])
    
    inline def setDisallowConvenienceLogonResult(value: EasDisallowConvenienceLogonResult): Self = StObject.set(x, "disallowConvenienceLogonResult", value.asInstanceOf[js.Any])
    
    inline def setMaxInactivityTimeLockResult(value: EasMaxInactivityTimeLockResult): Self = StObject.set(x, "maxInactivityTimeLockResult", value.asInstanceOf[js.Any])
    
    inline def setMaxPasswordFailedAttemptsResult(value: EasMaxPasswordFailedAttemptsResult): Self = StObject.set(x, "maxPasswordFailedAttemptsResult", value.asInstanceOf[js.Any])
    
    inline def setMinPasswordComplexCharactersResult(value: EasMinPasswordComplexCharactersResult): Self = StObject.set(x, "minPasswordComplexCharactersResult", value.asInstanceOf[js.Any])
    
    inline def setMinPasswordLengthResult(value: EasMinPasswordLengthResult): Self = StObject.set(x, "minPasswordLengthResult", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationResult(value: EasPasswordExpirationResult): Self = StObject.set(x, "passwordExpirationResult", value.asInstanceOf[js.Any])
    
    inline def setPasswordHistoryResult(value: EasPasswordHistoryResult): Self = StObject.set(x, "passwordHistoryResult", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryptionResult(value: EasRequireEncryptionResult): Self = StObject.set(x, "requireEncryptionResult", value.asInstanceOf[js.Any])
  }
}
