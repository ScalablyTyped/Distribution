package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVG_ extends StObject {
  
  var AVG: String = js.native
  
  var COUNT: String = js.native
  
  var MAX: String = js.native
  
  var MIN: String = js.native
  
  var SUM: String = js.native
}
object AVG_ {
  
  @scala.inline
  def apply(AVG: String, COUNT: String, MAX: String, MIN: String, SUM: String): AVG_ = {
    val __obj = js.Dynamic.literal(AVG = AVG.asInstanceOf[js.Any], COUNT = COUNT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any], SUM = SUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVG_]
  }
  
  @scala.inline
  implicit class AVG_MutableBuilder[Self <: AVG_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAVG(value: String): Self = StObject.set(x, "AVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOUNT(value: String): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX(value: String): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN(value: String): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUM(value: String): Self = StObject.set(x, "SUM", value.asInstanceOf[js.Any])
  }
}
