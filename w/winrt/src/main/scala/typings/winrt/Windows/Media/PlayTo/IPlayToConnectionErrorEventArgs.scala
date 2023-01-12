package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToConnectionErrorEventArgs extends StObject {
  
  var code: PlayToConnectionError
  
  var message: String
}
object IPlayToConnectionErrorEventArgs {
  
  inline def apply(code: PlayToConnectionError, message: String): IPlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionErrorEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlayToConnectionErrorEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCode(value: PlayToConnectionError): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
