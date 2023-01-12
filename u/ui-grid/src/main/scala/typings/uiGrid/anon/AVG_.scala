package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVG_ extends StObject {
  
  var AVG: String
  
  var COUNT: String
  
  var MAX: String
  
  var MIN: String
  
  var SUM: String
}
object AVG_ {
  
  inline def apply(AVG: String, COUNT: String, MAX: String, MIN: String, SUM: String): AVG_ = {
    val __obj = js.Dynamic.literal(AVG = AVG.asInstanceOf[js.Any], COUNT = COUNT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any], SUM = SUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVG_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AVG_] (val x: Self) extends AnyVal {
    
    inline def setAVG(value: String): Self = StObject.set(x, "AVG", value.asInstanceOf[js.Any])
    
    inline def setCOUNT(value: String): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    inline def setMAX(value: String): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    inline def setMIN(value: String): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
    
    inline def setSUM(value: String): Self = StObject.set(x, "SUM", value.asInstanceOf[js.Any])
  }
}
