package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_ErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostError extends js.Object {
  var errors: js.Array[Anon_ErrorType]
}

object GhostError {
  @scala.inline
  def apply(errors: js.Array[Anon_ErrorType]): GhostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GhostError]
  }
}

