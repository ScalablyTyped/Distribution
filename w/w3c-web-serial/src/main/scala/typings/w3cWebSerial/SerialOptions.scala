package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serialoptions */
trait SerialOptions extends StObject {
  
  var baudRate: Double
  
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var dataBits: js.UndefOr[Double] = js.undefined
  
  var flowControl: js.UndefOr[FlowControlType] = js.undefined
  
  var parity: js.UndefOr[ParityType] = js.undefined
  
  var stopBits: js.UndefOr[Double] = js.undefined
}
object SerialOptions {
  
  inline def apply(baudRate: Double): SerialOptions = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialOptions] (val x: Self) extends AnyVal {
    
    inline def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setDataBits(value: Double): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
    
    inline def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
    
    inline def setFlowControl(value: FlowControlType): Self = StObject.set(x, "flowControl", value.asInstanceOf[js.Any])
    
    inline def setFlowControlUndefined: Self = StObject.set(x, "flowControl", js.undefined)
    
    inline def setParity(value: ParityType): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
    
    inline def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
    
    inline def setStopBits(value: Double): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
    
    inline def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
  }
}
