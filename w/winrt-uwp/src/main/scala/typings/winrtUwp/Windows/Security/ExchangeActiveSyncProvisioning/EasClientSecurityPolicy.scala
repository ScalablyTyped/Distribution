package typings.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Modern mail apps evaluate and apply the EAS security policies. An EasClientSecurityPolicy object is constructed by the caller app to set policies received from the Exchange server or application. */
trait EasClientSecurityPolicy extends js.Object {
  /** Gets or sets the ability to prevent convenience logons. DisallowConvenienceLogon is not defined in MS-ASPROV. It is mapped from MS-ASPROV AllowSimplePassword with respect to the Windows password policies. */
  var disallowConvenienceLogon: Boolean
  /** Gets or sets the maximum length of time the computer can remain inactive before it is locked. The MS-ASPROV name is MaxInactivityTimeDeviceLock. */
  var maxInactivityTimeLock: Double
  /** Gets or sets the maximum number of failed password attempts for logging on. The MS-ASPROV name is MaxDevicePasswordFailedAttempts. */
  var maxPasswordFailedAttempts: Double
  /** Gets or sets the minimum number of complex characters that are required for a password. The MS-ASPROV name is MinDevicePasswordComplexCharacters. */
  var minPasswordComplexCharacters: Double
  /** Gets or set the minimum length of password allowed. The MS-ASPROV name is MinPasswordLength. */
  var minPasswordLength: Double
  /** Gets or set the length of time that a password is valid. The MS-ASPROV name is DevicePasswordExpiration. */
  var passwordExpiration: Double
  /** Gets or set the password information previously used. The MS-ASPROV name is DevicePasswordHistory. */
  var passwordHistory: Double
  /** Gets or sets whether encryption is required. The MS-ASPROV name is RequireDeviceEncryption. */
  var requireEncryption: Boolean
  /**
    * Applies the EAS policies in asynchronous mode once the user consents. ApplyAsync is called by a Windows Store app for mail any time the app wants to make the local computer compliant.
    * @return Returns the evaluation of the callback results, in asynchronous mode, back to the calling app.
    */
  def applyAsync(): IPromiseWithIAsyncOperation[EasComplianceResults]
  /**
    * Evaluates the EAS policies. CheckCompliance is called by a Windows Store app for mail any time the app wants to evaluate whether the local computer is compliant to the given EAS policies. Because this call doesn't involve any UI interactions, it is a synchronous call.
    * @return Returns the results of the compliance check, in synchronous mode.
    */
  def checkCompliance(): EasComplianceResults
}

object EasClientSecurityPolicy {
  @scala.inline
  def apply(
    applyAsync: () => IPromiseWithIAsyncOperation[EasComplianceResults],
    checkCompliance: () => EasComplianceResults,
    disallowConvenienceLogon: Boolean,
    maxInactivityTimeLock: Double,
    maxPasswordFailedAttempts: Double,
    minPasswordComplexCharacters: Double,
    minPasswordLength: Double,
    passwordExpiration: Double,
    passwordHistory: Double,
    requireEncryption: Boolean
  ): EasClientSecurityPolicy = {
    val __obj = js.Dynamic.literal(applyAsync = js.Any.fromFunction0(applyAsync), checkCompliance = js.Any.fromFunction0(checkCompliance), disallowConvenienceLogon = disallowConvenienceLogon.asInstanceOf[js.Any], maxInactivityTimeLock = maxInactivityTimeLock.asInstanceOf[js.Any], maxPasswordFailedAttempts = maxPasswordFailedAttempts.asInstanceOf[js.Any], minPasswordComplexCharacters = minPasswordComplexCharacters.asInstanceOf[js.Any], minPasswordLength = minPasswordLength.asInstanceOf[js.Any], passwordExpiration = passwordExpiration.asInstanceOf[js.Any], passwordHistory = passwordHistory.asInstanceOf[js.Any], requireEncryption = requireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasClientSecurityPolicy]
  }
}

