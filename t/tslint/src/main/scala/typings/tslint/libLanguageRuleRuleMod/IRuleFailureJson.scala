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
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleFailureJson]
  }
}

