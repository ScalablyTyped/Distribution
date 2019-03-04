package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetaPayload[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, M]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, P, M] {
  var meta: M
  var payload: P
  var `type`: T
}

object Anon_MetaPayload {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, M](meta: M, payload: P, `type`: T): Anon_MetaPayload[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetaPayload[T, P, M]]
  }
}

