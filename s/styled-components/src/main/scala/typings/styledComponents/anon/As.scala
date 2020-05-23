package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait As extends js.Object {
  /**
    * Typing Note: prefer using .withComponent for now as it is actually type-safe.
    *
    * String types need to be cast to themselves to become literal types (as={'a' as 'a'}).
    */
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.undefined
  var forwardedAs: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.undefined
}

object As {
  @scala.inline
  def apply(
    as: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any = null,
    forwardedAs: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any = null
  ): As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (forwardedAs != null) __obj.updateDynamic("forwardedAs")(forwardedAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
}

