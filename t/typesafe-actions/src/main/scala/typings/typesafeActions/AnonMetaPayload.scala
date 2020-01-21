package typings.typesafeActions

import typings.typesafeActions.createActionMod.PayloadMetaAction
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetaPayload[T /* <: TypeConstant */, P, M] extends PayloadMetaAction[T, P, M] {
  var meta: M
  var payload: P
  var `type`: T
}

object AnonMetaPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P, M](meta: M, payload: P, `type`: T): AnonMetaPayload[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetaPayload[T, P, M]]
  }
}

