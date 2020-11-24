package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASTExpression extends ASTNode {
  
  var expression: String = js.native
  
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
  
  var text: String = js.native
  
  var tokens: js.Array[String | (Record[String, _])] = js.native
  
  var `type`: `2` = js.native
}
object ASTExpression {
  
  @scala.inline
  def apply(expression: String, text: String, tokens: js.Array[String | (Record[String, _])], `type`: `2`): ASTExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTExpression]
  }
  
  @scala.inline
  implicit class ASTExpressionOps[Self <: ASTExpression] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: (String | (Record[String, js.Any]))*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[String | (Record[String, _])]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `2`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrOptimizability(value: SSROptimizability): Self = this.set("ssrOptimizability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrOptimizability: Self = this.set("ssrOptimizability", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
}
