package typings.typeorm.postgresPostgresConnectionCredentialsOptionsMod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostgresConnectionCredentialsOptions extends js.Object {
  
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
  val password: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.native
  
  /**
    * Database host port.
    */
  val port: js.UndefOr[Double] = js.native
  
  /**
    * Object with ssl parameters
    */
  val ssl: js.UndefOr[Boolean | TlsOptions] = js.native
  
  /**
    * Connection url where perform connection to.
    */
  val url: js.UndefOr[String] = js.native
  
  /**
    * Database username.
    */
  val username: js.UndefOr[String] = js.native
}
object PostgresConnectionCredentialsOptions {
  
  @scala.inline
  def apply(): PostgresConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostgresConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class PostgresConnectionCredentialsOptionsOps[Self <: PostgresConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPasswordFunction0(value: () => js.Promise[String] | String): Self = this.set("password", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPassword(value: String | (js.Function0[js.Promise[String] | String])): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean | TlsOptions): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
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
