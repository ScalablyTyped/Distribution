package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartiallyResolved extends StObject {
  
  var partiallyResolved: scala.Double
  
  var resolved: scala.Double
  
  var unresolved: scala.Double
}
object PartiallyResolved {
  
  inline def apply(partiallyResolved: scala.Double, resolved: scala.Double, unresolved: scala.Double): PartiallyResolved = {
    val __obj = js.Dynamic.literal(partiallyResolved = partiallyResolved.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallyResolved]
  }
  
  extension [Self <: PartiallyResolved](x: Self) {
    
    inline def setPartiallyResolved(value: scala.Double): Self = StObject.set(x, "partiallyResolved", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: scala.Double): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setUnresolved(value: scala.Double): Self = StObject.set(x, "unresolved", value.asInstanceOf[js.Any])
  }
}
