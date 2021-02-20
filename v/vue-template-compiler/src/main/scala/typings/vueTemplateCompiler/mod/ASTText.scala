package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASTText extends ASTNode {
  
  var isComment: js.UndefOr[Boolean] = js.native
  
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
  
  var text: String = js.native
  
  var `type`: `3` = js.native
}
object ASTText {
  
  @scala.inline
  def apply(text: String, `type`: `3`): ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTText]
  }
  
  @scala.inline
  implicit class ASTTextMutableBuilder[Self <: ASTText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsComment(value: Boolean): Self = StObject.set(x, "isComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCommentUndefined: Self = StObject.set(x, "isComment", js.undefined)
    
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
    def setType(value: `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
