package typings.vite.mod

import typings.esbuild.mod.Message
import typings.rollup.mod.SourceMap
import typings.std.Record
import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<esbuild.esbuild.TransformResult, 'map'> & {  map :rollup.rollup.SourceMap} */
trait ESBuildTransformResult extends StObject {
  
  var code: String
  
  var mangleCache: js.UndefOr[Record[String, String | `false`]] = js.undefined
  
  var map: SourceMap
  
  var warnings: js.Array[Message]
}
object ESBuildTransformResult {
  
  inline def apply(code: String, map: SourceMap, warnings: js.Array[Message]): ESBuildTransformResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESBuildTransformResult]
  }
  
  extension [Self <: ESBuildTransformResult](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMangleCache(value: Record[String, String | `false`]): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMangleCacheUndefined: Self = StObject.set(x, "mangleCache", js.undefined)
    
    inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
