package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeError extends StObject {
  
  /**
    * Indicates whether the client execute the following retry logic:
    * (1) show the message provided by the ResponseError to the user
    * (2) user selects retry or cancel
    * (3) if user selected retry the initialize method is sent again.
    */
  var retry: Boolean
}
object InitializeError {
  
  inline def apply(retry: Boolean): InitializeError = {
    val __obj = js.Dynamic.literal(retry = retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializeError] (val x: Self) extends AnyVal {
    
    inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
  }
}
