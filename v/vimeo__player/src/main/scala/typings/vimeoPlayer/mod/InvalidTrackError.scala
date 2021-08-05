package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidTrackError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_InvalidTrackError: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackError
}
object InvalidTrackError {
  
  inline def apply(message: String, method: String): InvalidTrackError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "InvalidTrackError")
    __obj.asInstanceOf[InvalidTrackError]
  }
  
  extension [Self <: InvalidTrackError](x: Self) {
    
    inline def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
