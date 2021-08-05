package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InUse extends StObject {
  
  var inUse: Double
  
  var total: Double
}
object InUse {
  
  inline def apply(inUse: Double, total: Double): InUse = {
    val __obj = js.Dynamic.literal(inUse = inUse.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUse]
  }
  
  extension [Self <: InUse](x: Self) {
    
    inline def setInUse(value: Double): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
