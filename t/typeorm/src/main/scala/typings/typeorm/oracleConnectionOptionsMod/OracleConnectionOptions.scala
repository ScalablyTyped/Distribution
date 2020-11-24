package typings.typeorm.oracleConnectionOptionsMod

import typings.typeorm.anon.Slaves
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.oracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import typings.typeorm.typeormStrings.oracle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OracleConnectionOptions
  extends BaseConnectionOptions
     with OracleConnectionCredentialsOptions
     with ConnectionOptions {
  
  /**
    * Replication setup.
    */
  val replication: js.UndefOr[Slaves] = js.native
  
  /**
    * Schema name. By default is "public".
    */
  val schema: js.UndefOr[String] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_OracleConnectionOptions: oracle = js.native
}
object OracleConnectionOptions {
  
  @scala.inline
  def apply(`type`: oracle): OracleConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OracleConnectionOptions]
  }
  
  @scala.inline
  implicit class OracleConnectionOptionsOps[Self <: OracleConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: oracle): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplication(value: Slaves): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
