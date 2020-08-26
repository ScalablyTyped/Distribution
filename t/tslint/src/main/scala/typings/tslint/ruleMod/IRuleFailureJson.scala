package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRuleFailureJson extends js.Object {
  var endPosition: IRuleFailurePositionJson = js.native
  var failure: String = js.native
  var fix: js.UndefOr[FixJson] = js.native
  var name: String = js.native
  var ruleName: String = js.native
  var ruleSeverity: String = js.native
  var startPosition: IRuleFailurePositionJson = js.native
}

object IRuleFailureJson {
  @scala.inline
  def apply(
    endPosition: IRuleFailurePositionJson,
    failure: String,
    name: String,
    ruleName: String,
    ruleSeverity: String,
    startPosition: IRuleFailurePositionJson
  ): IRuleFailureJson = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleFailureJson]
  }
  @scala.inline
  implicit class IRuleFailureJsonOps[Self <: IRuleFailureJson] (val x: Self) extends AnyVal {
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
    def setEndPosition(value: IRuleFailurePositionJson): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure(value: String): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleSeverity(value: String): Self = this.set("ruleSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPosition(value: IRuleFailurePositionJson): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixVarargs(value: ReplacementJson*): Self = this.set("fix", js.Array(value :_*))
    @scala.inline
    def setFix(value: FixJson): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
  }
  
}

