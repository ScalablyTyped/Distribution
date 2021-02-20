package typings.vscodeJsonrpc

import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.childProcessMod.ChildProcess
import typings.node.netMod.Socket
import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import typings.vscodeJsonrpc.eventsMod.Disposable
import typings.vscodeJsonrpc.eventsMod.Event
import typings.vscodeJsonrpc.messagesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageReaderMod {
  
  @JSImport("vscode-jsonrpc/lib/messageReader", "AbstractMessageReader")
  @js.native
  abstract class AbstractMessageReader () extends StObject {
    
    var asError: js.Any = js.native
    
    var closeEmitter: js.Any = js.native
    
    def dispose(): Unit = js.native
    
    var errorEmitter: js.Any = js.native
    
    /* protected */ def fireClose(): Unit = js.native
    
    /* protected */ def fireError(error: js.Any): Unit = js.native
    
    /* protected */ def firePartialMessage(info: PartialMessageInfo): Unit = js.native
    
    def onClose: Event[Unit] = js.native
    
    def onError: Event[Error] = js.native
    
    def onPartialMessage: Event[PartialMessageInfo] = js.native
    
    var partialMessageEmitter: js.Any = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/messageReader", "IPCMessageReader")
  @js.native
  class IPCMessageReader protected ()
    extends AbstractMessageReader
       with MessageReader {
    def this(process: ChildProcess) = this()
    def this(process: Process) = this()
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    var process: js.Any = js.native
  }
  
  @js.native
  trait MessageReader extends StObject {
    
    def dispose(): Unit = js.native
    
    def listen(callback: DataCallback): Unit = js.native
    
    def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
    def onClose(
      listener: js.Function1[/* e */ Unit, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    
    def onError(listener: js.Function1[/* e */ Error, _]): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ Error, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any): Disposable = js.native
    def onError(listener: js.Function1[/* e */ Error, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    
    def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): Disposable = js.native
    def onPartialMessage(
      listener: js.Function1[/* e */ PartialMessageInfo, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): Disposable = js.native
    def onPartialMessage(
      listener: js.Function1[/* e */ PartialMessageInfo, _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
  }
  object MessageReader {
    
    @JSImport("vscode-jsonrpc/lib/messageReader", "MessageReader.is")
    @js.native
    def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/messageReader.MessageReader */ Boolean = js.native
  }
  
  @JSImport("vscode-jsonrpc/lib/messageReader", "SocketMessageReader")
  @js.native
  class SocketMessageReader protected () extends StreamMessageReader {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoding: BufferEncoding) = this()
  }
  
  @JSImport("vscode-jsonrpc/lib/messageReader", "StreamMessageReader")
  @js.native
  class StreamMessageReader protected ()
    extends AbstractMessageReader
       with MessageReader {
    def this(readable: ReadableStream) = this()
    def this(readable: ReadableStream, encoding: BufferEncoding) = this()
    
    var _partialMessageTimeout: js.Any = js.native
    
    var buffer: js.Any = js.native
    
    var callback: js.Any = js.native
    
    var clearPartialMessageTimer: js.Any = js.native
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    var messageToken: js.Any = js.native
    
    var nextMessageLength: js.Any = js.native
    
    var onData: js.Any = js.native
    
    def partialMessageTimeout: Double = js.native
    def partialMessageTimeout_=(timeout: Double): Unit = js.native
    
    var partialMessageTimer: js.Any = js.native
    
    var readable: js.Any = js.native
    
    var setPartialMessageTimer: js.Any = js.native
  }
  
  type DataCallback = js.Function1[/* data */ Message, Unit]
  
  @js.native
  trait PartialMessageInfo extends StObject {
    
    val messageToken: Double = js.native
    
    val waitingTime: Double = js.native
  }
  object PartialMessageInfo {
    
    @scala.inline
    def apply(messageToken: Double, waitingTime: Double): PartialMessageInfo = {
      val __obj = js.Dynamic.literal(messageToken = messageToken.asInstanceOf[js.Any], waitingTime = waitingTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialMessageInfo]
    }
    
    @scala.inline
    implicit class PartialMessageInfoMutableBuilder[Self <: PartialMessageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageToken(value: Double): Self = StObject.set(x, "messageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingTime(value: Double): Self = StObject.set(x, "waitingTime", value.asInstanceOf[js.Any])
    }
  }
}
