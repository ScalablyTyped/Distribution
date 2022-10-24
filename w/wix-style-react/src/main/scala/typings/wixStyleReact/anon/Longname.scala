package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Longname extends StObject {
  
  var long_name: Double
  
  var types: js.Array[String]
}
object Longname {
  
  inline def apply(long_name: Double, types: js.Array[String]): Longname = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longname]
  }
  
  extension [Self <: Longname](x: Self) {
    
    inline def setLong_name(value: Double): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
