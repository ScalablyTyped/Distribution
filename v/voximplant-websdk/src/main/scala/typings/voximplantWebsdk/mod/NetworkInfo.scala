package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Network information
  */
trait NetworkInfo extends StObject {
  
  /**
    *    Packet loss percentage
    */
  var packetLoss: Double
}
object NetworkInfo {
  
  inline def apply(packetLoss: Double): NetworkInfo = {
    val __obj = js.Dynamic.literal(packetLoss = packetLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  
  extension [Self <: NetworkInfo](x: Self) {
    
    inline def setPacketLoss(value: Double): Self = StObject.set(x, "packetLoss", value.asInstanceOf[js.Any])
  }
}
