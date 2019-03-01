package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadMetaAction[T /* <: StringType */, P, M] extends js.Object {
  var meta: M
  var payload: P
  var `type`: T
}

object PayloadMetaAction {
  @scala.inline
  def apply[T /* <: StringType */, P, M](meta: M, payload: P, `type`: T): PayloadMetaAction[T, P, M] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadMetaAction[T, P, M]]
  }
}

