package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy")
@js.native
class EasClientSecurityPolicy () extends IEasClientSecurityPolicy {
  /* CompleteClass */
  override var disallowConvenienceLogon: scala.Boolean = js.native
  /* CompleteClass */
  override var maxInactivityTimeLock: scala.Double = js.native
  /* CompleteClass */
  override var maxPasswordFailedAttempts: scala.Double = js.native
  /* CompleteClass */
  override var minPasswordComplexCharacters: scala.Double = js.native
  /* CompleteClass */
  override var minPasswordLength: scala.Double = js.native
  /* CompleteClass */
  override var passwordExpiration: scala.Double = js.native
  /* CompleteClass */
  override var passwordHistory: scala.Double = js.native
  /* CompleteClass */
  override var requireEncryption: scala.Boolean = js.native
  /* CompleteClass */
  override def applyAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[EasComplianceResults] = js.native
  /* CompleteClass */
  override def checkCompliance(): EasComplianceResults = js.native
}

