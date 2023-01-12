package typings.vueCompilerCore.mod

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodegenResult extends StObject {
  
  var ast: RootNode
  
  var code: String
  
  var map: js.UndefOr[RawSourceMap] = js.undefined
  
  var preamble: String
}
object CodegenResult {
  
  inline def apply(ast: RootNode, code: String, preamble: String): CodegenResult = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], preamble = preamble.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodegenResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodegenResult] (val x: Self) extends AnyVal {
    
    inline def setAst(value: RootNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPreamble(value: String): Self = StObject.set(x, "preamble", value.asInstanceOf[js.Any])
  }
}
