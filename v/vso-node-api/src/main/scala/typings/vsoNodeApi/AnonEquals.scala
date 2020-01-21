package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEquals extends js.Object {
  @JSName("equals")
  var equals_FAnonEquals: Double
  var notEquals: Double
}

object AnonEquals {
  @scala.inline
  def apply(equals: Double, notEquals: Double): AnonEquals = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any], notEquals = notEquals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEquals]
  }
}

