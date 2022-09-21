package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamError extends StObject {
  
  val constraintName: String | Null
  
  val message: String | Null
  
  val name: String
}
object MediaStreamError {
  
  inline def apply(name: String): MediaStreamError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], constraintName = null, message = null)
    __obj.asInstanceOf[MediaStreamError]
  }
  
  extension [Self <: MediaStreamError](x: Self) {
    
    inline def setConstraintName(value: String): Self = StObject.set(x, "constraintName", value.asInstanceOf[js.Any])
    
    inline def setConstraintNameNull: Self = StObject.set(x, "constraintName", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
