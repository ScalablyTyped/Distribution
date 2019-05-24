package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMetaPayload[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, M, E] extends js.Object {
  var error: E
  var meta: M
  var payload: P
  var `type`: T
}

object Anon_ErrorMetaPayload {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.TypeConstant */, P, M, E](error: E, meta: M, payload: P, `type`: T): Anon_ErrorMetaPayload[T, P, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMetaPayload[T, P, M, E]]
  }
}

