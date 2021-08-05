package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousChange extends StObject {
  
  var firstParent: scala.Double
  
  var none: scala.Double
  
  var previousChange: scala.Double
}
object PreviousChange {
  
  inline def apply(firstParent: scala.Double, none: scala.Double, previousChange: scala.Double): PreviousChange = {
    val __obj = js.Dynamic.literal(firstParent = firstParent.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], previousChange = previousChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousChange]
  }
  
  extension [Self <: PreviousChange](x: Self) {
    
    inline def setFirstParent(value: scala.Double): Self = StObject.set(x, "firstParent", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPreviousChange(value: scala.Double): Self = StObject.set(x, "previousChange", value.asInstanceOf[js.Any])
  }
}
