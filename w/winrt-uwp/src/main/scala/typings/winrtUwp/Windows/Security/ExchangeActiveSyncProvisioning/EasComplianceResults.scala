package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
trait EasComplianceResults extends js.Object {
  /** Returns the result of whether the computer is compliant with the EAS policies. */
  var compliant: Boolean
  /** Returns the result of whether convenience logons are disallowed. */
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult
  /** Gets the type of the Exchange ActiveSync encryption provider. */
  var encryptionProviderType: EasEncryptionProviderType
  /** Returns the result of the maximum time of inactivity allowed before the computer is locked. */
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult
  /** Returns the result of the maximum number of failed password attempts allowed. */
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult
  /** Returns the result of the minimum number of complex password characters required. */
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult
  /** Returns the result of the minimum length of the password required. */
  var minPasswordLengthResult: EasMinPasswordLengthResult
  /** Returns the result of whether the password is expired. */
  var passwordExpirationResult: EasPasswordExpirationResult
  /** Returns the result of the history of passwords. */
  var passwordHistoryResult: EasPasswordHistoryResult
  /** Returns the result of whether encryption is required. */
  var requireEncryptionResult: EasRequireEncryptionResult
}

object EasComplianceResults {
  @scala.inline
  def apply(
    compliant: Boolean,
    disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult,
    encryptionProviderType: EasEncryptionProviderType,
    maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult,
    maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult,
    minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult,
    minPasswordLengthResult: EasMinPasswordLengthResult,
    passwordExpirationResult: EasPasswordExpirationResult,
    passwordHistoryResult: EasPasswordHistoryResult,
    requireEncryptionResult: EasRequireEncryptionResult
  ): EasComplianceResults = {
    val __obj = js.Dynamic.literal(compliant = compliant.asInstanceOf[js.Any], disallowConvenienceLogonResult = disallowConvenienceLogonResult.asInstanceOf[js.Any], encryptionProviderType = encryptionProviderType.asInstanceOf[js.Any], maxInactivityTimeLockResult = maxInactivityTimeLockResult.asInstanceOf[js.Any], maxPasswordFailedAttemptsResult = maxPasswordFailedAttemptsResult.asInstanceOf[js.Any], minPasswordComplexCharactersResult = minPasswordComplexCharactersResult.asInstanceOf[js.Any], minPasswordLengthResult = minPasswordLengthResult.asInstanceOf[js.Any], passwordExpirationResult = passwordExpirationResult.asInstanceOf[js.Any], passwordHistoryResult = passwordHistoryResult.asInstanceOf[js.Any], requireEncryptionResult = requireEncryptionResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasComplianceResults]
  }
}

