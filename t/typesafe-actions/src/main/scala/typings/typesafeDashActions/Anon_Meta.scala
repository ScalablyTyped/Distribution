package typings.typesafeDashActions

import typings.typesafeDashActions.distCreateDashActionMod.PayloadMetaAction
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Meta[T /* <: TypeConstant */, M]
  extends PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object Anon_Meta {
  @scala.inline
  def apply[T /* <: TypeConstant */, M](meta: M, `type`: T): Anon_Meta[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Meta[T, M]]
  }
}

