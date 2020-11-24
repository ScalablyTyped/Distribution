package typings.titanium

import typings.titanium.Titanium.IOStream
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
  implicit class WriteStreamCallbackArgsOps[Self <: WriteStreamCallbackArgs] (val x: Self) extends AnyVal {
    
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
    def setBytesProcessed(value: Double): Self = this.set("bytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesProcessed: Self = this.set("bytesProcessed", js.undefined)
    
    @scala.inline
    def setFromStream(value: IOStream): Self = this.set("fromStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromStream: Self = this.set("fromStream", js.undefined)
    
    @scala.inline
    def setToStream(value: IOStream): Self = this.set("toStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToStream: Self = this.set("toStream", js.undefined)
  }
}
