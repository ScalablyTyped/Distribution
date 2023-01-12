package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#extensions-to-workernavigator-interface */
trait WorkerNavigator extends StObject {
  
  val serial: Serial
}
object WorkerNavigator {
  
  inline def apply(serial: Serial): WorkerNavigator = {
    val __obj = js.Dynamic.literal(serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerNavigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerNavigator] (val x: Self) extends AnyVal {
    
    inline def setSerial(value: Serial): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
