package typings.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadAction[TType /* <: TypeConstant */, TPayload] extends js.Object {
  var payload: TPayload
  var `type`: TType
}

object PayloadAction {
  @scala.inline
  def apply[TType /* <: TypeConstant */, TPayload](payload: TPayload, `type`: TType): PayloadAction[TType, TPayload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadAction[TType, TPayload]]
  }
}

