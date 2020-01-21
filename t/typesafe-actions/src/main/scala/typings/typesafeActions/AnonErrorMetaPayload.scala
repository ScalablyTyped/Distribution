package typings.typesafeActions

import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorMetaPayload[T /* <: TypeConstant */, P, M, E] extends js.Object {
  var error: E
  var meta: M
  var payload: P
  var `type`: T
}

object AnonErrorMetaPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P, M, E](error: E, meta: M, payload: P, `type`: T): AnonErrorMetaPayload[T, P, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorMetaPayload[T, P, M, E]]
  }
}

