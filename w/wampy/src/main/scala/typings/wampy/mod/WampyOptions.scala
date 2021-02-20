package typings.wampy.mod

import typings.wampy.wampyStrings.loose
import typings.wampy.wampyStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WampyOptions extends StObject {
  
  var authid: js.UndefOr[String] = js.native
  
  var authmethods: js.UndefOr[js.Array[String]] = js.native
  
  var autoReconnect: js.UndefOr[Boolean] = js.native
  
  var helloCustomDetails: js.UndefOr[js.Any] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var onChallenge: js.UndefOr[ChallengeCallback] = js.native
  
  var onClose: js.UndefOr[Callback] = js.native
  
  var onConnect: js.UndefOr[Callback] = js.native
  
  var onError: js.UndefOr[Callback] = js.native
  
  var onReconnect: js.UndefOr[Callback] = js.native
  
  var onReconnectSuccess: js.UndefOr[Callback] = js.native
  
  var realm: js.UndefOr[String] = js.native
  
  var reconnectInterval: js.UndefOr[Double] = js.native
  
  var serializer: js.UndefOr[js.Any] = js.native
  
  var urlValidation: js.UndefOr[strict | loose] = js.native
  
  var ws: js.UndefOr[js.Any] = js.native
}
object WampyOptions {
  
  @scala.inline
  def apply(): WampyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WampyOptions]
  }
  
  @scala.inline
  implicit class WampyOptionsMutableBuilder[Self <: WampyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthid(value: String): Self = StObject.set(x, "authid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthidUndefined: Self = StObject.set(x, "authid", js.undefined)
    
    @scala.inline
    def setAuthmethods(value: js.Array[String]): Self = StObject.set(x, "authmethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthmethodsUndefined: Self = StObject.set(x, "authmethods", js.undefined)
    
    @scala.inline
    def setAuthmethodsVarargs(value: String*): Self = StObject.set(x, "authmethods", js.Array(value :_*))
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    @scala.inline
    def setHelloCustomDetails(value: js.Any): Self = StObject.set(x, "helloCustomDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelloCustomDetailsUndefined: Self = StObject.set(x, "helloCustomDetails", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setOnChallenge(value: (/* auth_method */ String, /* extra */ Dict) => String): Self = StObject.set(x, "onChallenge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChallengeUndefined: Self = StObject.set(x, "onChallenge", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnConnect(value: () => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
    
    @scala.inline
    def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnReconnect(value: () => Unit): Self = StObject.set(x, "onReconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReconnectSuccess(value: () => Unit): Self = StObject.set(x, "onReconnectSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReconnectSuccessUndefined: Self = StObject.set(x, "onReconnectSuccess", js.undefined)
    
    @scala.inline
    def setOnReconnectUndefined: Self = StObject.set(x, "onReconnect", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    @scala.inline
    def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
    
    @scala.inline
    def setSerializer(value: js.Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    
    @scala.inline
    def setUrlValidation(value: strict | loose): Self = StObject.set(x, "urlValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlValidationUndefined: Self = StObject.set(x, "urlValidation", js.undefined)
    
    @scala.inline
    def setWs(value: js.Any): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
  }
}
