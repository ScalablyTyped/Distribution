package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadAction[T /* <: StringType */, P] extends js.Object {
  var payload: P
  var `type`: T
}

object PayloadAction {
  @scala.inline
  def apply[T /* <: StringType */, P](payload: P, `type`: T): PayloadAction[T, P] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadAction[T, P]]
  }
}

