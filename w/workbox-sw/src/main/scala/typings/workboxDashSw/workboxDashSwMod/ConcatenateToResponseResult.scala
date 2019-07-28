package typings.workboxDashSw.workboxDashSwMod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatenateToResponseResult extends js.Object {
  var done: js.Promise[StreamSource]
  var response: Response
}

object ConcatenateToResponseResult {
  @scala.inline
  def apply(done: js.Promise[StreamSource], response: Response): ConcatenateToResponseResult = {
    val __obj = js.Dynamic.literal(done = done, response = response)
  
    __obj.asInstanceOf[ConcatenateToResponseResult]
  }
}

