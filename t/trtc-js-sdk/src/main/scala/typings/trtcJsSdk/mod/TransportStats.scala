package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportStats extends StObject {
  
  /** SDK 到腾讯视频云的 RTT (Round-Trip Time)，单位 ms */
  var rtt: Double
}
object TransportStats {
  
  inline def apply(rtt: Double): TransportStats = {
    val __obj = js.Dynamic.literal(rtt = rtt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransportStats] (val x: Self) extends AnyVal {
    
    inline def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
  }
}
