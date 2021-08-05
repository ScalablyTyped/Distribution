package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_RangeError: typings.vimeoPlayer.vimeoPlayerStrings.RangeError
}
object RangeError {
  
  inline def apply(message: String, method: String): RangeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "RangeError")
    __obj.asInstanceOf[RangeError]
  }
  
  extension [Self <: RangeError](x: Self) {
    
    inline def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.RangeError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
