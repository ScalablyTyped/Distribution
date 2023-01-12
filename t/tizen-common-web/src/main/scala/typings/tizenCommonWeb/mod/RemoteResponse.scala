package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteResponse extends StObject {
  
  /**
    * The options indicates the vendor specific options of COAP packet.
    */
  val options: js.Array[IotconOption] | Null
  
  /**
    * The representation indicates the information of the resource.
    */
  val representation: Representation
  
  /**
    * The result indicates the detailed information about the result of the response to request.
    */
  val result: ResponseResult
}
object RemoteResponse {
  
  inline def apply(representation: Representation, result: ResponseResult): RemoteResponse = {
    val __obj = js.Dynamic.literal(representation = representation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], options = null)
    __obj.asInstanceOf[RemoteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteResponse] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Array[IotconOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsVarargs(value: IotconOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRepresentation(value: Representation): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setResult(value: ResponseResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
