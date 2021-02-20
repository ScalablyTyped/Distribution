package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`2`
import org.scalablytyped.runtime.StObject
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
  implicit class ASTExpressionMutableBuilder[Self <: ASTExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrOptimizability(value: SSROptimizability): Self = StObject.set(x, "ssrOptimizability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrOptimizabilityUndefined: Self = StObject.set(x, "ssrOptimizability", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[String | (Record[String, _])]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: (String | (Record[String, js.Any]))*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
