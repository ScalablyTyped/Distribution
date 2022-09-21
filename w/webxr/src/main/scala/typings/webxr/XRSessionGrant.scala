package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Oculus extensions
trait XRSessionGrant extends StObject {
  
  var mode: XRSessionMode
}
object XRSessionGrant {
  
  inline def apply(mode: XRSessionMode): XRSessionGrant = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSessionGrant]
  }
  
  extension [Self <: XRSessionGrant](x: Self) {
    
    inline def setMode(value: XRSessionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
