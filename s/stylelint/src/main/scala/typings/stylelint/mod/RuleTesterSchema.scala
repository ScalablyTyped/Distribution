package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleTesterSchema extends js.Object {
  
  var accept: js.UndefOr[js.Array[RuleTesterTest]] = js.native
  
  var config: js.UndefOr[js.Any] = js.native
  
  var reject: js.UndefOr[js.Array[RuleTesterTestRejected]] = js.native
  
  var ruleName: String = js.native
  
  var syntax: js.UndefOr[SyntaxType] = js.native
}
object RuleTesterSchema {
  
  @scala.inline
  def apply(ruleName: String): RuleTesterSchema = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterSchema]
  }
  
  @scala.inline
  implicit class RuleTesterSchemaOps[Self <: RuleTesterSchema] (val x: Self) extends AnyVal {
    
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
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptVarargs(value: RuleTesterTest*): Self = this.set("accept", js.Array(value :_*))
    
    @scala.inline
    def setAccept(value: js.Array[RuleTesterTest]): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setRejectVarargs(value: RuleTesterTestRejected*): Self = this.set("reject", js.Array(value :_*))
    
    @scala.inline
    def setReject(value: js.Array[RuleTesterTestRejected]): Self = this.set("reject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
    
    @scala.inline
    def setSyntax(value: SyntaxType): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
}
