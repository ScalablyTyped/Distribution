package typings.vite.mod

import typings.rollup.mod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformResult extends StObject {
  
  var code: String
  
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  
  var dynamicDeps: js.UndefOr[js.Array[String]] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var map: SourceMap | Null
}
object TransformResult {
  
  inline def apply(code: String): TransformResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = null)
    __obj.asInstanceOf[TransformResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setDynamicDeps(value: js.Array[String]): Self = StObject.set(x, "dynamicDeps", value.asInstanceOf[js.Any])
    
    inline def setDynamicDepsUndefined: Self = StObject.set(x, "dynamicDeps", js.undefined)
    
    inline def setDynamicDepsVarargs(value: String*): Self = StObject.set(x, "dynamicDeps", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
  }
}
