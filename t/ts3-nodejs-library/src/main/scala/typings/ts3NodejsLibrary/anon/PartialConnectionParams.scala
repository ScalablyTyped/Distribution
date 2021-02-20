package typings.ts3NodejsLibrary.anon

import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/TeamSpeak.TeamSpeak.ConnectionParams> */
@js.native
trait PartialConnectionParams extends StObject {
  
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var ignoreQueries: js.UndefOr[Boolean] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var keepAliveTimeout: js.UndefOr[Double] = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  var nickname: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[QueryProtocol] = js.native
  
  var queryport: js.UndefOr[Double] = js.native
  
  var readyTimeout: js.UndefOr[Double] = js.native
  
  var serverport: js.UndefOr[Double] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object PartialConnectionParams {
  
  @scala.inline
  def apply(): PartialConnectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConnectionParams]
  }
  
  @scala.inline
  implicit class PartialConnectionParamsMutableBuilder[Self <: PartialConnectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIgnoreQueries(value: Boolean): Self = StObject.set(x, "ignoreQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreQueriesUndefined: Self = StObject.set(x, "ignoreQueries", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setProtocol(value: QueryProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQueryport(value: Double): Self = StObject.set(x, "queryport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryportUndefined: Self = StObject.set(x, "queryport", js.undefined)
    
    @scala.inline
    def setReadyTimeout(value: Double): Self = StObject.set(x, "readyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyTimeoutUndefined: Self = StObject.set(x, "readyTimeout", js.undefined)
    
    @scala.inline
    def setServerport(value: Double): Self = StObject.set(x, "serverport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerportUndefined: Self = StObject.set(x, "serverport", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
