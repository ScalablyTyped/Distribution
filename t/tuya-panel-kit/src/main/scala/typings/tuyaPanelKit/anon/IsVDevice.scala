package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVDevice extends StObject {
  
  var isVDevice: Boolean
}
object IsVDevice {
  
  inline def apply(isVDevice: Boolean): IsVDevice = {
    val __obj = js.Dynamic.literal(isVDevice = isVDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVDevice]
  }
  
  extension [Self <: IsVDevice](x: Self) {
    
    inline def setIsVDevice(value: Boolean): Self = StObject.set(x, "isVDevice", value.asInstanceOf[js.Any])
  }
}
