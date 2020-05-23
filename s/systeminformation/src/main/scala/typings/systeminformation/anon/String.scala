package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var string: java.lang.String
  var value: Double
}

object String {
  @scala.inline
  def apply(string: java.lang.String, value: Double): String = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

