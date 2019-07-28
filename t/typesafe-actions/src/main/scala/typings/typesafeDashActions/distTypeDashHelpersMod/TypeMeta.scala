package typings.typesafeDashActions.distTypeDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMeta[TType /* <: TypeConstant */] extends js.Object {
  var getType: js.UndefOr[js.Function0[TType]] = js.undefined
}

object TypeMeta {
  @scala.inline
  def apply[TType /* <: TypeConstant */](getType: () => TType = null): TypeMeta[TType] = {
    val __obj = js.Dynamic.literal()
    if (getType != null) __obj.updateDynamic("getType")(js.Any.fromFunction0(getType))
    __obj.asInstanceOf[TypeMeta[TType]]
  }
}

