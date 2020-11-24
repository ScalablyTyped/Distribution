package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Modern mail apps evaluate and apply the EAS security policies. An EasClientSecurityPolicy object is constructed by the caller app to set policies received from the Exchange server or application. */
@js.native
trait EasClientSecurityPolicy extends js.Object {
  
  /**
    * Applies the EAS policies in asynchronous mode once the user consents. ApplyAsync is called by a Windows Store app for mail any time the app wants to make the local computer compliant.
    * @return Returns the evaluation of the callback results, in asynchronous mode, back to the calling app.
    */
  def applyAsync(): IPromiseWithIAsyncOperation[EasComplianceResults] = js.native
  
  /**
    * Evaluates the EAS policies. CheckCompliance is called by a Windows Store app for mail any time the app wants to evaluate whether the local computer is compliant to the given EAS policies. Because this call doesn't involve any UI interactions, it is a synchronous call.
    * @return Returns the results of the compliance check, in synchronous mode.
    */
  def checkCompliance(): EasComplianceResults = js.native
  
  /** Gets or sets the ability to prevent convenience logons. DisallowConvenienceLogon is not defined in MS-ASPROV. It is mapped from MS-ASPROV AllowSimplePassword with respect to the Windows password policies. */
  var disallowConvenienceLogon: Boolean = js.native
  
  /** Gets or sets the maximum length of time the computer can remain inactive before it is locked. The MS-ASPROV name is MaxInactivityTimeDeviceLock. */
  var maxInactivityTimeLock: Double = js.native
  
  /** Gets or sets the maximum number of failed password attempts for logging on. The MS-ASPROV name is MaxDevicePasswordFailedAttempts. */
  var maxPasswordFailedAttempts: Double = js.native
  
  /** Gets or sets the minimum number of complex characters that are required for a password. The MS-ASPROV name is MinDevicePasswordComplexCharacters. */
  var minPasswordComplexCharacters: Double = js.native
  
  /** Gets or set the minimum length of password allowed. The MS-ASPROV name is MinPasswordLength. */
  var minPasswordLength: Double = js.native
  
  /** Gets or set the length of time that a password is valid. The MS-ASPROV name is DevicePasswordExpiration. */
  var passwordExpiration: Double = js.native
  
  /** Gets or set the password information previously used. The MS-ASPROV name is DevicePasswordHistory. */
  var passwordHistory: Double = js.native
  
  /** Gets or sets whether encryption is required. The MS-ASPROV name is RequireDeviceEncryption. */
  var requireEncryption: Boolean = js.native
}
object EasClientSecurityPolicy {
  
  @scala.inline
  def apply(
    applyAsync: () => IPromiseWithIAsyncOperation[EasComplianceResults],
    checkCompliance: () => EasComplianceResults,
    disallowConvenienceLogon: Boolean,
    maxInactivityTimeLock: Double,
    maxPasswordFailedAttempts: Double,
    minPasswordComplexCharacters: Double,
    minPasswordLength: Double,
    passwordExpiration: Double,
    passwordHistory: Double,
    requireEncryption: Boolean
  ): EasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal(applyAsync = js.Any.fromFunction0(applyAsync), checkCompliance = js.Any.fromFunction0(checkCompliance), disallowConvenienceLogon = disallowConvenienceLogon.asInstanceOf[js.Any], maxInactivityTimeLock = maxInactivityTimeLock.asInstanceOf[js.Any], maxPasswordFailedAttempts = maxPasswordFailedAttempts.asInstanceOf[js.Any], minPasswordComplexCharacters = minPasswordComplexCharacters.asInstanceOf[js.Any], minPasswordLength = minPasswordLength.asInstanceOf[js.Any], passwordExpiration = passwordExpiration.asInstanceOf[js.Any], passwordHistory = passwordHistory.asInstanceOf[js.Any], requireEncryption = requireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasClientSecurityPolicy]
  }
  
  @scala.inline
  implicit class EasClientSecurityPolicyOps[Self <: EasClientSecurityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyAsync(value: () => IPromiseWithIAsyncOperation[EasComplianceResults]): Self = this.set("applyAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckCompliance(value: () => EasComplianceResults): Self = this.set("checkCompliance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisallowConvenienceLogon(value: Boolean): Self = this.set("disallowConvenienceLogon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInactivityTimeLock(value: Double): Self = this.set("maxInactivityTimeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPasswordFailedAttempts(value: Double): Self = this.set("maxPasswordFailedAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPasswordComplexCharacters(value: Double): Self = this.set("minPasswordComplexCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPasswordLength(value: Double): Self = this.set("minPasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpiration(value: Double): Self = this.set("passwordExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHistory(value: Double): Self = this.set("passwordHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireEncryption(value: Boolean): Self = this.set("requireEncryption", value.asInstanceOf[js.Any])
  }
}
