package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToConnectionErrorEventArgs extends StObject {
  
  var code: PlayToConnectionError = js.native
  
  var message: String = js.native
}
object IPlayToConnectionErrorEventArgs {
  
  @scala.inline
  def apply(code: PlayToConnectionError, message: String): IPlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnectionErrorEventArgs]
  }
  
  @scala.inline
  implicit class IPlayToConnectionErrorEventArgsMutableBuilder[Self <: IPlayToConnectionErrorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: PlayToConnectionError): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
