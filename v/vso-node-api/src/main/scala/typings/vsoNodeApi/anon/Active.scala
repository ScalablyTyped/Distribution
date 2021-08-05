package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: scala.Double
  
  var byDesign: scala.Double
  
  var closed: scala.Double
  
  var fixed: scala.Double
  
  var pending: scala.Double
  
  var unknown: scala.Double
  
  var wontFix: scala.Double
}
object Active {
  
  inline def apply(
    active: scala.Double,
    byDesign: scala.Double,
    closed: scala.Double,
    fixed: scala.Double,
    pending: scala.Double,
    unknown: scala.Double,
    wontFix: scala.Double
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], byDesign = byDesign.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], wontFix = wontFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: scala.Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setByDesign(value: scala.Double): Self = StObject.set(x, "byDesign", value.asInstanceOf[js.Any])
    
    inline def setClosed(value: scala.Double): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: scala.Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setPending(value: scala.Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setWontFix(value: scala.Double): Self = StObject.set(x, "wontFix", value.asInstanceOf[js.Any])
  }
}
