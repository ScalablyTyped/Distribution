package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOptions extends StObject {
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet data details (default: false).
    */
  var data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet details (default: false).
    */
  var packet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet payload details (default: false).
    */
  var payload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean, controlling whether debug events will be emitted with text describing token stream tokens (default: false).
    */
  var token: js.UndefOr[Boolean] = js.undefined
}
object DebugOptions {
  
  @scala.inline
  def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  
  @scala.inline
  implicit class DebugOptionsMutableBuilder[Self <: DebugOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setPacket(value: Boolean): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketUndefined: Self = StObject.set(x, "packet", js.undefined)
    
    @scala.inline
    def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setToken(value: Boolean): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
