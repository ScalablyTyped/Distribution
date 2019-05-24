package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Meta[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object Anon_Meta {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, M](meta: M, `type`: T): Anon_Meta[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Meta[T, M]]
  }
}

