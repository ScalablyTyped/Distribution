package typings.workboxStreams.concatenateMod

import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatenateReturn extends js.Object {
  
  var done: js.Promise[Unit] = js.native
  
  var stream: ReadableStream[_] = js.native
}
object ConcatenateReturn {
  
  @scala.inline
  def apply(done: js.Promise[Unit], stream: ReadableStream[_]): ConcatenateReturn = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenateReturn]
  }
  
  @scala.inline
  implicit class ConcatenateReturnOps[Self <: ConcatenateReturn] (val x: Self) extends AnyVal {
    
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
    def setDone(value: js.Promise[Unit]): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: ReadableStream[_]): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
