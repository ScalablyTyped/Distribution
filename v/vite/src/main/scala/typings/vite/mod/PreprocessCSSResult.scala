package typings.vite.mod

import typings.rollup.mod.SourceMapInput
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreprocessCSSResult extends StObject {
  
  var code: String
  
  var deps: js.UndefOr[Set[String]] = js.undefined
  
  var map: js.UndefOr[SourceMapInput] = js.undefined
  
  var modules: js.UndefOr[Record[String, String]] = js.undefined
}
object PreprocessCSSResult {
  
  inline def apply(code: String): PreprocessCSSResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreprocessCSSResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreprocessCSSResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDeps(value: Set[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setMap(value: SourceMapInput): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setModules(value: Record[String, String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
  }
}
