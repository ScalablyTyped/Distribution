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
    val __obj = js.Dynamic.literal(applyAsync = applyAsync, checkCompliance = checkCompliance, disallowConvenienceLogon = disallowConvenienceLogon, maxInactivityTimeLock = maxInactivityTimeLock, maxPasswordFailedAttempts = maxPasswordFailedAttempts, minPasswordComplexCharacters = minPasswordComplexCharacters, minPasswordLength = minPasswordLength, passwordExpiration = passwordExpiration, passwordHistory = passwordHistory, requireEncryption = requireEncryption)
  
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
}

