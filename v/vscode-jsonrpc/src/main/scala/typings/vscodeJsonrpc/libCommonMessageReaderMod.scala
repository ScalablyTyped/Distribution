package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typings.vscodeJsonrpc.libCommonEncodingMod.ContentDecoder
import typings.vscodeJsonrpc.libCommonEncodingMod.ContentTypeDecoder
import typings.vscodeJsonrpc.libCommonEventsMod.Event
import typings.vscodeJsonrpc.libCommonMessagesMod.Message
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typings.vscodeJsonrpc.libCommonRalMod.RAL.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonMessageReaderMod {
  
  /* note: abstract class */ @JSImport("vscode-jsonrpc/lib/common/messageReader", "AbstractMessageReader")
  @js.native
  open class AbstractMessageReader ()
    extends StObject
       with MessageReader {
    
    /* private */ var asError: Any = js.native
    
    /* private */ var closeEmitter: Any = js.native
    
    /* private */ var errorEmitter: Any = js.native
    
    /* protected */ def fireClose(): Unit = js.native
    
    /* protected */ def fireError(error: Any): Unit = js.native
    
    /* protected */ def firePartialMessage(info: PartialMessageInfo): Unit = js.native
    
    def onClose: Event[Unit] = js.native
    
    def onError: Event[js.Error] = js.native
    
    def onPartialMessage: Event[PartialMessageInfo] = js.native
    
    /* private */ var partialMessageEmitter: Any = js.native
  }
  
  @js.native
  trait MessageReader extends StObject {
    
    /** Releases resources incurred from reading or raising events. Does NOT close the underlying transport, if any. */
    def dispose(): Unit = js.native
    
    /**
      * Begins listening for incoming messages. To be called at most once.
      * @param callback A callback for receiving decoded messages.
      */
    def listen(callback: DataCallback): Disposable = js.native
    
    /** An event raised when the end of the underlying transport has been reached. */
    def onClose(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onClose(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    
    /** Raised whenever an error occurs while reading a message. */
    def onError(listener: js.Function1[/* e */ js.Error, Any]): Disposable = js.native
    def onError(listener: js.Function1[/* e */ js.Error, Any], thisArgs: Any): Disposable = js.native
    def onError(listener: js.Function1[/* e */ js.Error, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
    def onError(listener: js.Function1[/* e */ js.Error, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
    
    /**
      * An event that *may* be raised to inform the owner that only part of a message has been received.
      * A MessageReader implementation may choose to raise this event after a timeout elapses while waiting for more of a partially received message to be received.
      */
    def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, Any]): Disposable = js.native
    def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, Any], thisArgs: Any): Disposable = js.native
    def onPartialMessage(
      listener: js.Function1[/* e */ PartialMessageInfo, Any],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onPartialMessage(
      listener: js.Function1[/* e */ PartialMessageInfo, Any],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
  }
  object MessageReader {
    
    @JSImport("vscode-jsonrpc/lib/common/messageReader", "MessageReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messageReader.MessageReader */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messageReader.MessageReader */ Boolean]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/messageReader", "ReadableStreamMessageReader")
  @js.native
  open class ReadableStreamMessageReader protected () extends AbstractMessageReader {
    def this(readable: ReadableStream) = this()
    def this(readable: ReadableStream, options: MessageReaderOptions) = this()
    def this(readable: ReadableStream, options: MessageBufferEncoding) = this()
    
    /* private */ var _partialMessageTimeout: Any = js.native
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    /* private */ var clearPartialMessageTimer: Any = js.native
    
    /* private */ var messageToken: Any = js.native
    
    /* private */ var nextMessageLength: Any = js.native
    
    /* private */ var onData: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def partialMessageTimeout: Double = js.native
    def partialMessageTimeout_=(timeout: Double): Unit = js.native
    
    /* private */ var partialMessageTimer: Any = js.native
    
    /* private */ var readable: Any = js.native
    
    /* private */ var setPartialMessageTimer: Any = js.native
  }
  
  type DataCallback = js.Function1[/* data */ Message, Unit]
  
  trait MessageReaderOptions extends StObject {
    
    var charset: js.UndefOr[MessageBufferEncoding] = js.undefined
    
    var contentDecoder: js.UndefOr[ContentDecoder] = js.undefined
    
    var contentDecoders: js.UndefOr[js.Array[ContentDecoder]] = js.undefined
    
    var contentTypeDecoder: js.UndefOr[ContentTypeDecoder] = js.undefined
    
    var contentTypeDecoders: js.UndefOr[js.Array[ContentTypeDecoder]] = js.undefined
  }
  object MessageReaderOptions {
    
    inline def apply(): MessageReaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageReaderOptions]
    }
    
    extension [Self <: MessageReaderOptions](x: Self) {
      
      inline def setCharset(value: MessageBufferEncoding): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setContentDecoder(value: ContentDecoder): Self = StObject.set(x, "contentDecoder", value.asInstanceOf[js.Any])
      
      inline def setContentDecoderUndefined: Self = StObject.set(x, "contentDecoder", js.undefined)
      
      inline def setContentDecoders(value: js.Array[ContentDecoder]): Self = StObject.set(x, "contentDecoders", value.asInstanceOf[js.Any])
      
      inline def setContentDecodersUndefined: Self = StObject.set(x, "contentDecoders", js.undefined)
      
      inline def setContentDecodersVarargs(value: ContentDecoder*): Self = StObject.set(x, "contentDecoders", js.Array(value*))
      
      inline def setContentTypeDecoder(value: ContentTypeDecoder): Self = StObject.set(x, "contentTypeDecoder", value.asInstanceOf[js.Any])
      
      inline def setContentTypeDecoderUndefined: Self = StObject.set(x, "contentTypeDecoder", js.undefined)
      
      inline def setContentTypeDecoders(value: js.Array[ContentTypeDecoder]): Self = StObject.set(x, "contentTypeDecoders", value.asInstanceOf[js.Any])
      
      inline def setContentTypeDecodersUndefined: Self = StObject.set(x, "contentTypeDecoders", js.undefined)
      
      inline def setContentTypeDecodersVarargs(value: ContentTypeDecoder*): Self = StObject.set(x, "contentTypeDecoders", js.Array(value*))
    }
  }
  
  trait PartialMessageInfo extends StObject {
    
    val messageToken: Double
    
    val waitingTime: Double
  }
  object PartialMessageInfo {
    
    inline def apply(messageToken: Double, waitingTime: Double): PartialMessageInfo = {
      val __obj = js.Dynamic.literal(messageToken = messageToken.asInstanceOf[js.Any], waitingTime = waitingTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialMessageInfo]
    }
    
    extension [Self <: PartialMessageInfo](x: Self) {
      
      inline def setMessageToken(value: Double): Self = StObject.set(x, "messageToken", value.asInstanceOf[js.Any])
      
      inline def setWaitingTime(value: Double): Self = StObject.set(x, "waitingTime", value.asInstanceOf[js.Any])
    }
  }
}
