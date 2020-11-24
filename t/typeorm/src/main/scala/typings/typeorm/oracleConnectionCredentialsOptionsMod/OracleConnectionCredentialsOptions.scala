package typings.typeorm.oracleConnectionCredentialsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OracleConnectionCredentialsOptions extends js.Object {
  
  /**
    * Embedded TNS Connection String
    */
  val connectString: js.UndefOr[String] = js.native
  
  /**
    * Database name to connect to.
    */
  val database: js.UndefOr[String] = js.native
  
  /**
    * Database host.
    */
  val host: js.UndefOr[String] = js.native
  
  /**
    * Database password.
    */
  val password: js.UndefOr[String] = js.native
  
  /**
    * Database host port.
    */
  val port: js.UndefOr[Double] = js.native
  
  /**
    * Connection SID.
    */
  val sid: js.UndefOr[String] = js.native
  
  /**
    * Connection url where perform connection to.
    */
  val url: js.UndefOr[String] = js.native
  
  /**
    * Database username.
    */
  val username: js.UndefOr[String] = js.native
}
object OracleConnectionCredentialsOptions {
  
  @scala.inline
  def apply(): OracleConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OracleConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class OracleConnectionCredentialsOptionsOps[Self <: OracleConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setConnectString(value: String): Self = this.set("connectString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectString: Self = this.set("connectString", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSid: Self = this.set("sid", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
