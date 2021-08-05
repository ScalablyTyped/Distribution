package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeError
  extends StObject
     with Error {
  
  @JSName("name")
  var name_TypeError: typings.vimeoPlayer.vimeoPlayerStrings.TypeError
}
object TypeError {
  
  inline def apply(message: String, method: String): TypeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = "TypeError")
    __obj.asInstanceOf[TypeError]
  }
  
  extension [Self <: TypeError](x: Self) {
    
    inline def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.TypeError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
