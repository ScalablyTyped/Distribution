package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteUserData` operation. */
@js.native
trait DeleteUserDataParams extends StObject {
  
  /** The customer ID for which all data is to be deleted. */
  var customer_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object DeleteUserDataParams {
  
  @scala.inline
  def apply(customer_id: String): DeleteUserDataParams = {
    val __obj = js.Dynamic.literal(customer_id = customer_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserDataParams]
  }
  
  @scala.inline
  implicit class DeleteUserDataParamsMutableBuilder[Self <: DeleteUserDataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
