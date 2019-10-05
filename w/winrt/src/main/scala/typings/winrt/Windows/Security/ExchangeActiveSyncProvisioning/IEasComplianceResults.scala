package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasComplianceResults extends js.Object {
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
    val __obj = js.Dynamic.literal(compliant = compliant, disallowConvenienceLogonResult = disallowConvenienceLogonResult, maxInactivityTimeLockResult = maxInactivityTimeLockResult, maxPasswordFailedAttemptsResult = maxPasswordFailedAttemptsResult, minPasswordComplexCharactersResult = minPasswordComplexCharactersResult, minPasswordLengthResult = minPasswordLengthResult, passwordExpirationResult = passwordExpirationResult, passwordHistoryResult = passwordHistoryResult, requireEncryptionResult = requireEncryptionResult)
  
    __obj.asInstanceOf[IEasComplianceResults]
  }
}

