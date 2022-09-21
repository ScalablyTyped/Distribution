package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidconnectioneventinit-dictionary */
trait HIDConnectionEventInit extends StObject {
  
  var device: HIDDevice
}
object HIDConnectionEventInit {
  
  inline def apply(device: HIDDevice): HIDConnectionEventInit = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIDConnectionEventInit]
  }
  
  extension [Self <: HIDConnectionEventInit](x: Self) {
    
    inline def setDevice(value: HIDDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
