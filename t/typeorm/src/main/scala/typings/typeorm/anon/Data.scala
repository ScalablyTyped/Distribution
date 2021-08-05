package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet data details
    * (default: false).
    */
  val data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet details
    * (default: false).
    */
  val packet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet payload details
    * (default: false).
    */
  val payload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing token stream tokens
    * (default: false).
    */
  val token: js.UndefOr[Boolean] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPacket(value: Boolean): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    
    inline def setPacketUndefined: Self = StObject.set(x, "packet", js.undefined)
    
    inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setToken(value: Boolean): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
