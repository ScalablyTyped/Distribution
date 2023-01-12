package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsesObject
  extends StObject
     with /* index */ StringDictionary[Response | Any] {
  
  var default: Response
}
object ResponsesObject {
  
  inline def apply(default: Response): ResponsesObject = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsesObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsesObject] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Response): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
