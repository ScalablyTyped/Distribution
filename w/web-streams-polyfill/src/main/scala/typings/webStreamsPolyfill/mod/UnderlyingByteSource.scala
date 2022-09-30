package typings.webStreamsPolyfill.mod

import typings.std.PromiseLike
import typings.webStreamsPolyfill.webStreamsPolyfillStrings.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingByteSource extends StObject {
  
  /**
    * Can be set to a positive integer to cause the implementation to automatically allocate buffers for the
    * underlying source code to write into. In this case, when a consumer is using a default reader, the stream
    * implementation will automatically allocate an ArrayBuffer of the given size, so that
    * {@link ReadableByteStreamController.byobRequest | controller.byobRequest} is always present,
    * as if the consumer was using a BYOB reader.
    */
  var autoAllocateChunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * {@inheritDoc UnderlyingSource.cancel}
    */
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.undefined
  
  /**
    * {@inheritDoc UnderlyingSource.pull}
    */
  var pull: js.UndefOr[UnderlyingByteSourcePullCallback] = js.undefined
  
  /**
    * {@inheritDoc UnderlyingSource.start}
    */
  var start: js.UndefOr[UnderlyingByteSourceStartCallback] = js.undefined
  
  /**
    * Can be set to "bytes" to signal that the constructed {@link ReadableStream} is a readable byte stream.
    * This ensures that the resulting {@link ReadableStream} will successfully be able to vend BYOB readers via its
    * {@link ReadableStream.(getReader:1) | getReader()} method.
    * It also affects the controller argument passed to the {@link UnderlyingByteSource.start | start()}
    * and {@link UnderlyingByteSource.pull | pull()} methods.
    */
  var `type`: bytes
}
object UnderlyingByteSource {
  
  inline def apply(): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("bytes")
    __obj.asInstanceOf[UnderlyingByteSource]
  }
  
  extension [Self <: UnderlyingByteSource](x: Self) {
    
    inline def setAutoAllocateChunkSize(value: Double): Self = StObject.set(x, "autoAllocateChunkSize", value.asInstanceOf[js.Any])
    
    inline def setAutoAllocateChunkSizeUndefined: Self = StObject.set(x, "autoAllocateChunkSize", js.undefined)
    
    inline def setCancel(value: /* reason */ Any => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableByteStreamController => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableByteStreamController => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: bytes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
