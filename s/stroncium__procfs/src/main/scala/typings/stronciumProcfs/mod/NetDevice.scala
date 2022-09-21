package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetDevice extends StObject {
  
  var name: String
  
  var rxBytes: Double
  
  var rxCompressed: Double
  
  var rxDrop: Double
  
  var rxErrors: Double
  
  var rxFifo: Double
  
  var rxFrame: Double
  
  var rxMulticast: Double
  
  var rxPackets: Double
  
  var txBytes: Double
  
  var txCarrier: Double
  
  var txColls: Double
  
  var txCompressed: Double
  
  var txDrop: Double
  
  var txErrors: Double
  
  var txFifo: Double
  
  var txPackets: Double
}
object NetDevice {
  
  inline def apply(
    name: String,
    rxBytes: Double,
    rxCompressed: Double,
    rxDrop: Double,
    rxErrors: Double,
    rxFifo: Double,
    rxFrame: Double,
    rxMulticast: Double,
    rxPackets: Double,
    txBytes: Double,
    txCarrier: Double,
    txColls: Double,
    txCompressed: Double,
    txDrop: Double,
    txErrors: Double,
    txFifo: Double,
    txPackets: Double
  ): NetDevice = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rxBytes = rxBytes.asInstanceOf[js.Any], rxCompressed = rxCompressed.asInstanceOf[js.Any], rxDrop = rxDrop.asInstanceOf[js.Any], rxErrors = rxErrors.asInstanceOf[js.Any], rxFifo = rxFifo.asInstanceOf[js.Any], rxFrame = rxFrame.asInstanceOf[js.Any], rxMulticast = rxMulticast.asInstanceOf[js.Any], rxPackets = rxPackets.asInstanceOf[js.Any], txBytes = txBytes.asInstanceOf[js.Any], txCarrier = txCarrier.asInstanceOf[js.Any], txColls = txColls.asInstanceOf[js.Any], txCompressed = txCompressed.asInstanceOf[js.Any], txDrop = txDrop.asInstanceOf[js.Any], txErrors = txErrors.asInstanceOf[js.Any], txFifo = txFifo.asInstanceOf[js.Any], txPackets = txPackets.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetDevice]
  }
  
  extension [Self <: NetDevice](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRxBytes(value: Double): Self = StObject.set(x, "rxBytes", value.asInstanceOf[js.Any])
    
    inline def setRxCompressed(value: Double): Self = StObject.set(x, "rxCompressed", value.asInstanceOf[js.Any])
    
    inline def setRxDrop(value: Double): Self = StObject.set(x, "rxDrop", value.asInstanceOf[js.Any])
    
    inline def setRxErrors(value: Double): Self = StObject.set(x, "rxErrors", value.asInstanceOf[js.Any])
    
    inline def setRxFifo(value: Double): Self = StObject.set(x, "rxFifo", value.asInstanceOf[js.Any])
    
    inline def setRxFrame(value: Double): Self = StObject.set(x, "rxFrame", value.asInstanceOf[js.Any])
    
    inline def setRxMulticast(value: Double): Self = StObject.set(x, "rxMulticast", value.asInstanceOf[js.Any])
    
    inline def setRxPackets(value: Double): Self = StObject.set(x, "rxPackets", value.asInstanceOf[js.Any])
    
    inline def setTxBytes(value: Double): Self = StObject.set(x, "txBytes", value.asInstanceOf[js.Any])
    
    inline def setTxCarrier(value: Double): Self = StObject.set(x, "txCarrier", value.asInstanceOf[js.Any])
    
    inline def setTxColls(value: Double): Self = StObject.set(x, "txColls", value.asInstanceOf[js.Any])
    
    inline def setTxCompressed(value: Double): Self = StObject.set(x, "txCompressed", value.asInstanceOf[js.Any])
    
    inline def setTxDrop(value: Double): Self = StObject.set(x, "txDrop", value.asInstanceOf[js.Any])
    
    inline def setTxErrors(value: Double): Self = StObject.set(x, "txErrors", value.asInstanceOf[js.Any])
    
    inline def setTxFifo(value: Double): Self = StObject.set(x, "txFifo", value.asInstanceOf[js.Any])
    
    inline def setTxPackets(value: Double): Self = StObject.set(x, "txPackets", value.asInstanceOf[js.Any])
  }
}
