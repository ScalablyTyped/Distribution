package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConcatenateToResponseResult extends js.Object {
  var done: js.Promise[workboxDashSwLib.StreamSource]
  var response: stdLib.Response
}

object IConcatenateToResponseResult {
  @scala.inline
  def apply(done: js.Promise[workboxDashSwLib.StreamSource], response: stdLib.Response): IConcatenateToResponseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[IConcatenateToResponseResult]
  }
}

