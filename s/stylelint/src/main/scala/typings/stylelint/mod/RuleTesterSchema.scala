package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleTesterSchema extends js.Object {
  var accept: js.UndefOr[js.Array[RuleTesterTest]] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var reject: js.UndefOr[js.Array[RuleTesterTestRejected]] = js.undefined
  var ruleName: String
  var syntax: js.UndefOr[SyntaxType] = js.undefined
}

object RuleTesterSchema {
  @scala.inline
  def apply(
    ruleName: String,
    accept: js.Array[RuleTesterTest] = null,
    config: js.Any = null,
    reject: js.Array[RuleTesterTestRejected] = null,
    syntax: SyntaxType = null
  ): RuleTesterSchema = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (reject != null) __obj.updateDynamic("reject")(reject.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterSchema]
  }
}

