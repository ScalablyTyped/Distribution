package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#extensions-to-the-navigator-interface */
trait Navigator extends StObject {
  
  val serial: Serial
}
object Navigator {
  
  inline def apply(serial: Serial): Navigator = {
    val __obj = js.Dynamic.literal(serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setSerial(value: Serial): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
