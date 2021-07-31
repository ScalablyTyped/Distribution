package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NONE extends StObject {
  
  var LEFT: String
  
  var NONE: String
  
  var RIGHT: String
}
object NONE {
  
  @scala.inline
  def apply(LEFT: String, NONE: String, RIGHT: String): NONE = {
    val __obj = js.Dynamic.literal(LEFT = LEFT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[NONE]
  }
  
  @scala.inline
  implicit class NONEMutableBuilder[Self <: NONE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLEFT(value: String): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: String): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
  }
}
