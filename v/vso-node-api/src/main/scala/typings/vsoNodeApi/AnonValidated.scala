package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidated extends js.Object {
  var none: Double
  var validated: Double
}

object AnonValidated {
  @scala.inline
  def apply(none: Double, validated: Double): AnonValidated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValidated]
  }
}

