package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentMediaStats extends StObject {
  
  /** 已发送字节数 */
  var bytesSent: Double
  
  /** 已发送包数 */
  var packetsSent: Double
}
object SentMediaStats {
  
  @scala.inline
  def apply(bytesSent: Double, packetsSent: Double): SentMediaStats = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], packetsSent = packetsSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMediaStats]
  }
  
  @scala.inline
  implicit class SentMediaStatsMutableBuilder[Self <: SentMediaStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
  }
}
