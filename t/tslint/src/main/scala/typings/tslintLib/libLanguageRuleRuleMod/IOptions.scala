package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOptions extends js.Object {
  /**
       * @deprecated
       * Tslint now handles disables itself.
       * This will be empty.
       */
  var disabledIntervals: js.Array[IDisabledInterval]
  var ruleArguments: js.Array[_]
  var ruleName: java.lang.String
  var ruleSeverity: RuleSeverity
}

