package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /**
    * An XRSystem object is the entry point to the API, used to query for XR features
    * available to the user agent and initiate communication with XR hardware via the
    * creation of XRSessions.
    */
  var xr: js.UndefOr[XRSystem] = js.undefined
}
object Navigator {
  
  inline def apply(): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setXr(value: XRSystem): Self = StObject.set(x, "xr", value.asInstanceOf[js.Any])
    
    inline def setXrUndefined: Self = StObject.set(x, "xr", js.undefined)
  }
}
