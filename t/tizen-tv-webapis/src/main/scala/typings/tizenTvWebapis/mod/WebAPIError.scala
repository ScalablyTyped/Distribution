package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAPIError extends StObject {
  
  /**
    * @since 2.3
    */
  val code: Double
  
  /**
    * @since 2.3
    */
  val message: String
  
  /**
    * @since 2.3
    */
  val name: String
}
object WebAPIError {
  
  inline def apply(code: Double, message: String, name: String): WebAPIError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAPIError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebAPIError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
