package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msg extends StObject {
  
  var msg: String
  
  var originalError: String | js.Error
  
  var status: Double
}
object Msg {
  
  inline def apply(msg: String, originalError: String | js.Error, status: Double): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setOriginalError(value: String | js.Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
