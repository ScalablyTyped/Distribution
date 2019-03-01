package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasComplianceResults extends js.Object {
  var compliant: scala.Boolean
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
    compliant: scala.Boolean,
    disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult,
    maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult,
    maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult,
    minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult,
    minPasswordLengthResult: EasMinPasswordLengthResult,
    passwordExpirationResult: EasPasswordExpirationResult,
    passwordHistoryResult: EasPasswordHistoryResult,
    requireEncryptionResult: EasRequireEncryptionResult
  ): IEasComplianceResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compliant")(compliant)
    __obj.updateDynamic("disallowConvenienceLogonResult")(disallowConvenienceLogonResult)
    __obj.updateDynamic("maxInactivityTimeLockResult")(maxInactivityTimeLockResult)
    __obj.updateDynamic("maxPasswordFailedAttemptsResult")(maxPasswordFailedAttemptsResult)
    __obj.updateDynamic("minPasswordComplexCharactersResult")(minPasswordComplexCharactersResult)
    __obj.updateDynamic("minPasswordLengthResult")(minPasswordLengthResult)
    __obj.updateDynamic("passwordExpirationResult")(passwordExpirationResult)
    __obj.updateDynamic("passwordHistoryResult")(passwordHistoryResult)
    __obj.updateDynamic("requireEncryptionResult")(requireEncryptionResult)
    __obj.asInstanceOf[IEasComplianceResults]
  }
}

