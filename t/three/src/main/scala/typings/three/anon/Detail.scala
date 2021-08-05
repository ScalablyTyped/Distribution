package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detail extends StObject {
  
  var detail: Double
  
  var radius: Double
}
object Detail {
  
  inline def apply(detail: Double, radius: Double): Detail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
  
  extension [Self <: Detail](x: Self) {
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
