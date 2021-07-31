package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Am extends StObject {
  
  var am: String
  
  var pm: String
}
object Am {
  
  @scala.inline
  def apply(am: String, pm: String): Am = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Am]
  }
  
  @scala.inline
  implicit class AmMutableBuilder[Self <: Am] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
  }
}
