package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Object describing the current ready state. See [onreadystatechange](Titanium.Network.HTTPClient.onreadystatechange) for more information.
  */
@js.native
trait ReadyStatePayload extends StObject {
  
  /**
    * The state for which `onreadystatechange` was invoked. Set to one of `Titanium.Network.HTTPClient` ready-state constants
    */
  var readyState: js.UndefOr[Double] = js.native
}
object ReadyStatePayload {
  
  @scala.inline
  def apply(): ReadyStatePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadyStatePayload]
  }
  
  @scala.inline
  implicit class ReadyStatePayloadMutableBuilder[Self <: ReadyStatePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyStateUndefined: Self = StObject.set(x, "readyState", js.undefined)
  }
}
