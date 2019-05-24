package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaAction[TType /* <: TypeConstant */, TMeta] extends js.Object {
  var meta: TMeta
  var `type`: TType
}

object MetaAction {
  @scala.inline
  def apply[TType /* <: TypeConstant */, TMeta](meta: TMeta, `type`: TType): MetaAction[TType, TMeta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaAction[TType, TMeta]]
  }
}

