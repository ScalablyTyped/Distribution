package typings.typesafeActions

import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorPayload[T /* <: TypeConstant */, P, E] extends js.Object {
  var error: E
  var payload: P
  var `type`: T
}

object AnonErrorPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P, E](error: E, payload: P, `type`: T): AnonErrorPayload[T, P, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorPayload[T, P, E]]
  }
}

