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

