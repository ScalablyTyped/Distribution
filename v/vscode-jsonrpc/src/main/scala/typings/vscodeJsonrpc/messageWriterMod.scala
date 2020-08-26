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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageWriter", JSImport.Namespace)
@js.native
object messageWriterMod extends js.Object {
  @js.native
  abstract class AbstractMessageWriter () extends js.Object {
    var asError: js.Any = js.native
    var closeEmitter: js.Any = js.native
    var errorEmitter: js.Any = js.native
    def dispose(): Unit = js.native
    /* protected */ def fireClose(): Unit = js.native
    /* protected */ def fireError(error: js.Any): Unit = js.native
    /* protected */ def fireError(error: js.Any, message: js.UndefOr[scala.Nothing], count: Double): Unit = js.native
    /* protected */ def fireError(error: js.Any, message: Message): Unit = js.native
    /* protected */ def fireError(error: js.Any, message: Message, count: Double): Unit = js.native
    def onClose: Event[Unit] = js.native
    def onError: Event[js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  }
  
  @js.native
  class IPCMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(process: ChildProcess) = this()
    def this(process: Process) = this()
    var errorCount: js.Any = js.native
    var process: js.Any = js.native
    var queue: js.Any = js.native
    var sending: js.Any = js.native
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    def doWriteMessage(msg: Message): Unit = js.native
  }
  
  @js.native
  trait MessageWriter extends js.Object {
    def dispose(): Unit = js.native
    def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
    def onClose(
      listener: js.Function1[/* e */ Unit, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onError(listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _]): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
      thisArgs: js.Any
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[Error, js.UndefOr[Message], js.UndefOr[Double]], _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def write(msg: Message): Unit = js.native
  }
  
  @js.native
  class SocketMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoding: BufferEncoding) = this()
    var encoding: js.Any = js.native
    var errorCount: js.Any = js.native
    var handleError: js.Any = js.native
    var queue: js.Any = js.native
    var sending: js.Any = js.native
    var socket: js.Any = js.native
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    def doWriteMessage(msg: Message): Unit = js.native
  }
  
  @js.native
  class StreamMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(writable: WritableStream) = this()
    def this(writable: WritableStream, encoding: BufferEncoding) = this()
    var encoding: js.Any = js.native
    var errorCount: js.Any = js.native
    var writable: js.Any = js.native
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
  }
  
  @js.native
  object MessageWriter extends js.Object {
    def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/messageWriter.MessageWriter */ Boolean = js.native
  }
  
}

