package typings.vscodeJsonrpc

import typings.std.Map
import typings.vscodeJsonrpc.anon.Create
import typings.vscodeJsonrpc.anon.Decoder
import typings.vscodeJsonrpc.anon.Error
import typings.vscodeJsonrpc.anon.SetImmediate
import typings.vscodeJsonrpc.libCommonDisposableMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonRalMod {
  
  object default {
    
    inline def apply(): RAL = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RAL]
    
    @JSImport("vscode-jsonrpc/lib/common/ral", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def install(ral: RAL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(ral.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait DuplexStream
    extends StObject
       with ReadableStream
       with WritableStream {
    
    /* InferMemberOverrides */
    override def onClose(listener: js.Function0[Unit]): Disposable = js.native
    
    /* InferMemberOverrides */
    override def onEnd(listener: js.Function0[Unit]): Disposable = js.native
    
    /* InferMemberOverrides */
    override def onError(listener: js.Function1[/* error */ Any, Unit]): Disposable = js.native
  }
  
  @js.native
  trait MessageBuffer extends StObject {
    
    def append(chunk: String): Unit = js.native
    /**
      * Append data to the message buffer.
      *
      * @param chunk the data to append.
      */
    def append(chunk: js.typedarray.Uint8Array): Unit = js.native
    
    val encoding: typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding = js.native
    
    /**
      * Tries to read the body of the given length.
      *
      * @param length the amount of bytes to read.
      * @returns the data or undefined int less data is available.
      */
    def tryReadBody(length: Double): js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /**
      * Tries to read the headers from the buffer
      *
      * @param lowerCaseKeys Whether the keys should be stored lower case. Doing
      * so is recommended since HTTP headers are case insensitive.
      *
      * @returns the header properties or undefined in not enough data can be read.
      */
    def tryReadHeaders(): js.UndefOr[Map[String, String]] = js.native
    def tryReadHeaders(lowerCaseKeys: Boolean): js.UndefOr[Map[String, String]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeJsonrpc.vscodeJsonrpcStrings.ascii
    - typings.vscodeJsonrpc.vscodeJsonrpcStrings.`utf-8`
  */
  trait MessageBufferEncoding extends StObject
  object MessageBufferEncoding {
    
    inline def ascii: typings.vscodeJsonrpc.vscodeJsonrpcStrings.ascii = "ascii".asInstanceOf[typings.vscodeJsonrpc.vscodeJsonrpcStrings.ascii]
    
    inline def `utf-8`: typings.vscodeJsonrpc.vscodeJsonrpcStrings.`utf-8` = "utf-8".asInstanceOf[typings.vscodeJsonrpc.vscodeJsonrpcStrings.`utf-8`]
  }
  
  trait RAL extends StObject {
    
    val applicationJson: Decoder
    
    val console: Error
    
    val messageBuffer: Create
    
    val timer: SetImmediate
  }
  object RAL {
    
    inline def apply(applicationJson: Decoder, console: Error, messageBuffer: Create, timer: SetImmediate): RAL = {
      val __obj = js.Dynamic.literal(applicationJson = applicationJson.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], messageBuffer = messageBuffer.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RAL]
    }
    
    type DuplexStream = typings.vscodeJsonrpc.libCommonRalMod.DuplexStream
    
    type MessageBuffer = typings.vscodeJsonrpc.libCommonRalMod.MessageBuffer
    
    type MessageBufferEncoding = typings.vscodeJsonrpc.libCommonRalMod.MessageBufferEncoding
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RAL] (val x: Self) extends AnyVal {
      
      inline def setApplicationJson(value: Decoder): Self = StObject.set(x, "applicationJson", value.asInstanceOf[js.Any])
      
      inline def setConsole(value: Error): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setMessageBuffer(value: Create): Self = StObject.set(x, "messageBuffer", value.asInstanceOf[js.Any])
      
      inline def setTimer(value: SetImmediate): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
    
    type ReadableStream = typings.vscodeJsonrpc.libCommonRalMod.ReadableStream
    
    type WritableStream = typings.vscodeJsonrpc.libCommonRalMod.WritableStream
  }
  
  trait ReadableStream extends StObject {
    
    def onClose(listener: js.Function0[Unit]): Disposable
    
    def onData(listener: js.Function1[/* data */ js.typedarray.Uint8Array, Unit]): Disposable
    
    def onEnd(listener: js.Function0[Unit]): Disposable
    
    def onError(listener: js.Function1[/* error */ Any, Unit]): Disposable
  }
  object ReadableStream {
    
    inline def apply(
      onClose: js.Function0[Unit] => Disposable,
      onData: js.Function1[/* data */ js.typedarray.Uint8Array, Unit] => Disposable,
      onEnd: js.Function0[Unit] => Disposable,
      onError: js.Function1[/* error */ Any, Unit] => Disposable
    ): ReadableStream = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[ReadableStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadableStream] (val x: Self) extends AnyVal {
      
      inline def setOnClose(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnData(value: js.Function1[/* data */ js.typedarray.Uint8Array, Unit] => Disposable): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
      
      inline def setOnEnd(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnError(value: js.Function1[/* error */ Any, Unit] => Disposable): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WritableStream extends StObject {
    
    def end(): Unit = js.native
    
    def onClose(listener: js.Function0[Unit]): Disposable = js.native
    
    def onEnd(listener: js.Function0[Unit]): Disposable = js.native
    
    def onError(listener: js.Function1[/* error */ Any, Unit]): Disposable = js.native
    
    def write(data: String, encoding: MessageBufferEncoding): js.Promise[Unit] = js.native
    def write(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
}
