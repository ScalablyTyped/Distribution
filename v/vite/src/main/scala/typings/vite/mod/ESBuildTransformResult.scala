package typings.vite.mod

import typings.esbuild.mod.Message
import typings.rollup.mod.SourceMap
import typings.std.Record
import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<esbuild.esbuild.TransformResult<esbuild.esbuild.TransformOptions>, 'map'> & {  map :rollup.rollup.SourceMap} */
trait ESBuildTransformResult extends StObject {
  
  var code: String
  
  var legalComments: String | (/* import warning: importer.ImportType#apply Failed type conversion: 'none' | 'inline' | 'eof' | 'linked' | 'external' | undefined extends 'external' ? never : undefined */ js.Any)
  
  var mangleCache: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, string | false> | undefined extends std.Object ? never : undefined */ js.Any)
  
  var map: SourceMap
  
  var warnings: js.Array[Message]
}
object ESBuildTransformResult {
  
  inline def apply(
    code: String,
    legalComments: String | (/* import warning: importer.ImportType#apply Failed type conversion: 'none' | 'inline' | 'eof' | 'linked' | 'external' | undefined extends 'external' ? never : undefined */ js.Any),
    mangleCache: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, string | false> | undefined extends std.Object ? never : undefined */ js.Any),
    map: SourceMap,
    warnings: js.Array[Message]
  ): ESBuildTransformResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], legalComments = legalComments.asInstanceOf[js.Any], mangleCache = mangleCache.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESBuildTransformResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ESBuildTransformResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLegalComments(
      value: String | (/* import warning: importer.ImportType#apply Failed type conversion: 'none' | 'inline' | 'eof' | 'linked' | 'external' | undefined extends 'external' ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "legalComments", value.asInstanceOf[js.Any])
    
    inline def setMangleCache(
      value: (Record[String, String | `false`]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, string | false> | undefined extends std.Object ? never : undefined */ js.Any)
    ): Self = StObject.set(x, "mangleCache", value.asInstanceOf[js.Any])
    
    inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
