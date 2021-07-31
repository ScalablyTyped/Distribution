package typings.vscodeJsonrpc

import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import typings.node.childProcessMod.ChildProcess
import typings.node.netMod.Socket
import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import typings.vscodeJsonrpc.eventsMod.Disposable
import typings.vscodeJsonrpc.eventsMod.Event
import typings.vscodeJsonrpc.messagesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageWriterMod {
  
  @JSImport("vscode-jsonrpc/lib/messageWriter", "AbstractMessageWriter")
  @js.native
  abstract class AbstractMessageWriter () extends StObject {
    
    var asError: js.Any = js.native
    
    var closeEmitter: js.Any = js.native
    
    def dispose(): Unit = js.native
    
    var errorEmitter: js.Any = js.native
    
    /* protected */ def fireClose(): Unit = js.native
    
    /* protected */ def fireError(error: js.Any): Unit = js.native
    /* protected */ def fireError(error: js.Any, message: Unit, count: Double): Unit = js.native
    /* protected */ def fireError(error: js.Any, message: Message): Unit = js.native
    /* protected */ def fireError(error: js.Any, message: Message, count: Double): Unit = js.native
    
    def onClose: Event[Unit] = js.native
    
    def onError: Event[js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/messageWriter", "IPCMessageWriter")
  @js.native
  class IPCMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(process: ChildProcess) = this()
    def this(process: Process) = this()
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    def doWriteMessage(msg: Message): Unit = js.native
    
    var errorCount: js.Any = js.native
    
    var process: js.Any = js.native
    
    var queue: js.Any = js.native
    
    var sending: js.Any = js.native
  }
  
  @js.native
  trait MessageWriter extends StObject {
    
    def dispose(): Unit = js.native
    
    def onClose(listener: js.Function1[/* e */ Unit, js.Any]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: js.Any): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, js.Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    
    def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], js.Any]): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], js.Any],
      thisArgs: js.Any
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], js.Any],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], js.Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    
    def write(msg: Message): Unit = js.native
  }
  object MessageWriter {
    
    @JSImport("vscode-jsonrpc/lib/messageWriter", "MessageWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/messageWriter.MessageWriter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/messageWriter.MessageWriter */ Boolean]
  }
  
  @JSImport("vscode-jsonrpc/lib/messageWriter", "SocketMessageWriter")
  @js.native
  class SocketMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoding: BufferEncoding) = this()
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    def doWriteMessage(msg: Message): Unit = js.native
    
    var encoding: js.Any = js.native
    
    var errorCount: js.Any = js.native
    
    var handleError: js.Any = js.native
    
    var queue: js.Any = js.native
    
    var sending: js.Any = js.native
    
    var socket: js.Any = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/messageWriter", "StreamMessageWriter")
  @js.native
  class StreamMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(writable: WritableStream) = this()
    def this(writable: WritableStream, encoding: BufferEncoding) = this()
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    var encoding: js.Any = js.native
    
    var errorCount: js.Any = js.native
    
    var writable: js.Any = js.native
  }
}
