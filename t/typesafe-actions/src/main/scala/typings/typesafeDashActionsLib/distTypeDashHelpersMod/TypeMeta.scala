package typings
package typesafeDashActionsLib.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMeta[T /* <: StringType */] extends js.Object {
  var getType: js.UndefOr[js.Function0[T]] = js.undefined
}

object TypeMeta {
  @scala.inline
  def apply[T /* <: StringType */](getType: () => T = null): TypeMeta[T] = {
    val __obj = js.Dynamic.literal()
    if (getType != null) __obj.updateDynamic("getType")(js.Any.fromFunction0(getType))
    __obj.asInstanceOf[TypeMeta[T]]
  }
}

