package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.vscodeJsonrpc.libCommonMessagesMod.RequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationSenderStrategy extends StObject {
  
  /**
    * Cleanup any cancellation state for the given cancellation id. After this
    * method has been call no cancellation will be sent anymore for the given id.
    *
    * @param id The cancellation id.
    */
  def cleanup(id: CancellationId): Unit
  
  /**
    * An optional method to dispose the strategy.
    */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Hook to enable cancellation for the given request.
    *
    * @param request The request to enable cancellation for.
    */
  var enableCancellation: js.UndefOr[js.Function1[/* request */ RequestMessage, Unit]] = js.undefined
  
  /**
    * Send cancellation for the given cancellation id
    *
    * @param conn The connection used.
    * @param id The cancellation id.
    */
  def sendCancellation(conn: MessageConnection, id: CancellationId): js.Promise[Unit]
}
object CancellationSenderStrategy {
  
  inline def apply(
    cleanup: CancellationId => Unit,
    sendCancellation: (MessageConnection, CancellationId) => js.Promise[Unit]
  ): CancellationSenderStrategy = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction1(cleanup), sendCancellation = js.Any.fromFunction2(sendCancellation))
    __obj.asInstanceOf[CancellationSenderStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationSenderStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationSenderStrategy.Message")
  @js.native
  val Message: CancellationSenderStrategy = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationSenderStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationSenderStrategy */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancellationSenderStrategy] (val x: Self) extends AnyVal {
    
    inline def setCleanup(value: CancellationId => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setEnableCancellation(value: /* request */ RequestMessage => Unit): Self = StObject.set(x, "enableCancellation", js.Any.fromFunction1(value))
    
    inline def setEnableCancellationUndefined: Self = StObject.set(x, "enableCancellation", js.undefined)
    
    inline def setSendCancellation(value: (MessageConnection, CancellationId) => js.Promise[Unit]): Self = StObject.set(x, "sendCancellation", js.Any.fromFunction2(value))
  }
}
