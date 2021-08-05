package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Am extends StObject {
  
  var am: String
  
  var pm: String
}
object Am {
  
  inline def apply(am: String, pm: String): Am = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Am]
  }
  
  extension [Self <: Am](x: Self) {
    
    inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
  }
}
