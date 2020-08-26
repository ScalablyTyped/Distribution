package typings.workboxStreams.concatenateToResponseMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatenateToResponseReturn extends js.Object {
  var done: js.Promise[Unit] = js.native
  var response: Response = js.native
}

object ConcatenateToResponseReturn {
  @scala.inline
  def apply(done: js.Promise[Unit], response: Response): ConcatenateToResponseReturn = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenateToResponseReturn]
  }
  @scala.inline
  implicit class ConcatenateToResponseReturnOps[Self <: ConcatenateToResponseReturn] (val x: Self) extends AnyVal {
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
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

