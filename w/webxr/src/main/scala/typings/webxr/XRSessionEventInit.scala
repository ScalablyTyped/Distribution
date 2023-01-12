package typings.webxr

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSessionEventInit
  extends StObject
     with EventInit {
  
  var session: XRSession
}
object XRSessionEventInit {
  
  inline def apply(session: XRSession): XRSessionEventInit = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSessionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRSessionEventInit] (val x: Self) extends AnyVal {
    
    inline def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
