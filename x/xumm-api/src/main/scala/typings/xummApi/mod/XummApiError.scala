package typings.xummApi.mod

import typings.xummApi.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummApiError extends js.Object {
  var error: Code
}

object XummApiError {
  @scala.inline
  def apply(error: Code): XummApiError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummApiError]
  }
}

