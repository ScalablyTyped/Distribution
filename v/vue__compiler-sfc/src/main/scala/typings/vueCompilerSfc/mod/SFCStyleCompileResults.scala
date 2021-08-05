package typings.vueCompilerSfc.mod

import typings.postcss.mod.LazyResult
import typings.postcss.mod.Result
import typings.sourceMap.mod.RawSourceMap
import typings.std.Error
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCStyleCompileResults extends StObject {
  
  var code: String
  
  var dependencies: Set[String]
  
  var errors: js.Array[Error]
  
  var map: js.UndefOr[RawSourceMap] = js.undefined
  
  var modules: js.UndefOr[Record[String, String]] = js.undefined
  
  var rawResult: js.UndefOr[LazyResult | Result] = js.undefined
}
object SFCStyleCompileResults {
  
  inline def apply(code: String, dependencies: Set[String], errors: js.Array[Error]): SFCStyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCStyleCompileResults]
  }
  
  extension [Self <: SFCStyleCompileResults](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: Set[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setModules(value: Record[String, String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setRawResult(value: LazyResult | Result): Self = StObject.set(x, "rawResult", value.asInstanceOf[js.Any])
    
    inline def setRawResultUndefined: Self = StObject.set(x, "rawResult", js.undefined)
  }
}
