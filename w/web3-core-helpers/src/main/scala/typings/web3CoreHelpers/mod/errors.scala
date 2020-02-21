package typings.web3CoreHelpers.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "errors")
@js.native
class errors () extends js.Object

/* static members */
@JSImport("web3-core-helpers", "errors")
@js.native
object errors extends js.Object {
  def ConnectionTimeout(ms: String): Error = js.native
  def ContractCodeNotStoredError(receipt: js.Object): TransactionError = js.native
  def ErrorResponse(result: Error): Error = js.native
  def InvalidConnection(host: String): Error = js.native
  def InvalidNumberOfParams(got: Double, expected: Double, method: String): Error = js.native
  def InvalidProvider(): Error = js.native
  def InvalidResponse(result: Error): Error = js.native
  def NoContractAddressFoundError(receipt: js.Object): TransactionError = js.native
  def RevertInstructionError(reason: String, signature: String): typings.web3CoreHelpers.mod.RevertInstructionError = js.native
  def TransactionError(message: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionError = js.native
  def TransactionOutOfGasError(receipt: js.Object): TransactionError = js.native
  def TransactionRevertInstructionError(reason: String, signature: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionRevertInstructionError = js.native
  def TransactionRevertedWithoutReasonError(receipt: js.Object): TransactionError = js.native
}

