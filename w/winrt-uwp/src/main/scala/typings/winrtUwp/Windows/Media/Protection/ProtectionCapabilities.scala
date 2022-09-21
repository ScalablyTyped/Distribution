package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionCapabilities extends StObject {
  
  var isTypeSupported: Any
}
object ProtectionCapabilities {
  
  inline def apply(isTypeSupported: Any): ProtectionCapabilities = {
    val __obj = js.Dynamic.literal(isTypeSupported = isTypeSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionCapabilities]
  }
  
  extension [Self <: ProtectionCapabilities](x: Self) {
    
    inline def setIsTypeSupported(value: Any): Self = StObject.set(x, "isTypeSupported", value.asInstanceOf[js.Any])
  }
}
