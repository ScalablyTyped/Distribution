package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the result, in the form of a response message, from the PlayReady-ND messenger. */
trait INDSendResult extends StObject {
  
  /** Gets the response message from a messenger. */
  var response: Double
}
object INDSendResult {
  
  @scala.inline
  def apply(response: Double): INDSendResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDSendResult]
  }
  
  @scala.inline
  implicit class INDSendResultMutableBuilder[Self <: INDSendResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
