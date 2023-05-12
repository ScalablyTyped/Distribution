package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.vscodeJsonrpc.libCommonCancellationMod.AbstractCancellationTokenSource
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdCancellationReceiverStrategy extends StObject {
  
  /**
    * Creates a CancellationTokenSource from a cancellation id.
    *
    * @param id The cancellation id.
    */
  def createCancellationTokenSource(id: CancellationId): AbstractCancellationTokenSource
  
  /**
    * An optional method to dispose the strategy.
    */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var kind: js.UndefOr[id] = js.undefined
}
object IdCancellationReceiverStrategy {
  
  inline def apply(createCancellationTokenSource: CancellationId => AbstractCancellationTokenSource): IdCancellationReceiverStrategy = {
    val __obj = js.Dynamic.literal(createCancellationTokenSource = js.Any.fromFunction1(createCancellationTokenSource))
    __obj.asInstanceOf[IdCancellationReceiverStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "IdCancellationReceiverStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.IdCancellationReceiverStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.IdCancellationReceiverStrategy */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdCancellationReceiverStrategy] (val x: Self) extends AnyVal {
    
    inline def setCreateCancellationTokenSource(value: CancellationId => AbstractCancellationTokenSource): Self = StObject.set(x, "createCancellationTokenSource", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setKind(value: id): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
