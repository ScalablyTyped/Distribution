package typings.wampy.mod

import typings.wampy.wampyStrings.loose
import typings.wampy.wampyStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WampyOptions extends StObject {
  
  var authid: js.UndefOr[String] = js.undefined
  
  var authmethods: js.UndefOr[js.Array[String]] = js.undefined
  
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  
  var helloCustomDetails: js.UndefOr[Any] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var onChallenge: js.UndefOr[ChallengeCallback] = js.undefined
  
  var onClose: js.UndefOr[Callback] = js.undefined
  
  var onConnect: js.UndefOr[Callback] = js.undefined
  
  var onError: js.UndefOr[Callback] = js.undefined
  
  var onReconnect: js.UndefOr[Callback] = js.undefined
  
  var onReconnectSuccess: js.UndefOr[Callback] = js.undefined
  
  var realm: js.UndefOr[String] = js.undefined
  
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  
  var serializer: js.UndefOr[Any] = js.undefined
  
  var uriValidation: js.UndefOr[strict | loose] = js.undefined
  
  var ws: js.UndefOr[Any] = js.undefined
}
object WampyOptions {
  
  inline def apply(): WampyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WampyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WampyOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthid(value: String): Self = StObject.set(x, "authid", value.asInstanceOf[js.Any])
    
    inline def setAuthidUndefined: Self = StObject.set(x, "authid", js.undefined)
    
    inline def setAuthmethods(value: js.Array[String]): Self = StObject.set(x, "authmethods", value.asInstanceOf[js.Any])
    
    inline def setAuthmethodsUndefined: Self = StObject.set(x, "authmethods", js.undefined)
    
    inline def setAuthmethodsVarargs(value: String*): Self = StObject.set(x, "authmethods", js.Array(value*))
    
    inline def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    inline def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    inline def setHelloCustomDetails(value: Any): Self = StObject.set(x, "helloCustomDetails", value.asInstanceOf[js.Any])
    
    inline def setHelloCustomDetailsUndefined: Self = StObject.set(x, "helloCustomDetails", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setOnChallenge(value: (/* auth_method */ String, /* extra */ Dict) => String): Self = StObject.set(x, "onChallenge", js.Any.fromFunction2(value))
    
    inline def setOnChallengeUndefined: Self = StObject.set(x, "onChallenge", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnConnect(value: () => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction0(value))
    
    inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
    
    inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnReconnect(value: () => Unit): Self = StObject.set(x, "onReconnect", js.Any.fromFunction0(value))
    
    inline def setOnReconnectSuccess(value: () => Unit): Self = StObject.set(x, "onReconnectSuccess", js.Any.fromFunction0(value))
    
    inline def setOnReconnectSuccessUndefined: Self = StObject.set(x, "onReconnectSuccess", js.undefined)
    
    inline def setOnReconnectUndefined: Self = StObject.set(x, "onReconnect", js.undefined)
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
    
    inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    
    inline def setUriValidation(value: strict | loose): Self = StObject.set(x, "uriValidation", value.asInstanceOf[js.Any])
    
    inline def setUriValidationUndefined: Self = StObject.set(x, "uriValidation", js.undefined)
    
    inline def setWs(value: Any): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    
    inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
  }
}
