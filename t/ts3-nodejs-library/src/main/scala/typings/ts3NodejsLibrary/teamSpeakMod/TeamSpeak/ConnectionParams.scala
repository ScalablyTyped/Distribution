package typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionParams extends js.Object {
  
  /** wether it should automatically connect after instanciating (default: true) */
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  /** the host to connect to (default: 127.0.0.1) */
  var host: String = js.native
  
  /** wether query clients should be ignored allover (clientList, events, etc) */
  var ignoreQueries: Boolean = js.native
  
  /** wether a keepalive should get sent (default: true) */
  var keepAlive: Boolean = js.native
  
  /** sends the keepalive after x seconds of inactivity (default: 250s) */
  var keepAliveTimeout: Double = js.native
  
  /** local address the socket should connect from */
  var localAddress: js.UndefOr[String] = js.native
  
  /** the nickname to connect with */
  var nickname: js.UndefOr[String] = js.native
  
  /** the password to use with the login (default: none) */
  var password: js.UndefOr[String] = js.native
  
  /** the query protocol to use (default: @see QueryProtocol ) */
  var protocol: QueryProtocol = js.native
  
  /** the queryport to use (default: raw=10011 ssh=10022) */
  var queryport: Double = js.native
  
  /** time to wait until a timeout gets fired (default: 10000) */
  var readyTimeout: Double = js.native
  
  /** the server to select upon connect (default: none) */
  var serverport: js.UndefOr[Double] = js.native
  
  /** the username to login with (default: none) */
  var username: js.UndefOr[String] = js.native
}
object ConnectionParams {
  
  @scala.inline
  def apply(
    host: String,
    ignoreQueries: Boolean,
    keepAlive: Boolean,
    keepAliveTimeout: Double,
    protocol: QueryProtocol,
    queryport: Double,
    readyTimeout: Double
  ): ConnectionParams = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], ignoreQueries = ignoreQueries.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], keepAliveTimeout = keepAliveTimeout.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], queryport = queryport.asInstanceOf[js.Any], readyTimeout = readyTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionParams]
  }
  
  @scala.inline
  implicit class ConnectionParamsOps[Self <: ConnectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreQueries(value: Boolean): Self = this.set("ignoreQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveTimeout(value: Double): Self = this.set("keepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: QueryProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryport(value: Double): Self = this.set("queryport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyTimeout(value: Double): Self = this.set("readyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setServerport(value: Double): Self = this.set("serverport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerport: Self = this.set("serverport", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
