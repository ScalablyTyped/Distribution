package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostError extends js.Object {
  var errors: js.Array[AnonErrorType]
}

object GhostError {
  @scala.inline
  def apply(errors: js.Array[AnonErrorType]): GhostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostError]
  }
}

