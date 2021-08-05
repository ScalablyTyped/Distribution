package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var bluetooth: Bluetooth
}
object Navigator {
  
  inline def apply(bluetooth: Bluetooth): Navigator = {
    val __obj = js.Dynamic.literal(bluetooth = bluetooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setBluetooth(value: Bluetooth): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
  }
}
