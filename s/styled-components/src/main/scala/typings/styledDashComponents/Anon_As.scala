package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends js.Object {
  var as: js.UndefOr[C] = js.undefined
  var forwardedAs: js.UndefOr[C] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](as: C = null, forwardedAs: C = null): Anon_As[C] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (forwardedAs != null) __obj.updateDynamic("forwardedAs")(forwardedAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_As[C]]
  }
}

