package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContrastError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_ContrastError: typings.vimeoPlayer.vimeoPlayerStrings.ContrastError
}
object ContrastError {
  
  inline def apply(message: String, method: String): ContrastError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "ContrastError")
    __obj.asInstanceOf[ContrastError]
  }
  
  extension [Self <: ContrastError](x: Self) {
    
    inline def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.ContrastError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
