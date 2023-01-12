package typings.webpack.mod

import typings.webpack.anon.Exports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteModuleArgument extends StObject {
  
  var codeGenerationResult: CodeGenerationResult
  
  var module: Module
  
  var moduleObject: js.UndefOr[Exports] = js.undefined
  
  var preparedInfo: Any
}
object ExecuteModuleArgument {
  
  inline def apply(codeGenerationResult: CodeGenerationResult, module: Module, preparedInfo: Any): ExecuteModuleArgument = {
    val __obj = js.Dynamic.literal(codeGenerationResult = codeGenerationResult.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], preparedInfo = preparedInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteModuleArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteModuleArgument] (val x: Self) extends AnyVal {
    
    inline def setCodeGenerationResult(value: CodeGenerationResult): Self = StObject.set(x, "codeGenerationResult", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleObject(value: Exports): Self = StObject.set(x, "moduleObject", value.asInstanceOf[js.Any])
    
    inline def setModuleObjectUndefined: Self = StObject.set(x, "moduleObject", js.undefined)
    
    inline def setPreparedInfo(value: Any): Self = StObject.set(x, "preparedInfo", value.asInstanceOf[js.Any])
  }
}
