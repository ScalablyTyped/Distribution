package typings.typesafeDashActions

import typings.typesafeDashActions.distCreateDashActionMod.PayloadMetaAction
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetaPayload[T /* <: TypeConstant */, P, M] extends PayloadMetaAction[T, P, M] {
  var meta: M
  var payload: P
  var `type`: T
}

object Anon_MetaPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P, M](meta: M, payload: P, `type`: T): Anon_MetaPayload[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetaPayload[T, P, M]]
  }
}

