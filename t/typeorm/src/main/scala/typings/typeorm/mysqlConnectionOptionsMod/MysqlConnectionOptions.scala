package typings.typeorm.mysqlConnectionOptionsMod

import typings.typeorm.anon.CanRetry
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.mysqlConnectionCredentialsOptionsMod.MysqlConnectionCredentialsOptions
import typings.typeorm.typeormStrings.mariadb
import typings.typeorm.typeormStrings.mysql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MysqlConnectionOptions
  extends BaseConnectionOptions
     with MysqlConnectionCredentialsOptions
     with ConnectionOptions {
  
  /**
    * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10000)
    * This difference between connectTimeout and acquireTimeout is subtle and is described in the mysqljs/mysql docs
    * https://github.com/mysqljs/mysql/tree/master#pool-options
    */
  val acquireTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be always
    * returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving bigNumberStrings
    * disabled will return big numbers as String objects only when they cannot be accurately represented with
    * [JavaScript Number objects](http://ecma262-5.com/ELS5_HTML.htm#Section_8.5) (which happens when they exceed the [-2^53, +2^53] range),
    * otherwise they will be returned as Number objects. This option is ignored if supportBigNumbers is disabled.
    */
  val bigNumberStrings: js.UndefOr[Boolean] = js.native
  
  /**
    * The charset for the connection. This is called "collation" in the SQL-level of MySQL (like utf8_general_ci).
    * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
    * Default: 'UTF8_GENERAL_CI'
    */
  val charset: js.UndefOr[String] = js.native
  
  /**
    * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10000)
    */
  val connectTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript Date objects.
    * Can be true/false or an array of type names to keep as strings.
    */
  val dateStrings: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Prints protocol details to stdout. Can be true/false or an array of packet type names that should be printed.
    * (Default: false)
    */
  val debug: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * List of connection flags to use other than the default ones. It is also possible to blacklist default ones.
    * For more information, check https://github.com/mysqljs/mysql#connection-flags.
    */
  val flags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
    */
  val insecureAuth: js.UndefOr[Boolean] = js.native
  
  /**
    * Use spatial functions like GeomFromText and AsText which are removed in MySQL 8.
    * (Default: true)
    */
  val legacySpatialSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow multiple mysql statements per query. Be careful with this, it could increase the scope of SQL injection attacks.
    * (Default: false)
    */
  val multipleStatements: js.UndefOr[Boolean] = js.native
  
  /**
    * Replication setup.
    */
  val replication: js.UndefOr[CanRetry] = js.native
  
  /**
    * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option (Default: false)
    */
  val supportBigNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * The timezone configured on the MySQL server.
    * This is used to type cast server date/time values to JavaScript Date object and vice versa.
    * This can be 'local', 'Z', or an offset in the form +HH:MM or -HH:MM. (Default: 'local')
    */
  val timezone: js.UndefOr[String] = js.native
  
  /**
    * Generates stack traces on Error to include call site of library entrance ("long stack traces").
    * Slight performance penalty for most calls. (Default: true)
    */
  val trace: js.UndefOr[Boolean] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_MysqlConnectionOptions: mysql | mariadb = js.native
}
object MysqlConnectionOptions {
  
  @scala.inline
  def apply(`type`: mysql | mariadb): MysqlConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MysqlConnectionOptions]
  }
  
  @scala.inline
  implicit class MysqlConnectionOptionsOps[Self <: MysqlConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: mysql | mariadb): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquireTimeout(value: Double): Self = this.set("acquireTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquireTimeout: Self = this.set("acquireTimeout", js.undefined)
    
    @scala.inline
    def setBigNumberStrings(value: Boolean): Self = this.set("bigNumberStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigNumberStrings: Self = this.set("bigNumberStrings", js.undefined)
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setDateStringsVarargs(value: String*): Self = this.set("dateStrings", js.Array(value :_*))
    
    @scala.inline
    def setDateStrings(value: Boolean | js.Array[String]): Self = this.set("dateStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStrings: Self = this.set("dateStrings", js.undefined)
    
    @scala.inline
    def setDebugVarargs(value: String*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: Boolean | js.Array[String]): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setInsecureAuth(value: Boolean): Self = this.set("insecureAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureAuth: Self = this.set("insecureAuth", js.undefined)
    
    @scala.inline
    def setLegacySpatialSupport(value: Boolean): Self = this.set("legacySpatialSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacySpatialSupport: Self = this.set("legacySpatialSupport", js.undefined)
    
    @scala.inline
    def setMultipleStatements(value: Boolean): Self = this.set("multipleStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleStatements: Self = this.set("multipleStatements", js.undefined)
    
    @scala.inline
    def setReplication(value: CanRetry): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setSupportBigNumbers(value: Boolean): Self = this.set("supportBigNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportBigNumbers: Self = this.set("supportBigNumbers", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTrace(value: Boolean): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
}
