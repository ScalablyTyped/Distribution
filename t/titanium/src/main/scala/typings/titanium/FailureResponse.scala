package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties used in any event or callback which needs to report a failure.
  */
@js.native
trait FailureResponse extends ErrorResponse

object FailureResponse {
  @scala.inline
  def apply(): FailureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureResponse]
  }
}

