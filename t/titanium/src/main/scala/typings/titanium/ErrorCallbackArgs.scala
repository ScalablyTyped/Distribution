package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object passed to the error callback when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  */
@js.native
trait ErrorCallbackArgs extends FailureResponse {
  
  /**
    * Socket that experienced the error.
    */
  var socket: js.UndefOr[TCP] = js.native
}
object ErrorCallbackArgs {
  
  @scala.inline
  def apply(): ErrorCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorCallbackArgs]
  }
  
  @scala.inline
  implicit class ErrorCallbackArgsMutableBuilder[Self <: ErrorCallbackArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: TCP): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
  }
}
