package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatenateToResponseResult extends js.Object {
  var done: js.Promise[workboxDashSwLib.StreamSource]
  var response: stdLib.Response
}

object ConcatenateToResponseResult {
  @scala.inline
  def apply(done: js.Promise[workboxDashSwLib.StreamSource], response: stdLib.Response): ConcatenateToResponseResult = {
    val __obj = js.Dynamic.literal(done = done, response = response)
  
    __obj.asInstanceOf[ConcatenateToResponseResult]
  }
}

