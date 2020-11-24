package typings.titanium

import typings.titanium.Titanium.IOStream
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
  implicit class ReadCallbackArgsOps[Self <: ReadCallbackArgs] (val x: Self) extends AnyVal {
    
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
    def setSource(value: IOStream): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
