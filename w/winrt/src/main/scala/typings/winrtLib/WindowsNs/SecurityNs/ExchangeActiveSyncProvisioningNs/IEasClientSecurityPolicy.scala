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
    applyAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[EasComplianceResults],
    checkCompliance: () => EasComplianceResults,
    disallowConvenienceLogon: scala.Boolean,
    maxInactivityTimeLock: scala.Double,
    maxPasswordFailedAttempts: scala.Double,
    minPasswordComplexCharacters: scala.Double,
    minPasswordLength: scala.Double,
    passwordExpiration: scala.Double,
    passwordHistory: scala.Double,
    requireEncryption: scala.Boolean
  ): IEasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal(applyAsync = js.Any.fromFunction0(applyAsync), checkCompliance = js.Any.fromFunction0(checkCompliance), disallowConvenienceLogon = disallowConvenienceLogon, maxInactivityTimeLock = maxInactivityTimeLock, maxPasswordFailedAttempts = maxPasswordFailedAttempts, minPasswordComplexCharacters = minPasswordComplexCharacters, minPasswordLength = minPasswordLength, passwordExpiration = passwordExpiration, passwordHistory = passwordHistory, requireEncryption = requireEncryption)
  
    __obj.asInstanceOf[IEasClientSecurityPolicy]
  }
}

