package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetU2FCounter extends StObject {
  
  var u2f_counter: Double
}
object SetU2FCounter {
  
  inline def apply(u2f_counter: Double): SetU2FCounter = {
    val __obj = js.Dynamic.literal(u2f_counter = u2f_counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetU2FCounter]
  }
  
  extension [Self <: SetU2FCounter](x: Self) {
    
    inline def setU2f_counter(value: Double): Self = StObject.set(x, "u2f_counter", value.asInstanceOf[js.Any])
  }
}
