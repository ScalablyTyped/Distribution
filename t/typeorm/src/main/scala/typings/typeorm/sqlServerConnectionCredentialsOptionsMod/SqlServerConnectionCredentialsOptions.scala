package typings.typeorm.sqlServerConnectionCredentialsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlServerConnectionCredentialsOptions extends js.Object {
  
  /**
    * Database name to connect to.
    */
  val database: js.UndefOr[String] = js.native
  
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  val domain: js.UndefOr[String] = js.native
  
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
    * Connection url where perform connection to.
    */
  val url: js.UndefOr[String] = js.native
  
  /**
    * Database username.
    */
  val username: js.UndefOr[String] = js.native
}
object SqlServerConnectionCredentialsOptions {
  
  @scala.inline
  def apply(): SqlServerConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlServerConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class SqlServerConnectionCredentialsOptionsOps[Self <: SqlServerConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
