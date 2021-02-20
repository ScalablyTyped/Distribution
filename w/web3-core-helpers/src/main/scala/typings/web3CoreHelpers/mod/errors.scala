package typings.web3CoreHelpers.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "errors")
@js.native
class errors () extends StObject
/* static members */
object errors {
  
  @JSImport("web3-core-helpers", "errors.ConnectionCloseError")
  @js.native
  def ConnectionCloseError(event: Boolean): Error | ConnectionError = js.native
  @JSImport("web3-core-helpers", "errors.ConnectionCloseError")
  @js.native
  def ConnectionCloseError(event: WebSocketEvent): Error | ConnectionError = js.native
  
  @JSImport("web3-core-helpers", "errors.ConnectionError")
  @js.native
  def ConnectionError(msg: String): typings.web3CoreHelpers.mod.ConnectionError = js.native
  @JSImport("web3-core-helpers", "errors.ConnectionError")
  @js.native
  def ConnectionError(msg: String, event: WebSocketEvent): typings.web3CoreHelpers.mod.ConnectionError = js.native
  
  @JSImport("web3-core-helpers", "errors.ConnectionNotOpenError")
  @js.native
  def ConnectionNotOpenError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ConnectionTimeout")
  @js.native
  def ConnectionTimeout(ms: String): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractCodeNotStoredError")
  @js.native
  def ContractCodeNotStoredError(receipt: js.Object): TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractEventDoesNotExistError")
  @js.native
  def ContractEventDoesNotExistError(eventName: String): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractMissingABIError")
  @js.native
  def ContractMissingABIError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractMissingDeployDataError")
  @js.native
  def ContractMissingDeployDataError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractNoAddressDefinedError")
  @js.native
  def ContractNoAddressDefinedError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractNoFromAddressDefinedError")
  @js.native
  def ContractNoFromAddressDefinedError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractOnceRequiresCallbackError")
  @js.native
  def ContractOnceRequiresCallbackError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ContractReservedEventError")
  @js.native
  def ContractReservedEventError(`type`: String): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ErrorResponse")
  @js.native
  def ErrorResponse(result: Error): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidConnection")
  @js.native
  def InvalidConnection(host: String): ConnectionError = js.native
  @JSImport("web3-core-helpers", "errors.InvalidConnection")
  @js.native
  def InvalidConnection(host: String, event: WebSocketEvent): ConnectionError = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidNumberOfParams")
  @js.native
  def InvalidNumberOfParams(got: Double, expected: Double, method: String): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidProvider")
  @js.native
  def InvalidProvider(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.InvalidResponse")
  @js.native
  def InvalidResponse(result: Error): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.MaxAttemptsReachedOnReconnectingError")
  @js.native
  def MaxAttemptsReachedOnReconnectingError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.NoContractAddressFoundError")
  @js.native
  def NoContractAddressFoundError(receipt: js.Object): TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.PendingRequestsOnReconnectingError")
  @js.native
  def PendingRequestsOnReconnectingError(): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.ResolverMethodMissingError")
  @js.native
  def ResolverMethodMissingError(address: String, name: String): Error = js.native
  
  @JSImport("web3-core-helpers", "errors.RevertInstructionError")
  @js.native
  def RevertInstructionError(reason: String, signature: String): typings.web3CoreHelpers.mod.RevertInstructionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionError")
  @js.native
  def TransactionError(message: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionOutOfGasError")
  @js.native
  def TransactionOutOfGasError(receipt: js.Object): TransactionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionRevertInstructionError")
  @js.native
  def TransactionRevertInstructionError(reason: String, signature: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionRevertInstructionError = js.native
  
  @JSImport("web3-core-helpers", "errors.TransactionRevertedWithoutReasonError")
  @js.native
  def TransactionRevertedWithoutReasonError(receipt: js.Object): TransactionError = js.native
}
