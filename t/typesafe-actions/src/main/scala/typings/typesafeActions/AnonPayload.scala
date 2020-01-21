package typings.typesafeActions

import typings.typesafeActions.createActionMod.PayloadMetaAction
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload[T /* <: TypeConstant */, P]
  extends PayloadMetaAction[T, P, js.Any] {
  var payload: P
  var `type`: T
}

object AnonPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P](payload: P, `type`: T): AnonPayload[T, P] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload[T, P]]
  }
}

