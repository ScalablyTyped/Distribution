package typings.web3CoreHelpers.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "errors")
@js.native
class errors () extends StObject
/* static members */
object errors {
  
  @JSImport("web3-core-helpers", "errors")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConnectionCloseError(event: Boolean): Error | ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionCloseError")(event.asInstanceOf[js.Any]).asInstanceOf[Error | ConnectionError]
  inline def ConnectionCloseError(event: WebSocketEvent): Error | ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionCloseError")(event.asInstanceOf[js.Any]).asInstanceOf[Error | ConnectionError]
  
  inline def ConnectionError(msg: String): typings.web3CoreHelpers.mod.ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionError")(msg.asInstanceOf[js.Any]).asInstanceOf[typings.web3CoreHelpers.mod.ConnectionError]
  inline def ConnectionError(msg: String, event: WebSocketEvent): typings.web3CoreHelpers.mod.ConnectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionError")(msg.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.ConnectionError]
  
  inline def ConnectionNotOpenError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionNotOpenError")().asInstanceOf[Error]
  
  inline def ConnectionTimeout(ms: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionTimeout")(ms.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def ContractCodeNotStoredError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractCodeNotStoredError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
  
  inline def ContractEventDoesNotExistError(eventName: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractEventDoesNotExistError")(eventName.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def ContractMissingABIError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractMissingABIError")().asInstanceOf[Error]
  
  inline def ContractMissingDeployDataError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractMissingDeployDataError")().asInstanceOf[Error]
  
  inline def ContractNoAddressDefinedError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractNoAddressDefinedError")().asInstanceOf[Error]
  
  inline def ContractNoFromAddressDefinedError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractNoFromAddressDefinedError")().asInstanceOf[Error]
  
  inline def ContractOnceRequiresCallbackError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractOnceRequiresCallbackError")().asInstanceOf[Error]
  
  inline def ContractReservedEventError(`type`: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractReservedEventError")(`type`.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def ErrorResponse(result: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ErrorResponse")(result.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def InvalidConnection(host: String): ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("InvalidConnection")(host.asInstanceOf[js.Any]).asInstanceOf[ConnectionError]
  inline def InvalidConnection(host: String, event: WebSocketEvent): ConnectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("InvalidConnection")(host.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[ConnectionError]
  
  inline def InvalidNumberOfParams(got: Double, expected: Double, method: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("InvalidNumberOfParams")(got.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def InvalidProvider(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("InvalidProvider")().asInstanceOf[Error]
  
  inline def InvalidResponse(result: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("InvalidResponse")(result.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def MaxAttemptsReachedOnReconnectingError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxAttemptsReachedOnReconnectingError")().asInstanceOf[Error]
  
  inline def NoContractAddressFoundError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoContractAddressFoundError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
  
  inline def PendingRequestsOnReconnectingError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("PendingRequestsOnReconnectingError")().asInstanceOf[Error]
  
  inline def ResolverMethodMissingError(address: String, name: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("ResolverMethodMissingError")(address.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def RevertInstructionError(reason: String, signature: String): typings.web3CoreHelpers.mod.RevertInstructionError = (^.asInstanceOf[js.Dynamic].applyDynamic("RevertInstructionError")(reason.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.RevertInstructionError]
  
  inline def TransactionError(message: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionError = (^.asInstanceOf[js.Dynamic].applyDynamic("TransactionError")(message.asInstanceOf[js.Any], receipt.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.TransactionError]
  
  inline def TransactionOutOfGasError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("TransactionOutOfGasError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
  
  inline def TransactionRevertInstructionError(reason: String, signature: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionRevertInstructionError = (^.asInstanceOf[js.Dynamic].applyDynamic("TransactionRevertInstructionError")(reason.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], receipt.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.TransactionRevertInstructionError]
  
  inline def TransactionRevertedWithoutReasonError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("TransactionRevertedWithoutReasonError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
}
