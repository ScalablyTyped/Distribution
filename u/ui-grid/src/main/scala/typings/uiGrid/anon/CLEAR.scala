package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CLEAR extends StObject {
  
  var CLEAR: Double
  
  var CLICK: Double
  
  var KEYDOWN: Double
}
object CLEAR {
  
  @scala.inline
  def apply(CLEAR: Double, CLICK: Double, KEYDOWN: Double): CLEAR = {
    val __obj = js.Dynamic.literal(CLEAR = CLEAR.asInstanceOf[js.Any], CLICK = CLICK.asInstanceOf[js.Any], KEYDOWN = KEYDOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLEAR]
  }
  
  @scala.inline
  implicit class CLEARMutableBuilder[Self <: CLEAR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCLEAR(value: Double): Self = StObject.set(x, "CLEAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLICK(value: Double): Self = StObject.set(x, "CLICK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKEYDOWN(value: Double): Self = StObject.set(x, "KEYDOWN", value.asInstanceOf[js.Any])
  }
}
