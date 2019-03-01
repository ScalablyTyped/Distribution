package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeEmpty extends js.Object {
  var includeEmpty: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeEmpty {
  @scala.inline
  def apply(includeEmpty: js.UndefOr[scala.Boolean] = js.undefined): Anon_IncludeEmpty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeEmpty)) __obj.updateDynamic("includeEmpty")(includeEmpty)
    __obj.asInstanceOf[Anon_IncludeEmpty]
  }
}

