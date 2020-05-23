package typings.tinder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var string: java.lang.String
}

object String {
  @scala.inline
  def apply(string: java.lang.String): String = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

