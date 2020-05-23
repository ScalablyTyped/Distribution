package typings.stylelint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  var root: js.Any
  var ruleName: String
  var ruleSettings: js.Any
}

object Root {
  @scala.inline
  def apply(root: js.Any, ruleName: String, ruleSettings: js.Any): Root = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSettings = ruleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

