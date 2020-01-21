package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoneValidated extends js.Object {
  var none: Double
  var validated: Double
}

object AnonNoneValidated {
  @scala.inline
  def apply(none: Double, validated: Double): AnonNoneValidated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNoneValidated]
  }
}

