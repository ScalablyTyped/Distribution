package typings.typesafeDashActions

import typings.typesafeDashActions.distCreateDashActionMod.PayloadMetaAction
import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[T /* <: TypeConstant */]
  extends PayloadMetaAction[T, js.Any, js.Any] {
  var `type`: T
}

object Anon_Type {
  @scala.inline
  def apply[T /* <: TypeConstant */](`type`: T): Anon_Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type[T]]
  }
}

