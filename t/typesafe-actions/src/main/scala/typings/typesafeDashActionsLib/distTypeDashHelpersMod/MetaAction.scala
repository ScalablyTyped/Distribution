package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaAction[T /* <: StringType */, M] extends js.Object {
  var meta: M
  var `type`: T
}

object MetaAction {
  @scala.inline
  def apply[T /* <: StringType */, M](meta: M, `type`: T): MetaAction[T, M] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaAction[T, M]]
  }
}

