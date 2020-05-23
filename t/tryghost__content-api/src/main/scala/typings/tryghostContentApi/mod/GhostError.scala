package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.ErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostError extends js.Object {
  var errors: js.Array[ErrorType]
}

object GhostError {
  @scala.inline
  def apply(errors: js.Array[ErrorType]): GhostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostError]
  }
}

