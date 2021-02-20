package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompiledResult[ErrorType] extends StObject {
  
  var ast: js.UndefOr[ASTElement] = js.native
  
  var errors: js.Array[ErrorType] = js.native
  
  var render: String = js.native
  
  var staticRenderFns: js.Array[String] = js.native
  
  var tips: js.Array[ErrorType] = js.native
}
object CompiledResult {
  
  @scala.inline
  def apply[ErrorType](
    errors: js.Array[ErrorType],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[ErrorType]
  ): CompiledResult[ErrorType] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResult[ErrorType]]
  }
  
  @scala.inline
  implicit class CompiledResultMutableBuilder[Self <: CompiledResult[_], ErrorType] (val x: Self with CompiledResult[ErrorType]) extends AnyVal {
    
    @scala.inline
    def setAst(value: ASTElement): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[ErrorType]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ErrorType*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticRenderFns(value: js.Array[String]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticRenderFnsVarargs(value: String*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
    
    @scala.inline
    def setTips(value: js.Array[ErrorType]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: ErrorType*): Self = StObject.set(x, "tips", js.Array(value :_*))
  }
}
