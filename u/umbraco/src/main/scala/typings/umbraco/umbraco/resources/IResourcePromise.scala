package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourcePromise extends StObject {
  
  var data: js.Any
  
  var errorMsg: String
  
  var status: Double
}
object IResourcePromise {
  
  @scala.inline
  def apply(data: js.Any, errorMsg: String, status: Double): IResourcePromise = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourcePromise]
  }
  
  @scala.inline
  implicit class IResourcePromiseMutableBuilder[Self <: IResourcePromise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
