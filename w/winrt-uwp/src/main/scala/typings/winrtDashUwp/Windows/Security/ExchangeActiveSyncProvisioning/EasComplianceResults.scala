package typings.winrtDashUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the mail app with the results of the evaluation of the EAS security policies. Every policy being evaluated returns an enumerated value indicating the evaluation results against the policy. The evaluations results are encapsulated in the EasComplianceResults object for the caller app to retrieve. */
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults")
@js.native
abstract class EasComplianceResults () extends js.Object {
  /** Returns the result of whether the computer is compliant with the EAS policies. */
  var compliant: Boolean = js.native
  /** Returns the result of whether convenience logons are disallowed. */
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
  /** Gets the type of the Exchange ActiveSync encryption provider. */
  var encryptionProviderType: EasEncryptionProviderType = js.native
  /** Returns the result of the maximum time of inactivity allowed before the computer is locked. */
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
  /** Returns the result of the maximum number of failed password attempts allowed. */
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
  /** Returns the result of the minimum number of complex password characters required. */
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
  /** Returns the result of the minimum length of the password required. */
  var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
  /** Returns the result of whether the password is expired. */
  var passwordExpirationResult: EasPasswordExpirationResult = js.native
  /** Returns the result of the history of passwords. */
  var passwordHistoryResult: EasPasswordHistoryResult = js.native
  /** Returns the result of whether encryption is required. */
  var requireEncryptionResult: EasRequireEncryptionResult = js.native
}

