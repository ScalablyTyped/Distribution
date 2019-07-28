package typings.typesafeDashActions.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadMetaAction[TType /* <: TypeConstant */, TPayload, TMeta] extends js.Object {
  var meta: TMeta
  var payload: TPayload
  var `type`: TType
}

object PayloadMetaAction {
  @scala.inline
  def apply[TType /* <: TypeConstant */, TPayload, TMeta](meta: TMeta, payload: TPayload, `type`: TType): PayloadMetaAction[TType, TPayload, TMeta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadMetaAction[TType, TPayload, TMeta]]
  }
}

