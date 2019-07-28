package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasComplianceResults")
@js.native
class EasComplianceResults () extends IEasComplianceResults {
  /* CompleteClass */
  override var compliant: Boolean = js.native
  /* CompleteClass */
  override var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult = js.native
  /* CompleteClass */
  override var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult = js.native
  /* CompleteClass */
  override var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult = js.native
  /* CompleteClass */
  override var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult = js.native
  /* CompleteClass */
  override var minPasswordLengthResult: EasMinPasswordLengthResult = js.native
  /* CompleteClass */
  override var passwordExpirationResult: EasPasswordExpirationResult = js.native
  /* CompleteClass */
  override var passwordHistoryResult: EasPasswordHistoryResult = js.native
  /* CompleteClass */
  override var requireEncryptionResult: EasRequireEncryptionResult = js.native
}

