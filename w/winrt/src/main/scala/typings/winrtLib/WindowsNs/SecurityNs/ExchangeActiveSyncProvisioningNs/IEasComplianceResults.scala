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

