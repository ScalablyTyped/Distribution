package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWarning extends js.Object {
  var error: Double
  var warning: Double
}

object AnonWarning {
  @scala.inline
  def apply(error: Double, warning: Double): AnonWarning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWarning]
  }
}

