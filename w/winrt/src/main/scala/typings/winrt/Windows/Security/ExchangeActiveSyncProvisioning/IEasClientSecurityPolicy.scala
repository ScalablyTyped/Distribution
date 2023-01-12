package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEasClientSecurityPolicy extends StObject {
  
  def applyAsync(): IAsyncOperation[EasComplianceResults]
  
  def checkCompliance(): EasComplianceResults
  
  var disallowConvenienceLogon: Boolean
  
  var maxInactivityTimeLock: Double
  
  var maxPasswordFailedAttempts: Double
  
  var minPasswordComplexCharacters: Double
  
  var minPasswordLength: Double
  
  var passwordExpiration: Double
  
  var passwordHistory: Double
  
  var requireEncryption: Boolean
}
object IEasClientSecurityPolicy {
  
  inline def apply(
    applyAsync: () => IAsyncOperation[EasComplianceResults],
    checkCompliance: () => EasComplianceResults,
    disallowConvenienceLogon: Boolean,
    maxInactivityTimeLock: Double,
    maxPasswordFailedAttempts: Double,
    minPasswordComplexCharacters: Double,
    minPasswordLength: Double,
    passwordExpiration: Double,
    passwordHistory: Double,
    requireEncryption: Boolean
  ): IEasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal(applyAsync = js.Any.fromFunction0(applyAsync), checkCompliance = js.Any.fromFunction0(checkCompliance), disallowConvenienceLogon = disallowConvenienceLogon.asInstanceOf[js.Any], maxInactivityTimeLock = maxInactivityTimeLock.asInstanceOf[js.Any], maxPasswordFailedAttempts = maxPasswordFailedAttempts.asInstanceOf[js.Any], minPasswordComplexCharacters = minPasswordComplexCharacters.asInstanceOf[js.Any], minPasswordLength = minPasswordLength.asInstanceOf[js.Any], passwordExpiration = passwordExpiration.asInstanceOf[js.Any], passwordHistory = passwordHistory.asInstanceOf[js.Any], requireEncryption = requireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEasClientSecurityPolicy] (val x: Self) extends AnyVal {
    
    inline def setApplyAsync(value: () => IAsyncOperation[EasComplianceResults]): Self = StObject.set(x, "applyAsync", js.Any.fromFunction0(value))
    
    inline def setCheckCompliance(value: () => EasComplianceResults): Self = StObject.set(x, "checkCompliance", js.Any.fromFunction0(value))
    
    inline def setDisallowConvenienceLogon(value: Boolean): Self = StObject.set(x, "disallowConvenienceLogon", value.asInstanceOf[js.Any])
    
    inline def setMaxInactivityTimeLock(value: Double): Self = StObject.set(x, "maxInactivityTimeLock", value.asInstanceOf[js.Any])
    
    inline def setMaxPasswordFailedAttempts(value: Double): Self = StObject.set(x, "maxPasswordFailedAttempts", value.asInstanceOf[js.Any])
    
    inline def setMinPasswordComplexCharacters(value: Double): Self = StObject.set(x, "minPasswordComplexCharacters", value.asInstanceOf[js.Any])
    
    inline def setMinPasswordLength(value: Double): Self = StObject.set(x, "minPasswordLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpiration(value: Double): Self = StObject.set(x, "passwordExpiration", value.asInstanceOf[js.Any])
    
    inline def setPasswordHistory(value: Double): Self = StObject.set(x, "passwordHistory", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryption(value: Boolean): Self = StObject.set(x, "requireEncryption", value.asInstanceOf[js.Any])
  }
}
