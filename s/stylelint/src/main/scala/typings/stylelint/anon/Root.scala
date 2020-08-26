package typings.stylelint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Root extends js.Object {
  var root: js.Any = js.native
  var ruleName: String = js.native
  var ruleSettings: js.Any = js.native
}

object Root {
  @scala.inline
  def apply(root: js.Any, ruleName: String, ruleSettings: js.Any): Root = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSettings = ruleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  @scala.inline
  implicit class RootOps[Self <: Root] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleSettings(value: js.Any): Self = this.set("ruleSettings", value.asInstanceOf[js.Any])
  }
  
}

