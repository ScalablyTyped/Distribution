package typings.titanium

import typings.titanium.Titanium.IOStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the callback when an asynchronous
  * [writeStream](Titanium.Stream.writeStream) operation finishes.
  */
@js.native
trait WriteStreamCallbackArgs extends ErrorResponse {
  
  /**
    * Number of bytes processed, or -1 in the event of an error or end of stream.
    */
  var bytesProcessed: js.UndefOr[Double] = js.native
  
  /**
    * Stream being read from.
    */
  var fromStream: js.UndefOr[IOStream] = js.native
  
  /**
    * Stream being written to.
    */
  var toStream: js.UndefOr[IOStream] = js.native
}
object WriteStreamCallbackArgs {
  
  @scala.inline
  def apply(): WriteStreamCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteStreamCallbackArgs]
  }
  
  @scala.inline
  implicit class WriteStreamCallbackArgsMutableBuilder[Self <: WriteStreamCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesProcessed(value: Double): Self = StObject.set(x, "bytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesProcessedUndefined: Self = StObject.set(x, "bytesProcessed", js.undefined)
    
    @scala.inline
    def setFromStream(value: IOStream): Self = StObject.set(x, "fromStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromStreamUndefined: Self = StObject.set(x, "fromStream", js.undefined)
    
    @scala.inline
    def setToStream(value: IOStream): Self = StObject.set(x, "toStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStreamUndefined: Self = StObject.set(x, "toStream", js.undefined)
  }
}
