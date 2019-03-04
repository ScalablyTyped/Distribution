package typings
package typesafeDashActionsLib.distCreateDashActionDashDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSA[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, M, E] extends js.Object {
  var error: js.UndefOr[E] = js.undefined
  var meta: js.UndefOr[M] = js.undefined
  var payload: js.UndefOr[P] = js.undefined
  var `type`: T
}

object FSA {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypeDashHelpersMod.StringType */, P, M, E](`type`: T, error: E = null, meta: M = null, payload: P = null): FSA[T, P, M, E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSA[T, P, M, E]]
  }
}

