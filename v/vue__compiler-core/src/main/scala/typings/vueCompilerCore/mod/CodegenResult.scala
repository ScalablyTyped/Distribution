package typings.vueCompilerCore.mod

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodegenResult extends StObject {
  
  var ast: RootNode = js.native
  
  var code: String = js.native
  
  var map: js.UndefOr[RawSourceMap] = js.native
}
object CodegenResult {
  
  @scala.inline
  def apply(ast: RootNode, code: String): CodegenResult = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodegenResult]
  }
  
  @scala.inline
  implicit class CodegenResultMutableBuilder[Self <: CodegenResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: RootNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
