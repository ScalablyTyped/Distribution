package typings.titanium

import typings.titanium.Titanium.IOStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the read callback when an asynchronous [read](Titanium.Stream.read) operation
  * finishes.
  */
@js.native
trait ReadCallbackArgs extends ErrorResponse {
  
  /**
    * Number of bytes processed, or -1 in the event of an error or end of stream.
    */
  var bytesProcessed: js.UndefOr[Double] = js.native
  
  /**
    * Stream being read.
    */
  var source: js.UndefOr[IOStream] = js.native
}
object ReadCallbackArgs {
  
  @scala.inline
  def apply(): ReadCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadCallbackArgs]
  }
  
  @scala.inline
  implicit class ReadCallbackArgsMutableBuilder[Self <: ReadCallbackArgs] (val x: Self) extends AnyVal {
    
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
