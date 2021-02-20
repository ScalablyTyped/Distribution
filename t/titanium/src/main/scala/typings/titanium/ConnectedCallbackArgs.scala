package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument object passed to the [connected](Titanium.Network.Socket.TCP.connected) callback when the socket connects.
  */
@js.native
trait ConnectedCallbackArgs extends StObject {
  
  /**
    * Socket instance that has been connected.
    */
  var socket: js.UndefOr[TCP] = js.native
}
object ConnectedCallbackArgs {
  
  @scala.inline
  def apply(): ConnectedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedCallbackArgs]
  }
  
  @scala.inline
  implicit class ConnectedCallbackArgsMutableBuilder[Self <: ConnectedCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: TCP): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
  }
}
