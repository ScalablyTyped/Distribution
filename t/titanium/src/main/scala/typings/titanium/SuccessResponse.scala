package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties used in any event or callback which needs to report a success.
  */
@js.native
trait SuccessResponse extends ErrorResponse

object SuccessResponse {
  @scala.inline
  def apply(): SuccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessResponse]
  }
}

