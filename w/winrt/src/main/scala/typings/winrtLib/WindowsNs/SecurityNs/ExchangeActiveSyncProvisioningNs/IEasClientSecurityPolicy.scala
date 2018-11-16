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

