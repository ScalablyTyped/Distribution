package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivedMediaStats extends StObject {
  
  /** 已接收字节数 */
  var bytesReceived: Double
  
  /** 丢包数 */
  var packetsLost: Double
  
  /** 已接收包数 */
  var packetsReceived: Double
}
object ReceivedMediaStats {
  
  inline def apply(bytesReceived: Double, packetsLost: Double, packetsReceived: Double): ReceivedMediaStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], packetsLost = packetsLost.asInstanceOf[js.Any], packetsReceived = packetsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedMediaStats]
  }
  
  extension [Self <: ReceivedMediaStats](x: Self) {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setPacketsLost(value: Double): Self = StObject.set(x, "packetsLost", value.asInstanceOf[js.Any])
    
    inline def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
  }
}
