package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.vscodeJsonrpc.libCommonCancellationMod.AbstractCancellationTokenSource
import typings.vscodeJsonrpc.libCommonMessagesMod.RequestMessage
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCancellationReceiverStrategy extends StObject {
  
  /**
    * Create a cancellation token source from a given request message.
    *
    * @param requestMessage The request message.
    */
  def createCancellationTokenSource(requestMessage: RequestMessage): AbstractCancellationTokenSource
  
  /**
    * An optional method to dispose the strategy.
    */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var kind: request
}
object RequestCancellationReceiverStrategy {
  
  inline def apply(createCancellationTokenSource: RequestMessage => AbstractCancellationTokenSource): RequestCancellationReceiverStrategy = {
    val __obj = js.Dynamic.literal(createCancellationTokenSource = js.Any.fromFunction1(createCancellationTokenSource), kind = "request")
    __obj.asInstanceOf[RequestCancellationReceiverStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "RequestCancellationReceiverStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.RequestCancellationReceiverStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.RequestCancellationReceiverStrategy */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestCancellationReceiverStrategy] (val x: Self) extends AnyVal {
    
    inline def setCreateCancellationTokenSource(value: RequestMessage => AbstractCancellationTokenSource): Self = StObject.set(x, "createCancellationTokenSource", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setKind(value: request): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
