package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledBoolean extends StObject {
  
  var enabled: Boolean
}
object EnabledBoolean {
  
  inline def apply(enabled: Boolean): EnabledBoolean = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledBoolean]
  }
  
  extension [Self <: EnabledBoolean](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
