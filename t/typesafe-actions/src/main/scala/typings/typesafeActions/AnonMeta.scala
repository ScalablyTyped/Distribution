package typings.typesafeActions

import typings.typesafeActions.createActionMod.PayloadMetaAction
import typings.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeta[T /* <: TypeConstant */, M]
  extends PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object AnonMeta {
  @scala.inline
  def apply[T /* <: TypeConstant */, M](meta: M, `type`: T): AnonMeta[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeta[T, M]]
  }
}

