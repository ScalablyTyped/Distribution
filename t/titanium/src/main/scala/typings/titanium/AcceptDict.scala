package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for the [accept](Titanium.Network.Socket.TCP.accept) method.
  */
@js.native
trait AcceptDict extends StObject {
  
  /**
    * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ ErrorCallbackArgs, Unit]] = js.native
  
  /**
    * Timeout, in milliseconds, for all `write` operations.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object AcceptDict {
  
  @scala.inline
  def apply(): AcceptDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDict]
  }
  
  @scala.inline
  implicit class AcceptDictMutableBuilder[Self <: AcceptDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* param0 */ ErrorCallbackArgs => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
