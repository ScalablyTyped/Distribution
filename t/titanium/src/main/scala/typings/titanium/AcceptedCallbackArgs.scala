package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument object passed to the [accepted](Titanium.Network.Socket.TCP.accepted)
  * callback when a listener accepts a connection.
  */
@js.native
trait AcceptedCallbackArgs extends StObject {
  
  /**
    * Socket which represents the inbound connection.
    */
  var inbound: js.UndefOr[TCP] = js.native
  
  /**
    * Socket which received the connection.
    */
  var socket: js.UndefOr[TCP] = js.native
}
object AcceptedCallbackArgs {
  
  @scala.inline
  def apply(): AcceptedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptedCallbackArgs]
  }
  
  @scala.inline
  implicit class AcceptedCallbackArgsMutableBuilder[Self <: AcceptedCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInbound(value: TCP): Self = StObject.set(x, "inbound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundUndefined: Self = StObject.set(x, "inbound", js.undefined)
    
    @scala.inline
    def setSocket(value: TCP): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
  }
}
