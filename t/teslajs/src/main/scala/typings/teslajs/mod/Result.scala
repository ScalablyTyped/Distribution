package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var reason: String
  var result: Boolean
}

object Result {
  @scala.inline
  def apply(reason: String, result: Boolean): Result = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

