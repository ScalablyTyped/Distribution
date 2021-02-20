package typings.titanium

import typings.titanium.Titanium.Buffer
import typings.titanium.Titanium.IOStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the callback each time the
  * [pump](Titanium.Stream.pump) operation has new data to deliver.
  */
@js.native
trait PumpCallbackArgs extends ErrorResponse {
  
  /**
    * Buffer object holding the data currently being pumped to the handler method.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  
  /**
    * Number of bytes being passed to this invocation of the handler, or
    * -1 in the event of an error or end of stream.
    */
  var bytesProcessed: js.UndefOr[Double] = js.native
  
  /**
    * Stream being read from.
    */
  var source: js.UndefOr[IOStream] = js.native
  
  /**
    * Total number of bytes read from the stream so far,
    * including the data passed to this current invocation of the handler.
    */
  var totalBytesProcessed: js.UndefOr[Double] = js.native
}
object PumpCallbackArgs {
  
  @scala.inline
  def apply(): PumpCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PumpCallbackArgs]
  }
  
  @scala.inline
  implicit class PumpCallbackArgsMutableBuilder[Self <: PumpCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setBytesProcessed(value: Double): Self = StObject.set(x, "bytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesProcessedUndefined: Self = StObject.set(x, "bytesProcessed", js.undefined)
    
    @scala.inline
    def setSource(value: IOStream): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: Double): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
  }
}
