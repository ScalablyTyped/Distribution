package typings.typeorm.sqlServerConnectionOptionsMod

import typings.typeorm.anon.AbortTransactionOnError
import typings.typeorm.anon.AcquireTimeoutMillis
import typings.typeorm.anon.MasterSqlServerConnectionCredentialsOptions
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.sqlServerConnectionCredentialsOptionsMod.SqlServerConnectionCredentialsOptions
import typings.typeorm.typeormStrings.mssql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlServerConnectionOptions
  extends BaseConnectionOptions
     with SqlServerConnectionCredentialsOptions
     with ConnectionOptions {
  
  /**
    * Connection timeout in ms (default: 15000).
    */
  val connectionTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Extra options
    */
  val options: js.UndefOr[AbortTransactionOnError] = js.native
  
  /**
    * An optional object/dictionary with the any of the properties
    */
  val pool: js.UndefOr[AcquireTimeoutMillis] = js.native
  
  /**
    * Replication setup.
    */
  val replication: js.UndefOr[MasterSqlServerConnectionCredentialsOptions] = js.native
  
  /**
    * Request timeout in ms (default: 15000). NOTE: msnodesqlv8 driver doesn't support timeouts < 1 second.
    */
  val requestTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Database schema.
    */
  val schema: js.UndefOr[String] = js.native
  
  /**
    * Stream recordsets/rows instead of returning them all at once as an argument of callback (default: false).
    * You can also enable streaming for each request independently (request.stream = true).
    * Always set to true if you plan to work with large amount of rows.
    */
  val stream: js.UndefOr[Boolean] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_SqlServerConnectionOptions: mssql = js.native
}
object SqlServerConnectionOptions {
  
  @scala.inline
  def apply(`type`: mssql): SqlServerConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlServerConnectionOptions]
  }
  
  @scala.inline
  implicit class SqlServerConnectionOptionsOps[Self <: SqlServerConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: mssql): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setOptions(value: AbortTransactionOnError): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPool(value: AcquireTimeoutMillis): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setReplication(value: MasterSqlServerConnectionCredentialsOptions): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
