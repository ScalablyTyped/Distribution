package typings.ts3NodejsLibrary.anon

import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/TeamSpeak.TeamSpeak.ConnectionParams> */
@js.native
trait PartialConnectionParams extends js.Object {
  
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
  implicit class PartialConnectionParamsOps[Self <: PartialConnectionParams] (val x: Self) extends AnyVal {
    
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
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIgnoreQueries(value: Boolean): Self = this.set("ignoreQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreQueries: Self = this.set("ignoreQueries", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveTimeout(value: Double): Self = this.set("keepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveTimeout: Self = this.set("keepAliveTimeout", js.undefined)
    
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
    def setProtocol(value: QueryProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setQueryport(value: Double): Self = this.set("queryport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryport: Self = this.set("queryport", js.undefined)
    
    @scala.inline
    def setReadyTimeout(value: Double): Self = this.set("readyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyTimeout: Self = this.set("readyTimeout", js.undefined)
    
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
