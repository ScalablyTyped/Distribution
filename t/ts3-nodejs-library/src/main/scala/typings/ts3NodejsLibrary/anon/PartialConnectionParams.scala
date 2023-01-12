package typings.ts3NodejsLibrary.anon

import typings.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak.QueryProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/TeamSpeak.TeamSpeak.ConnectionParams> */
trait PartialConnectionParams extends StObject {
  
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var ignoreQueries: js.UndefOr[Boolean] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveTimeout: js.UndefOr[Double] = js.undefined
  
  var localAddress: js.UndefOr[String] = js.undefined
  
  var nickname: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[QueryProtocol] = js.undefined
  
  var queryport: js.UndefOr[Double] = js.undefined
  
  var readyTimeout: js.UndefOr[Double] = js.undefined
  
  var serverport: js.UndefOr[Double] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object PartialConnectionParams {
  
  inline def apply(): PartialConnectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConnectionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialConnectionParams] (val x: Self) extends AnyVal {
    
    inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIgnoreQueries(value: Boolean): Self = StObject.set(x, "ignoreQueries", value.asInstanceOf[js.Any])
    
    inline def setIgnoreQueriesUndefined: Self = StObject.set(x, "ignoreQueries", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProtocol(value: QueryProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQueryport(value: Double): Self = StObject.set(x, "queryport", value.asInstanceOf[js.Any])
    
    inline def setQueryportUndefined: Self = StObject.set(x, "queryport", js.undefined)
    
    inline def setReadyTimeout(value: Double): Self = StObject.set(x, "readyTimeout", value.asInstanceOf[js.Any])
    
    inline def setReadyTimeoutUndefined: Self = StObject.set(x, "readyTimeout", js.undefined)
    
    inline def setServerport(value: Double): Self = StObject.set(x, "serverport", value.asInstanceOf[js.Any])
    
    inline def setServerportUndefined: Self = StObject.set(x, "serverport", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
