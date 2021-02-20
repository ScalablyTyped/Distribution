package typings.titanium

import typings.titanium.Titanium.IOStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the write callback when an asynchronous
  * [write](Titanium.Stream.write) operation
  * finishes.
  */
@js.native
trait WriteCallbackArgs extends ErrorResponse {
  
  /**
    * Number of bytes processed, or -1 in the event of an error or end of stream.
    */
  var bytesProcessed: js.UndefOr[Double] = js.native
  
  /**
    * Stream being written to.
    */
  var source: js.UndefOr[IOStream] = js.native
}
object WriteCallbackArgs {
  
  @scala.inline
  def apply(): WriteCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteCallbackArgs]
  }
  
  @scala.inline
  implicit class WriteCallbackArgsMutableBuilder[Self <: WriteCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesProcessed(value: Double): Self = StObject.set(x, "bytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesProcessedUndefined: Self = StObject.set(x, "bytesProcessed", js.undefined)
    
    @scala.inline
    def setSource(value: IOStream): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
