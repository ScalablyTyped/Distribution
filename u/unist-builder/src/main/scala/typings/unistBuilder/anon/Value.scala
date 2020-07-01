package typings.unistBuilder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[T /* <: String */] extends js.Object {
  var `type`: T
  var value: String
}

object Value {
  @scala.inline
  def apply[/* <: java.lang.String */ T](`type`: T, value: String): Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
}

