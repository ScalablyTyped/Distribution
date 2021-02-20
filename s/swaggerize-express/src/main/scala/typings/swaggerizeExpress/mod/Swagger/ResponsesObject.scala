package typings.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsesObject
  extends /* index */ StringDictionary[Response | js.Any] {
  
  var default: Response = js.native
}
object ResponsesObject {
  
  @scala.inline
  def apply(default: Response): ResponsesObject = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsesObject]
  }
  
  @scala.inline
  implicit class ResponsesObjectMutableBuilder[Self <: ResponsesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Response): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
