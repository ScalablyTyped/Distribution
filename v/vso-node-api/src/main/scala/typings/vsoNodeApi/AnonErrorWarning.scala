package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorWarning extends js.Object {
  var error: Double
  var warning: Double
}

object AnonErrorWarning {
  @scala.inline
  def apply(error: Double, warning: Double): AnonErrorWarning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorWarning]
  }
}

