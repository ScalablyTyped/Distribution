package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourcePromise extends StObject {
  
  var data: Any
  
  var errorMsg: String
  
  var status: Double
}
object IResourcePromise {
  
  inline def apply(data: Any, errorMsg: String, status: Double): IResourcePromise = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourcePromise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResourcePromise] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
