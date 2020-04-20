package typings.xummApi.mod

import typings.xummApi.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummApiError extends js.Object {
  var error: AnonCode
}

object XummApiError {
  @scala.inline
  def apply(error: AnonCode): XummApiError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummApiError]
  }
}

