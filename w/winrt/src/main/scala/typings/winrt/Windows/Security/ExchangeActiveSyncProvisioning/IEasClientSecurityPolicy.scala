package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEasClientSecurityPolicy extends StObject {
  
  def applyAsync(): IAsyncOperation[EasComplianceResults] = js.native
  
  def checkCompliance(): EasComplianceResults = js.native
  
  var disallowConvenienceLogon: Boolean = js.native
  
  var maxInactivityTimeLock: Double = js.native
  
  var maxPasswordFailedAttempts: Double = js.native
  
  var minPasswordComplexCharacters: Double = js.native
  
  var minPasswordLength: Double = js.native
  
  var passwordExpiration: Double = js.native
  
  var passwordHistory: Double = js.native
  
  var requireEncryption: Boolean = js.native
}
object IEasClientSecurityPolicy {
  
  @scala.inline
  def apply(
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
  implicit class IEasClientSecurityPolicyMutableBuilder[Self <: IEasClientSecurityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyAsync(value: () => IAsyncOperation[EasComplianceResults]): Self = StObject.set(x, "applyAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckCompliance(value: () => EasComplianceResults): Self = StObject.set(x, "checkCompliance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisallowConvenienceLogon(value: Boolean): Self = StObject.set(x, "disallowConvenienceLogon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInactivityTimeLock(value: Double): Self = StObject.set(x, "maxInactivityTimeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPasswordFailedAttempts(value: Double): Self = StObject.set(x, "maxPasswordFailedAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPasswordComplexCharacters(value: Double): Self = StObject.set(x, "minPasswordComplexCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPasswordLength(value: Double): Self = StObject.set(x, "minPasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpiration(value: Double): Self = StObject.set(x, "passwordExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHistory(value: Double): Self = StObject.set(x, "passwordHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireEncryption(value: Boolean): Self = StObject.set(x, "requireEncryption", value.asInstanceOf[js.Any])
  }
}
