package typings.unistBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[T /* <: String */] extends js.Object {
  var `type`: T
  var value: String
}

object AnonValue {
  @scala.inline
  def apply[T /* <: String */](`type`: T, value: String): AnonValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[T]]
  }
}

