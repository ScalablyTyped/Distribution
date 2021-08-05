package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AscendingDescending extends StObject {
  
  var ascending: scala.Double
  
  var descending: scala.Double
}
object AscendingDescending {
  
  inline def apply(ascending: scala.Double, descending: scala.Double): AscendingDescending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscendingDescending]
  }
  
  extension [Self <: AscendingDescending](x: Self) {
    
    inline def setAscending(value: scala.Double): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setDescending(value: scala.Double): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
  }
}
