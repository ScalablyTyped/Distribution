package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonEncodingMod.ContentEncoder
import typings.vscodeJsonrpc.libCommonEncodingMod.ContentTypeEncoder
import typings.vscodeJsonrpc.libCommonEventsMod.Event
import typings.vscodeJsonrpc.libCommonMessagesMod.Message
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typings.vscodeJsonrpc.libCommonRalMod.RAL.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonMessageWriterMod {
  
  /* note: abstract class */ @JSImport("vscode-jsonrpc/lib/common/messageWriter", "AbstractMessageWriter")
  @js.native
  open class AbstractMessageWriter () extends StObject {
    
    /* private */ var asError: Any = js.native
    
    /* private */ var closeEmitter: Any = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var errorEmitter: Any = js.native
    
    /* protected */ def fireClose(): Unit = js.native
    
    /* protected */ def fireError(error: Any): Unit = js.native
    /* protected */ def fireError(error: Any, message: Unit, count: Double): Unit = js.native
    /* protected */ def fireError(error: Any, message: Message): Unit = js.native
    /* protected */ def fireError(error: Any, message: Message, count: Double): Unit = js.native
    
    def onClose: Event[Unit] = js.native
    
    def onError: Event[js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]]] = js.native
  }
  
  @js.native
  trait MessageWriter extends StObject {
    
    /** Releases resources incurred from writing or raising events. Does NOT close the underlying transport, if any. */
    def dispose(): Unit = js.native
    
    /**
      * Call when the connection using this message writer ends
      * (e.g. MessageConnection.end() is called)
      */
    def end(): Unit = js.native
    
    /**
      * An event raised when the underlying transport has closed and writing is no longer possible.
      */
    def onClose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    
    /**
      * Raised whenever an error occurs while writing a message.
      */
    def onError(listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any]): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any],
      thisArgs: Any
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onError(
      listener: js.Function1[/* e */ js.Tuple3[js.Error, js.UndefOr[Message], js.UndefOr[Double]], Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    
    /**
      * Sends a JSON-RPC message.
      * @param msg The JSON-RPC message to be sent.
      * @description Implementations should guarantee messages are transmitted in the same order that they are received by this method.
      */
    def write(msg: Message): js.Promise[Unit] = js.native
  }
  object MessageWriter {
    
    @JSImport("vscode-jsonrpc/lib/common/messageWriter", "MessageWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messageWriter.MessageWriter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messageWriter.MessageWriter */ Boolean]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/messageWriter", "WriteableStreamMessageWriter")
  @js.native
  open class WriteableStreamMessageWriter protected ()
    extends AbstractMessageWriter
       with MessageWriter {
    def this(writable: WritableStream) = this()
    def this(writable: WritableStream, options: MessageWriterOptions) = this()
    def this(writable: WritableStream, options: MessageBufferEncoding) = this()
    
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /* private */ var doWrite: Any = js.native
    
    /* private */ var errorCount: Any = js.native
    
    /* private */ var handleError: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var writable: Any = js.native
    
    /* private */ var writeSemaphore: Any = js.native
  }
  
  trait MessageWriterOptions extends StObject {
    
    var charset: js.UndefOr[MessageBufferEncoding] = js.undefined
    
    var contentEncoder: js.UndefOr[ContentEncoder] = js.undefined
    
    var contentTypeEncoder: js.UndefOr[ContentTypeEncoder] = js.undefined
  }
  object MessageWriterOptions {
    
    inline def apply(): MessageWriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageWriterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageWriterOptions] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: MessageBufferEncoding): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setContentEncoder(value: ContentEncoder): Self = StObject.set(x, "contentEncoder", value.asInstanceOf[js.Any])
      
      inline def setContentEncoderUndefined: Self = StObject.set(x, "contentEncoder", js.undefined)
      
      inline def setContentTypeEncoder(value: ContentTypeEncoder): Self = StObject.set(x, "contentTypeEncoder", value.asInstanceOf[js.Any])
      
      inline def setContentTypeEncoderUndefined: Self = StObject.set(x, "contentTypeEncoder", js.undefined)
    }
  }
}
