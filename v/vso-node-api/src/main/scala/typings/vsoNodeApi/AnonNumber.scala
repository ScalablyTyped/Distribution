package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumber extends js.Object {
  var boolean: Double
  var guid: Double
  var none: Double
  var number: Double
  var string: Double
  var uri: Double
}

object AnonNumber {
  @scala.inline
  def apply(boolean: Double, guid: Double, none: Double, number: Double, string: Double, uri: Double): AnonNumber = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumber]
  }
}

