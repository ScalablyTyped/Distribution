package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRightsErrorSuccessResponse extends StObject {
  
  /**
    * `errorCode` contains the error code if the method fails. The method will return errorCode only if it fails.
    */
  var errorCode: js.UndefOr[Double] = js.undefined
  
  /**
    * `errorText` contains the error text if the method fails. The method will return errorText only if it fails.
    */
  var errorText: js.UndefOr[String] = js.undefined
  
  /**
    *  Flag that indicates success/failure of the request.
    * - true: Success
    * - false: Failure
    */
  var returnValue: Boolean
  
  /**
    * Flag that indicates whether the subscription is enabled or not.
    * - true: Enabled
    * - false: Not enabled
    */
  var subscribed: Boolean
}
object GetRightsErrorSuccessResponse {
  
  inline def apply(returnValue: Boolean, subscribed: Boolean): GetRightsErrorSuccessResponse = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRightsErrorSuccessResponse]
  }
  
  extension [Self <: GetRightsErrorSuccessResponse](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
  }
}
