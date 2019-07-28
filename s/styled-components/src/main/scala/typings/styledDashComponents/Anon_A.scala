package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  /**
    * Typing Note: prefer using .withComponent for now as it is actually type-safe.
    *
    * String types need to be cast to themselves to become literal types (as={'a' as 'a'}).
    */
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 176 */ js.Any
  ] = js.undefined
}

object Anon_A {
  @scala.inline
  def apply(
    as: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 176 */ js.Any = null
  ): Anon_A = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[Anon_A]
  }
}

