package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonCancellationMod.AbstractCancellationTokenSource
import typings.vscodeJsonrpc.libCommonConnectionMod.CancellationId
import typings.vscodeJsonrpc.libCommonConnectionMod.CancellationSenderStrategy
import typings.vscodeJsonrpc.libCommonConnectionMod.MessageConnection
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestCancellationReceiverStrategy
import typings.vscodeJsonrpc.libCommonMessagesMod.RequestMessage
import typings.vscodeJsonrpc.vscodeJsonrpcStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSharedArrayCancellationMod {
  
  @JSImport("vscode-jsonrpc/lib/common/sharedArrayCancellation", "SharedArrayReceiverStrategy")
  @js.native
  open class SharedArrayReceiverStrategy ()
    extends StObject
       with RequestCancellationReceiverStrategy {
    
    /**
      * Create a cancellation token source from a given request message.
      *
      * @param requestMessage The request message.
      */
    /* CompleteClass */
    override def createCancellationTokenSource(requestMessage: RequestMessage): AbstractCancellationTokenSource = js.native
    
    /* CompleteClass */
    var kind: request = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/common/sharedArrayCancellation", "SharedArraySenderStrategy")
  @js.native
  open class SharedArraySenderStrategy ()
    extends StObject
       with CancellationSenderStrategy {
    
    /* private */ val buffers: Any = js.native
    
    /**
      * Cleanup any cancellation state for the given cancellation id. After this
      * method has been call no cancellation will be sent anymore for the given id.
      *
      * @param id The cancellation id.
      */
    /* CompleteClass */
    override def cleanup(id: CancellationId): Unit = js.native
    
    @JSName("dispose")
    def dispose_MSharedArraySenderStrategy(): Unit = js.native
    
    @JSName("enableCancellation")
    def enableCancellation_MSharedArraySenderStrategy(request: RequestMessage): Unit = js.native
    
    /**
      * Send cancellation for the given cancellation id
      *
      * @param conn The connection used.
      * @param id The cancellation id.
      */
    /* CompleteClass */
    override def sendCancellation(conn: MessageConnection, id: CancellationId): js.Promise[Unit] = js.native
  }
}
