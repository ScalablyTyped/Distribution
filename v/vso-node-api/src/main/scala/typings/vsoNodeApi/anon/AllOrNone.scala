package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllOrNone extends StObject {
  
  var allOrNone: scala.Double
  
  var bestEffort: scala.Double
}
object AllOrNone {
  
  inline def apply(allOrNone: scala.Double, bestEffort: scala.Double): AllOrNone = {
    val __obj = js.Dynamic.literal(allOrNone = allOrNone.asInstanceOf[js.Any], bestEffort = bestEffort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllOrNone]
  }
  
  extension [Self <: AllOrNone](x: Self) {
    
    inline def setAllOrNone(value: scala.Double): Self = StObject.set(x, "allOrNone", value.asInstanceOf[js.Any])
    
    inline def setBestEffort(value: scala.Double): Self = StObject.set(x, "bestEffort", value.asInstanceOf[js.Any])
  }
}
