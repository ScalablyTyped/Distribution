package typings.typesafeDashActions

import typings.typesafeDashActions.distCreateDashActionMod.PayloadMetaAction
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload[T /* <: TypeConstant */, P]
  extends PayloadMetaAction[T, P, js.Any] {
  var payload: P
  var `type`: T
}

object Anon_Payload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P](payload: P, `type`: T): Anon_Payload[T, P] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Payload[T, P]]
  }
}

