package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterContext extends js.Object {
  var caseDescription: java.lang.String
  var comparisonCount: scala.Double
  var completeAssertionDescription: java.lang.String
  var only: js.UndefOr[scala.Boolean] = js.undefined
}

object RuleTesterContext {
  @scala.inline
  def apply(
    caseDescription: java.lang.String,
    comparisonCount: scala.Double,
    completeAssertionDescription: java.lang.String,
    only: js.UndefOr[scala.Boolean] = js.undefined
  ): RuleTesterContext = {
    val __obj = js.Dynamic.literal(caseDescription = caseDescription, comparisonCount = comparisonCount, completeAssertionDescription = completeAssertionDescription)
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only)
    __obj.asInstanceOf[RuleTesterContext]
  }
}

