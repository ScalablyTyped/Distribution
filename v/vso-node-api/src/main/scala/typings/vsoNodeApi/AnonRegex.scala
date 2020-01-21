package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegex extends js.Object {
  var regex: Double
  var variable: Double
}

object AnonRegex {
  @scala.inline
  def apply(regex: Double, variable: Double): AnonRegex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRegex]
  }
}

