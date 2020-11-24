package typings.typeorm.typingsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  /**
    * Ensure we check server identify during SSL, set to false to disable checking. Only works for Node 0.12.x or higher. You can pass in a boolean or your own checkServerIdentity override function.
    */
  var checkServerIdentity: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Number of connections in the connection pool for each server instance, set to 5 as default for legacy reasons.
    */
  var poolSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * Server will wait # milliseconds between retries.
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.native
  
  /**
    * Server attempt to reconnect #times.
    */
  var reconnectTries: js.UndefOr[scala.Double] = js.native
  
  /**
    * Socket options.
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.native
  
  /**
    * Use ssl connection (needs to have a mongod server with ssl support).
    */
  var ssl: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of valid certificates either as Buffers or Strings (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslCA: js.UndefOr[js.Array[Buffer | String]] = js.native
  
  /**
    * String or buffer containing the certificate we wish to present (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslCert: js.UndefOr[Buffer | String] = js.native
  
  /**
    * String or buffer containing the certificate private key we wish to present (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslKey: js.UndefOr[Buffer | String] = js.native
  
  /**
    * String or buffer containing the certificate password (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslPass: js.UndefOr[Buffer | String] = js.native
  
  /**
    * Validate mongod server certificate against ca (needs to have a mongod server with ssl support, 2.4 or higher).
    */
  var sslValidate: js.UndefOr[js.Object] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckServerIdentity(value: Boolean | js.Function): Self = this.set("checkServerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    
    @scala.inline
    def setPoolSize(value: scala.Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setReconnectInterval(value: scala.Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    
    @scala.inline
    def setReconnectTries(value: scala.Double): Self = this.set("reconnectTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTries: Self = this.set("reconnectTries", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSslCAVarargs(value: (Buffer | String)*): Self = this.set("sslCA", js.Array(value :_*))
    
    @scala.inline
    def setSslCA(value: js.Array[Buffer | String]): Self = this.set("sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCA: Self = this.set("sslCA", js.undefined)
    
    @scala.inline
    def setSslCert(value: Buffer | String): Self = this.set("sslCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCert: Self = this.set("sslCert", js.undefined)
    
    @scala.inline
    def setSslKey(value: Buffer | String): Self = this.set("sslKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslKey: Self = this.set("sslKey", js.undefined)
    
    @scala.inline
    def setSslPass(value: Buffer | String): Self = this.set("sslPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPass: Self = this.set("sslPass", js.undefined)
    
    @scala.inline
    def setSslValidate(value: js.Object): Self = this.set("sslValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslValidate: Self = this.set("sslValidate", js.undefined)
  }
}
