package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterGatesAlways extends StObject {
  
  var afterGatesAlways: scala.Double
  
  var afterSuccessfulGates: scala.Double
  
  var beforeGates: scala.Double
}
object AfterGatesAlways {
  
  inline def apply(afterGatesAlways: scala.Double, afterSuccessfulGates: scala.Double, beforeGates: scala.Double): AfterGatesAlways = {
    val __obj = js.Dynamic.literal(afterGatesAlways = afterGatesAlways.asInstanceOf[js.Any], afterSuccessfulGates = afterSuccessfulGates.asInstanceOf[js.Any], beforeGates = beforeGates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterGatesAlways]
  }
  
  extension [Self <: AfterGatesAlways](x: Self) {
    
    inline def setAfterGatesAlways(value: scala.Double): Self = StObject.set(x, "afterGatesAlways", value.asInstanceOf[js.Any])
    
    inline def setAfterSuccessfulGates(value: scala.Double): Self = StObject.set(x, "afterSuccessfulGates", value.asInstanceOf[js.Any])
    
    inline def setBeforeGates(value: scala.Double): Self = StObject.set(x, "beforeGates", value.asInstanceOf[js.Any])
  }
}
