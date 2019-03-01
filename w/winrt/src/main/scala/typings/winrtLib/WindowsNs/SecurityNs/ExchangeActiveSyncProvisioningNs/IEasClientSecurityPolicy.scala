package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasClientSecurityPolicy extends js.Object {
  var disallowConvenienceLogon: scala.Boolean
  var maxInactivityTimeLock: scala.Double
  var maxPasswordFailedAttempts: scala.Double
  var minPasswordComplexCharacters: scala.Double
  var minPasswordLength: scala.Double
  var passwordExpiration: scala.Double
  var passwordHistory: scala.Double
  var requireEncryption: scala.Boolean
  def applyAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[EasComplianceResults]
  def checkCompliance(): EasComplianceResults
}

object IEasClientSecurityPolicy {
  @scala.inline
  def apply(
    applyAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[EasComplianceResults]],
    checkCompliance: js.Function0[EasComplianceResults],
    disallowConvenienceLogon: scala.Boolean,
    maxInactivityTimeLock: scala.Double,
    maxPasswordFailedAttempts: scala.Double,
    minPasswordComplexCharacters: scala.Double,
    minPasswordLength: scala.Double,
    passwordExpiration: scala.Double,
    passwordHistory: scala.Double,
    requireEncryption: scala.Boolean
  ): IEasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyAsync")(applyAsync)
    __obj.updateDynamic("checkCompliance")(checkCompliance)
    __obj.updateDynamic("disallowConvenienceLogon")(disallowConvenienceLogon)
    __obj.updateDynamic("maxInactivityTimeLock")(maxInactivityTimeLock)
    __obj.updateDynamic("maxPasswordFailedAttempts")(maxPasswordFailedAttempts)
    __obj.updateDynamic("minPasswordComplexCharacters")(minPasswordComplexCharacters)
    __obj.updateDynamic("minPasswordLength")(minPasswordLength)
    __obj.updateDynamic("passwordExpiration")(passwordExpiration)
    __obj.updateDynamic("passwordHistory")(passwordHistory)
    __obj.updateDynamic("requireEncryption")(requireEncryption)
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
}

