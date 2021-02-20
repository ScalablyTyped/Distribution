package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `registerCallback` operation. */
@js.native
trait RegisterCallbackParams extends StObject {
  
  /** An HTTP or HTTPS URL to which callback notifications are to be sent. To be white-listed, the URL must successfully echo the challenge string during URL verification. During verification, the client can also check the signature that the service sends in the `X-Callback-Signature` header to verify the origin of the request. */
  var callback_url: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** A user-specified string that the service uses to generate the HMAC-SHA1 signature that it sends via the `X-Callback-Signature` header. The service includes the header during URL verification and with every notification sent to the callback URL. It calculates the signature over the payload of the notification. If you omit the parameter, the service does not send the header. */
  var user_secret: js.UndefOr[String] = js.native
}
object RegisterCallbackParams {
  
  @scala.inline
  def apply(callback_url: String): RegisterCallbackParams = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCallbackParams]
  }
  
  @scala.inline
  implicit class RegisterCallbackParamsMutableBuilder[Self <: RegisterCallbackParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setUser_secret(value: String): Self = StObject.set(x, "user_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_secretUndefined: Self = StObject.set(x, "user_secret", js.undefined)
  }
}
