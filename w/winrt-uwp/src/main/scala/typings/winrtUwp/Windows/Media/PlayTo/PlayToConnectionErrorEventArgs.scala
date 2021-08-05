package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the Error event. */
trait PlayToConnectionErrorEventArgs extends StObject {
  
  /** Gets the error code for a Play To connection error. */
  var code: PlayToConnectionError
  
  /** Gets the error message for a Play To connection error. */
  var message: String
}
object PlayToConnectionErrorEventArgs {
  
  inline def apply(code: PlayToConnectionError, message: String): PlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionErrorEventArgs]
  }
  
  extension [Self <: PlayToConnectionErrorEventArgs](x: Self) {
    
    inline def setCode(value: PlayToConnectionError): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
