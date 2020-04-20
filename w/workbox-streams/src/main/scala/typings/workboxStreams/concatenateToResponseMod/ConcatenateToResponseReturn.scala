package typings.workboxStreams.concatenateToResponseMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatenateToResponseReturn extends js.Object {
  var done: js.Promise[Unit]
  var response: Response
}

object ConcatenateToResponseReturn {
  @scala.inline
  def apply(done: js.Promise[Unit], response: Response): ConcatenateToResponseReturn = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenateToResponseReturn]
  }
}

