package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingSource[R] extends StObject {
  
  /**
    * A function that is called whenever the consumer cancels the stream, via
    * {@link ReadableStream.cancel | stream.cancel()},
    * {@link ReadableStreamDefaultReader.cancel | defaultReader.cancel()}, or
    * {@link ReadableStreamBYOBReader.cancel | byobReader.cancel()}.
    * It takes as its argument the same value as was passed to those methods by the consumer.
    */
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.undefined
  
  /**
    * A function that is called whenever the stream’s internal queue of chunks becomes not full,
    * i.e. whenever the queue’s desired size becomes positive. Generally, it will be called repeatedly
    * until the queue reaches its high water mark (i.e. until the desired size becomes non-positive).
    */
  var pull: js.UndefOr[UnderlyingSourcePullCallback[R]] = js.undefined
  
  /**
    * A function that is called immediately during creation of the {@link ReadableStream}.
    */
  var start: js.UndefOr[UnderlyingSourceStartCallback[R]] = js.undefined
  
  var `type`: Unit
}
object UnderlyingSource {
  
  inline def apply[R](`type`: Unit): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  
  extension [Self <: UnderlyingSource[?], R](x: Self & UnderlyingSource[R]) {
    
    inline def setCancel(value: /* reason */ Any => Unit | js.Thenable[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
