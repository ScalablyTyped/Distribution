package typings.vueCompilerSfc.mod

import typings.postcss.mod.LazyResult
import typings.postcss.mod.Result
import typings.sourceMap.mod.RawSourceMap
import typings.std.Error
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCStyleCompileResults extends StObject {
  
  var code: String = js.native
  
  var dependencies: Set[String] = js.native
  
  var errors: js.Array[Error] = js.native
  
  var map: js.UndefOr[RawSourceMap] = js.native
  
  var modules: js.UndefOr[Record[String, String]] = js.native
  
  var rawResult: js.UndefOr[LazyResult | Result] = js.native
}
object SFCStyleCompileResults {
  
  @scala.inline
  def apply(code: String, dependencies: Set[String], errors: js.Array[Error]): SFCStyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCStyleCompileResults]
  }
  
  @scala.inline
  implicit class SFCStyleCompileResultsMutableBuilder[Self <: SFCStyleCompileResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: Set[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setModules(value: Record[String, String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setRawResult(value: LazyResult | Result): Self = StObject.set(x, "rawResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawResultUndefined: Self = StObject.set(x, "rawResult", js.undefined)
  }
}
