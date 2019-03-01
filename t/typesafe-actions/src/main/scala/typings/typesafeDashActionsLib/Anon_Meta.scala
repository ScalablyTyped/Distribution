package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Meta[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, M]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object Anon_Meta {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, M](meta: M, `type`: T): Anon_Meta[T, M] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Meta[T, M]]
  }
}

