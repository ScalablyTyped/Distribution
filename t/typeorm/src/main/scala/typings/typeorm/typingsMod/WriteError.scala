package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteError extends StObject {
  
  /**
    * Write concern error code.
    */
  var code: scala.Double
  
  /**
    * Write concern error message.
    */
  var errmsg: String
  
  /**
    * Write concern error original bulk operation index.
    */
  var index: scala.Double
}
object WriteError {
  
  inline def apply(code: scala.Double, errmsg: String, index: scala.Double): WriteError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteError]
  }
  
  extension [Self <: WriteError](x: Self) {
    
    inline def setCode(value: scala.Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
