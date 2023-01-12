package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeChange extends StObject {
  
  var codeChange: scala.Double
  
  var system: scala.Double
  
  var text: scala.Double
  
  var unknown: scala.Double
}
object CodeChange {
  
  inline def apply(codeChange: scala.Double, system: scala.Double, text: scala.Double, unknown: scala.Double): CodeChange = {
    val __obj = js.Dynamic.literal(codeChange = codeChange.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeChange] (val x: Self) extends AnyVal {
    
    inline def setCodeChange(value: scala.Double): Self = StObject.set(x, "codeChange", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: scala.Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setText(value: scala.Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
