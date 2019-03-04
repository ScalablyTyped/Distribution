package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxStandardAction[T /* <: StringType */, P, M] extends js.Object {
  var error: js.UndefOr[typesafeDashActionsLib.typesafeDashActionsLibNumbers.`true`] = js.undefined
  var meta: M
  var payload: P
  var `type`: T
}

object FluxStandardAction {
  @scala.inline
  def apply[T /* <: StringType */, P, M](
    meta: M,
    payload: P,
    `type`: T,
    error: typesafeDashActionsLib.typesafeDashActionsLibNumbers.`true` = null
  ): FluxStandardAction[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[FluxStandardAction[T, P, M]]
  }
}

