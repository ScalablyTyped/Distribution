package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] extends js.Object {
  var as: js.UndefOr[C] = js.undefined
  var forwardedAs: js.UndefOr[C] = js.undefined
}

object ForwardedAs {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 * / js.Any */ C](as: C = null, forwardedAs: C = null): ForwardedAs[C] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (forwardedAs != null) __obj.updateDynamic("forwardedAs")(forwardedAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedAs[C]]
  }
}

