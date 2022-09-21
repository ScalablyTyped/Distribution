package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serialinputsignals */
trait SerialInputSignals extends StObject {
  
  var clearToSend: Boolean
  
  var dataCarrierDetect: Boolean
  
  var dataSetReady: Boolean
  
  var ringIndicator: Boolean
}
object SerialInputSignals {
  
  inline def apply(clearToSend: Boolean, dataCarrierDetect: Boolean, dataSetReady: Boolean, ringIndicator: Boolean): SerialInputSignals = {
    val __obj = js.Dynamic.literal(clearToSend = clearToSend.asInstanceOf[js.Any], dataCarrierDetect = dataCarrierDetect.asInstanceOf[js.Any], dataSetReady = dataSetReady.asInstanceOf[js.Any], ringIndicator = ringIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialInputSignals]
  }
  
  extension [Self <: SerialInputSignals](x: Self) {
    
    inline def setClearToSend(value: Boolean): Self = StObject.set(x, "clearToSend", value.asInstanceOf[js.Any])
    
    inline def setDataCarrierDetect(value: Boolean): Self = StObject.set(x, "dataCarrierDetect", value.asInstanceOf[js.Any])
    
    inline def setDataSetReady(value: Boolean): Self = StObject.set(x, "dataSetReady", value.asInstanceOf[js.Any])
    
    inline def setRingIndicator(value: Boolean): Self = StObject.set(x, "ringIndicator", value.asInstanceOf[js.Any])
  }
}
