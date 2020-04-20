package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: Double
  var warning: Double
}

object AnonError {
  @scala.inline
  def apply(error: Double, warning: Double): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

