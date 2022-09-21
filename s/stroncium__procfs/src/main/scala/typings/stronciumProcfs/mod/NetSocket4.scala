package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetSocket4 extends StObject {
  
  var localAddress: Double
  
  var localPort: Double
  
  var remoteAddress: Double
  
  var remotePort: Double
  
  var rxQueue: Double
  
  var slot: Double
  
  var txQueue: Double
  
  var uid: Double
}
object NetSocket4 {
  
  inline def apply(
    localAddress: Double,
    localPort: Double,
    remoteAddress: Double,
    remotePort: Double,
    rxQueue: Double,
    slot: Double,
    txQueue: Double,
    uid: Double
  ): NetSocket4 = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], rxQueue = rxQueue.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], txQueue = txQueue.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetSocket4]
  }
  
  extension [Self <: NetSocket4](x: Self) {
    
    inline def setLocalAddress(value: Double): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: Double): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    inline def setRxQueue(value: Double): Self = StObject.set(x, "rxQueue", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: Double): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setTxQueue(value: Double): Self = StObject.set(x, "txQueue", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
