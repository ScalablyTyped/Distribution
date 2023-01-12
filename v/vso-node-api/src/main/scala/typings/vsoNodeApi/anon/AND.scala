package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AND extends StObject {
  
  var aND: scala.Double
  
  var nONE: scala.Double
  
  var oR: scala.Double
}
object AND {
  
  inline def apply(aND: scala.Double, nONE: scala.Double, oR: scala.Double): AND = {
    val __obj = js.Dynamic.literal(aND = aND.asInstanceOf[js.Any], nONE = nONE.asInstanceOf[js.Any], oR = oR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AND] (val x: Self) extends AnyVal {
    
    inline def setAND(value: scala.Double): Self = StObject.set(x, "aND", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: scala.Double): Self = StObject.set(x, "nONE", value.asInstanceOf[js.Any])
    
    inline def setOR(value: scala.Double): Self = StObject.set(x, "oR", value.asInstanceOf[js.Any])
  }
}
