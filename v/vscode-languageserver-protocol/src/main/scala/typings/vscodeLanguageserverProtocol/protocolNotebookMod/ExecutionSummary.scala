package typings.vscodeLanguageserverProtocol.protocolNotebookMod

import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionSummary extends StObject {
  
  /**
    * A strict monotonically increasing value
    * indicating the execution order of a cell
    * inside a notebook.
    */
  var executionOrder: uinteger
  
  /**
    * Whether the execution was successful or
    * not if known by the client.
    */
  var success: js.UndefOr[Boolean] = js.undefined
}
object ExecutionSummary {
  
  inline def apply(executionOrder: uinteger): ExecutionSummary = {
    val __obj = js.Dynamic.literal(executionOrder = executionOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionSummary]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.notebook", "ExecutionSummary")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(executionOrder: Double): ExecutionSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(executionOrder.asInstanceOf[js.Any]).asInstanceOf[ExecutionSummary]
  inline def create(executionOrder: Double, success: Boolean): ExecutionSummary = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(executionOrder.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[ExecutionSummary]
  
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(one: Unit, other: ExecutionSummary): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(one.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(one: ExecutionSummary): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(one.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(one: ExecutionSummary, other: ExecutionSummary): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(one.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.ExecutionSummary */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.notebook.ExecutionSummary */ Boolean]
  
  extension [Self <: ExecutionSummary](x: Self) {
    
    inline def setExecutionOrder(value: uinteger): Self = StObject.set(x, "executionOrder", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
