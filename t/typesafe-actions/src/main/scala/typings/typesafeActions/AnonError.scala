package typings.typesafeActions

import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[T /* <: TypeConstant */, E] extends js.Object {
  var error: E
  var `type`: T
}

object AnonError {
  @scala.inline
  def apply[T /* <: TypeConstant */, E](error: E, `type`: T): AnonError[T, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError[T, E]]
  }
}

