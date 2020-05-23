package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var passed: Boolean
  var string: java.lang.String
  var value: Double
}

object Value {
  @scala.inline
  def apply(passed: Boolean, string: java.lang.String, value: Double): Value = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

