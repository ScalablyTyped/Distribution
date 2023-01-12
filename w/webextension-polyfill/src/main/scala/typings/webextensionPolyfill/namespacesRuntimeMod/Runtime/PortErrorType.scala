package typings.webextensionPolyfill.namespacesRuntimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If the port was disconnected due to an error, this will be set to an object with a string property message,
  * giving you more information about the error. See onDisconnect.
  */
trait PortErrorType extends StObject {
  
  var message: String
}
object PortErrorType {
  
  inline def apply(message: String): PortErrorType = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortErrorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortErrorType] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
