package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S extends StObject {
  
  var s: Double
  
  var v: Double
}
object S {
  
  inline def apply(s: Double, v: Double): S = {
    val __obj = js.Dynamic.literal(s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  
  extension [Self <: S](x: Self) {
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
