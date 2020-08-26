package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEasComplianceResults extends js.Object {
  var compliant: Boolean = js.native
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
  var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
  var passwordExpirationResult: EasPasswordExpirationResult = js.native
  var passwordHistoryResult: EasPasswordHistoryResult = js.native
  var requireEncryptionResult: EasRequireEncryptionResult = js.native
}

object IEasComplianceResults {
  @scala.inline
  def apply(
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
  implicit class IEasComplianceResultsOps[Self <: IEasComplianceResults] (val x: Self) extends AnyVal {
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
    def setCompliant(value: Boolean): Self = this.set("compliant", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallowConvenienceLogonResult(value: EasDisallowConvenienceLogonResult): Self = this.set("disallowConvenienceLogonResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxInactivityTimeLockResult(value: EasMaxInactivityTimeLockResult): Self = this.set("maxInactivityTimeLockResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxPasswordFailedAttemptsResult(value: EasMaxPasswordFailedAttemptsResult): Self = this.set("maxPasswordFailedAttemptsResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPasswordComplexCharactersResult(value: EasMinPasswordComplexCharactersResult): Self = this.set("minPasswordComplexCharactersResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPasswordLengthResult(value: EasMinPasswordLengthResult): Self = this.set("minPasswordLengthResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordExpirationResult(value: EasPasswordExpirationResult): Self = this.set("passwordExpirationResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordHistoryResult(value: EasPasswordHistoryResult): Self = this.set("passwordHistoryResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireEncryptionResult(value: EasRequireEncryptionResult): Self = this.set("requireEncryptionResult", value.asInstanceOf[js.Any])
  }
  
}

