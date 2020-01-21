package typings.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeT[T /* <: String */] extends js.Object {
  var `type`: T
}

object AnonTypeT {
  @scala.inline
  def apply[T /* <: String */](`type`: T): AnonTypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeT[T]]
  }
}

