package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEasClientSecurityPolicy extends js.Object {
  var disallowConvenienceLogon: Boolean = js.native
  var maxInactivityTimeLock: Double = js.native
  var maxPasswordFailedAttempts: Double = js.native
  var minPasswordComplexCharacters: Double = js.native
  var minPasswordLength: Double = js.native
  var passwordExpiration: Double = js.native
  var passwordHistory: Double = js.native
  var requireEncryption: Boolean = js.native
  def applyAsync(): IAsyncOperation[EasComplianceResults] = js.native
  def checkCompliance(): EasComplianceResults = js.native
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
  implicit class IEasClientSecurityPolicyOps[Self <: IEasClientSecurityPolicy] (val x: Self) extends AnyVal {
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
    def setApplyAsync(value: () => IAsyncOperation[EasComplianceResults]): Self = this.set("applyAsync", js.Any.fromFunction0(value))
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

