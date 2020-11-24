package typings.typeorm.sapSapConnectionCredentialsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SapConnectionCredentialsOptions extends js.Object {
  
  /**
    * Ca for encrypted connection
    */
  val ca: js.UndefOr[String] = js.native
  
  /**
    * Cert for encrypted connection
    */
  val cert: js.UndefOr[String] = js.native
  
  /**
    * Database name to connect to.
    */
  val database: js.UndefOr[String] = js.native
  
  /**
    * Encrypt database connection
    */
  val encrypt: js.UndefOr[Boolean] = js.native
  
  /**
    * Database host.
    */
  val host: js.UndefOr[String] = js.native
  
  /**
    * Key for encrypted connection
    */
  val key: js.UndefOr[String] = js.native
  
  /**
    * Database password.
    */
  val password: js.UndefOr[String] = js.native
  
  /**
    * Database host port.
    */
  val port: js.UndefOr[Double] = js.native
  
  /**
    * Validate database certificate
    */
  val sslValidateCertificate: js.UndefOr[Boolean] = js.native
  
  /**
    * Database username.
    */
  val username: js.UndefOr[String] = js.native
}
object SapConnectionCredentialsOptions {
  
  @scala.inline
  def apply(): SapConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SapConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class SapConnectionCredentialsOptionsOps[Self <: SapConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setCa(value: String): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setEncrypt(value: Boolean): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSslValidateCertificate(value: Boolean): Self = this.set("sslValidateCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslValidateCertificate: Self = this.set("sslValidateCertificate", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
