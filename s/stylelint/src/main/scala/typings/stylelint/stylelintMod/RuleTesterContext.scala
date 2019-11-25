package typings.stylelint.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterContext extends js.Object {
  var caseDescription: String
  var comparisonCount: Double
  var completeAssertionDescription: String
  var only: js.UndefOr[Boolean] = js.undefined
}

object RuleTesterContext {
  @scala.inline
  def apply(
    caseDescription: String,
    comparisonCount: Double,
    completeAssertionDescription: String,
    only: js.UndefOr[Boolean] = js.undefined
  ): RuleTesterContext = {
    val __obj = js.Dynamic.literal(caseDescription = caseDescription.asInstanceOf[js.Any], comparisonCount = comparisonCount.asInstanceOf[js.Any], completeAssertionDescription = completeAssertionDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterContext]
  }
}

