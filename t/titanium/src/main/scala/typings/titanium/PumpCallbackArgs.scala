package typings.titanium

import typings.titanium.Titanium.Buffer
import typings.titanium.Titanium.IOStream
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
  implicit class PumpCallbackArgsOps[Self <: PumpCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setBytesProcessed(value: Double): Self = this.set("bytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesProcessed: Self = this.set("bytesProcessed", js.undefined)
    
    @scala.inline
    def setSource(value: IOStream): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: Double): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
  }
}
