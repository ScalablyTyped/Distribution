package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "errors")
@js.native
open class errors () extends StObject
/* static members */
object errors {
  
  @JSImport("web3-core-helpers", "errors")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConnectionCloseError(event: Boolean): js.Error | ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionCloseError")(event.asInstanceOf[js.Any]).asInstanceOf[js.Error | ConnectionError]
  inline def ConnectionCloseError(event: WebSocketEvent): js.Error | ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionCloseError")(event.asInstanceOf[js.Any]).asInstanceOf[js.Error | ConnectionError]
  
  inline def ConnectionError(msg: String): typings.web3CoreHelpers.mod.ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionError")(msg.asInstanceOf[js.Any]).asInstanceOf[typings.web3CoreHelpers.mod.ConnectionError]
  inline def ConnectionError(msg: String, event: WebSocketEvent): typings.web3CoreHelpers.mod.ConnectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionError")(msg.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.ConnectionError]
  
  inline def ConnectionNotOpenError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionNotOpenError")().asInstanceOf[js.Error]
  
  inline def ConnectionTimeout(ms: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ConnectionTimeout")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def ContractCodeNotStoredError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractCodeNotStoredError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
  
  inline def ContractEventDoesNotExistError(eventName: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractEventDoesNotExistError")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def ContractMissingABIError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractMissingABIError")().asInstanceOf[js.Error]
  
  inline def ContractMissingDeployDataError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractMissingDeployDataError")().asInstanceOf[js.Error]
  
  inline def ContractNoAddressDefinedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractNoAddressDefinedError")().asInstanceOf[js.Error]
  
  inline def ContractNoFromAddressDefinedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractNoFromAddressDefinedError")().asInstanceOf[js.Error]
  
  inline def ContractOnceRequiresCallbackError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractOnceRequiresCallbackError")().asInstanceOf[js.Error]
  
  inline def ContractReservedEventError(`type`: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ContractReservedEventError")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def ErrorResponse(result: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ErrorResponse")(result.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def InvalidConnection(host: String): ConnectionError = ^.asInstanceOf[js.Dynamic].applyDynamic("InvalidConnection")(host.asInstanceOf[js.Any]).asInstanceOf[ConnectionError]
  inline def InvalidConnection(host: String, event: WebSocketEvent): ConnectionError = (^.asInstanceOf[js.Dynamic].applyDynamic("InvalidConnection")(host.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[ConnectionError]
  
  inline def InvalidNumberOfParams(got: Double, expected: Double, method: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("InvalidNumberOfParams")(got.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def InvalidProvider(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("InvalidProvider")().asInstanceOf[js.Error]
  
  inline def InvalidResponse(result: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("InvalidResponse")(result.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def MaxAttemptsReachedOnReconnectingError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxAttemptsReachedOnReconnectingError")().asInstanceOf[js.Error]
  
  inline def NoContractAddressFoundError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoContractAddressFoundError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
  
  inline def PendingRequestsOnReconnectingError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("PendingRequestsOnReconnectingError")().asInstanceOf[js.Error]
  
  inline def ResolverMethodMissingError(address: String, name: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("ResolverMethodMissingError")(address.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def RevertInstructionError(reason: String, signature: String): typings.web3CoreHelpers.mod.RevertInstructionError = (^.asInstanceOf[js.Dynamic].applyDynamic("RevertInstructionError")(reason.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.RevertInstructionError]
  
  inline def TransactionError(message: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionError = (^.asInstanceOf[js.Dynamic].applyDynamic("TransactionError")(message.asInstanceOf[js.Any], receipt.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.TransactionError]
  
  inline def TransactionOutOfGasError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("TransactionOutOfGasError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
  
  inline def TransactionRevertInstructionError(reason: String, signature: String, receipt: js.Object): typings.web3CoreHelpers.mod.TransactionRevertInstructionError = (^.asInstanceOf[js.Dynamic].applyDynamic("TransactionRevertInstructionError")(reason.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], receipt.asInstanceOf[js.Any])).asInstanceOf[typings.web3CoreHelpers.mod.TransactionRevertInstructionError]
  
  inline def TransactionRevertedWithoutReasonError(receipt: js.Object): TransactionError = ^.asInstanceOf[js.Dynamic].applyDynamic("TransactionRevertedWithoutReasonError")(receipt.asInstanceOf[js.Any]).asInstanceOf[TransactionError]
}
