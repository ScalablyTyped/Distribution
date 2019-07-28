package typings.winrt.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasClientSecurityPolicy")
@js.native
class EasClientSecurityPolicy () extends IEasClientSecurityPolicy {
  /* CompleteClass */
  override var disallowConvenienceLogon: Boolean = js.native
  /* CompleteClass */
  override var maxInactivityTimeLock: Double = js.native
  /* CompleteClass */
  override var maxPasswordFailedAttempts: Double = js.native
  /* CompleteClass */
  override var minPasswordComplexCharacters: Double = js.native
  /* CompleteClass */
  override var minPasswordLength: Double = js.native
  /* CompleteClass */
  override var passwordExpiration: Double = js.native
  /* CompleteClass */
  override var passwordHistory: Double = js.native
  /* CompleteClass */
  override var requireEncryption: Boolean = js.native
  /* CompleteClass */
  override def applyAsync(): IAsyncOperation[EasComplianceResults] = js.native
  /* CompleteClass */
  override def checkCompliance(): EasComplianceResults = js.native
}

