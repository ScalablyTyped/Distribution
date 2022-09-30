package typings.webStreamsPolyfill.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingSink[W] extends StObject {
  
  /**
    * A function that is called after the producer signals, via {@link WritableStream.abort | stream.abort()} or
    * {@link WritableStreamDefaultWriter.abort | writer.abort()}, that they wish to abort the stream. It takes as its
    * argument the same value as was passed to those methods by the producer.
    *
    * Writable streams can additionally be aborted under certain conditions during piping; see the definition of the
    * {@link ReadableStream.pipeTo | pipeTo()} method for more details.
    *
    * This function can clean up any held resources, much like {@link UnderlyingSink.close | close()}, but perhaps with
    * some custom handling.
    */
  var abort: js.UndefOr[UnderlyingSinkAbortCallback] = js.undefined
  
  /**
    * A function that is called after the producer signals, via
    * {@link WritableStreamDefaultWriter.close | writer.close()}, that they are done writing chunks to the stream, and
    * subsequently all queued-up writes have successfully completed.
    *
    * This function can perform any actions necessary to finalize or flush writes to the underlying sink, and release
    * access to any held resources.
    */
  var close: js.UndefOr[UnderlyingSinkCloseCallback] = js.undefined
  
  /**
    * A function that is called immediately during creation of the {@link WritableStream}.
    */
  var start: js.UndefOr[UnderlyingSinkStartCallback] = js.undefined
  
  var `type`: Unit
  
  /**
    * A function that is called when a new chunk of data is ready to be written to the underlying sink. The stream
    * implementation guarantees that this function will be called only after previous writes have succeeded, and never
    * before {@link UnderlyingSink.start | start()} has succeeded or after {@link UnderlyingSink.close | close()} or
    * {@link UnderlyingSink.abort | abort()} have been called.
    *
    * This function is used to actually send the data to the resource presented by the underlying sink, for example by
    * calling a lower-level API.
    */
  var write: js.UndefOr[UnderlyingSinkWriteCallback[W]] = js.undefined
}
object UnderlyingSink {
  
  inline def apply[W](`type`: Unit): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
  
  extension [Self <: UnderlyingSink[?], W](x: Self & UnderlyingSink[W]) {
    
    inline def setAbort(value: /* reason */ Any => Unit | PromiseLike[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setClose(value: () => Unit | PromiseLike[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setStart(value: /* controller */ WritableStreamDefaultController[Any] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: (W, /* controller */ WritableStreamDefaultController[Any]) => Unit | PromiseLike[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
