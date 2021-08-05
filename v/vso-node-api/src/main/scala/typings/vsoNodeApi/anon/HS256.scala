package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HS256 extends StObject {
  
  var hS256: scala.Double
  
  var none: scala.Double
  
  var rS256: scala.Double
}
object HS256 {
  
  inline def apply(hS256: scala.Double, none: scala.Double, rS256: scala.Double): HS256 = {
    val __obj = js.Dynamic.literal(hS256 = hS256.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], rS256 = rS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[HS256]
  }
  
  extension [Self <: HS256](x: Self) {
    
    inline def setHS256(value: scala.Double): Self = StObject.set(x, "hS256", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setRS256(value: scala.Double): Self = StObject.set(x, "rS256", value.asInstanceOf[js.Any])
  }
}
