package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  /**
    * Typing Note: prefer using .withComponent for now as it is actually type-safe.
    *
    * String types need to be cast to themselves to become literal types (as={'a' as 'a'}).
    */
  var as: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply(as: java.lang.String = null): Anon_As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[Anon_As]
  }
}

