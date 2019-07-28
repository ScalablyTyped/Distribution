package typings.tslint.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRuleFailureJson extends js.Object {
  var endPosition: IRuleFailurePositionJson
  var failure: String
  var fix: js.UndefOr[FixJson] = js.undefined
  var name: String
  var ruleName: String
  var ruleSeverity: String
  var startPosition: IRuleFailurePositionJson
}

object IRuleFailureJson {
  @scala.inline
  def apply(
    endPosition: IRuleFailurePositionJson,
    failure: String,
    name: String,
    ruleName: String,
    ruleSeverity: String,
    startPosition: IRuleFailurePositionJson,
    fix: FixJson = null
  ): IRuleFailureJson = {
    val __obj = js.Dynamic.literal(endPosition = endPosition, failure = failure, name = name, ruleName = ruleName, ruleSeverity = ruleSeverity, startPosition = startPosition)
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleFailureJson]
  }
}

