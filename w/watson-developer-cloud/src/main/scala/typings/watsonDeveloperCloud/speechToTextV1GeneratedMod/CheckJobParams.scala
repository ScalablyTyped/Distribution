package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `checkJob` operation. */
trait CheckJobParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The identifier of the asynchronous job that is to be used for the request. You must make the request with credentials for the instance of the service that owns the job. */
  var id: String
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CheckJobParams {
  
  inline def apply(id: String): CheckJobParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckJobParams]
  }
  
  extension [Self <: CheckJobParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
