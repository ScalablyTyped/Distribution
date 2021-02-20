package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `unregisterCallback` operation. */
@js.native
trait UnregisterCallbackParams extends StObject {
  
  /** The callback URL that is to be unregistered. */
  var callback_url: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object UnregisterCallbackParams {
  
  @scala.inline
  def apply(callback_url: String): UnregisterCallbackParams = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisterCallbackParams]
  }
  
  @scala.inline
  implicit class UnregisterCallbackParamsMutableBuilder[Self <: UnregisterCallbackParams] (val x: Self) extends AnyVal {
    
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
  }
}
