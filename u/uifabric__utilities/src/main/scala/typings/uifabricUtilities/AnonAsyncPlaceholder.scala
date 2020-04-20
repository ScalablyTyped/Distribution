package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.undefined
}

object AnonAsyncPlaceholder {
  @scala.inline
  def apply(
    asyncPlaceholder: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any = null
  ): AnonAsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (asyncPlaceholder != null) __obj.updateDynamic("asyncPlaceholder")(asyncPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncPlaceholder]
  }
}

