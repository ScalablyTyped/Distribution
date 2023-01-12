package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTText
  extends StObject
     with ASTNode {
  
  var isComment: js.UndefOr[Boolean] = js.undefined
  
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
  
  var text: String
  
  var `type`: `3`
}
object ASTText {
  
  inline def apply(text: String): ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[ASTText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASTText] (val x: Self) extends AnyVal {
    
    inline def setIsComment(value: Boolean): Self = StObject.set(x, "isComment", value.asInstanceOf[js.Any])
    
    inline def setIsCommentUndefined: Self = StObject.set(x, "isComment", js.undefined)
    
    inline def setSsrOptimizability(value: SSROptimizability): Self = StObject.set(x, "ssrOptimizability", value.asInstanceOf[js.Any])
    
    inline def setSsrOptimizabilityUndefined: Self = StObject.set(x, "ssrOptimizability", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
