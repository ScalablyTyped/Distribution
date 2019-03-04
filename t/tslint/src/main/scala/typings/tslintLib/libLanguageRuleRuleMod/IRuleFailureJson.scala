package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRuleFailureJson extends js.Object {
  var endPosition: IRuleFailurePositionJson
  var failure: java.lang.String
  var fix: js.UndefOr[FixJson] = js.undefined
  var name: java.lang.String
  var ruleName: java.lang.String
  var ruleSeverity: java.lang.String
  var startPosition: IRuleFailurePositionJson
}

object IRuleFailureJson {
  @scala.inline
  def apply(
    endPosition: IRuleFailurePositionJson,
    failure: java.lang.String,
    name: java.lang.String,
    ruleName: java.lang.String,
    ruleSeverity: java.lang.String,
    startPosition: IRuleFailurePositionJson,
    fix: FixJson = null
  ): IRuleFailureJson = {
    val __obj = js.Dynamic.literal(endPosition = endPosition, failure = failure, name = name, ruleName = ruleName, ruleSeverity = ruleSeverity, startPosition = startPosition)
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleFailureJson]
  }
}

