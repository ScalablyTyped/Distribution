package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exports extends StObject {
  
  var exports: Any
  
  var id: String
  
  var loaded: Boolean
}
object Exports {
  
  inline def apply(exports: Any, id: String, loaded: Boolean): Exports = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports]
  }
  
  extension [Self <: Exports](x: Self) {
    
    inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
  }
}
