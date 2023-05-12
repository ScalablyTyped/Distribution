package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Critical extends StObject {
  
  var critical: String
  
  var high: String
  
  var info: String
  
  var low: String
  
  var medium: String
  
  var safe: String
  
  var unknown: String
}
object Critical {
  
  inline def apply(
    critical: String,
    high: String,
    info: String,
    low: String,
    medium: String,
    safe: String,
    unknown: String
  ): Critical = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Critical] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: String): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSafe(value: String): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: String): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
