package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModulePathData extends StObject {
  
  var hash: String
  
  var hashWithLength: js.UndefOr[js.Function1[/* arg0 */ Double, String]] = js.undefined
  
  var id: String | Double
}
object ModulePathData {
  
  inline def apply(hash: String, id: String | Double): ModulePathData = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulePathData]
  }
  
  extension [Self <: ModulePathData](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashWithLength(value: /* arg0 */ Double => String): Self = StObject.set(x, "hashWithLength", js.Any.fromFunction1(value))
    
    inline def setHashWithLengthUndefined: Self = StObject.set(x, "hashWithLength", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
