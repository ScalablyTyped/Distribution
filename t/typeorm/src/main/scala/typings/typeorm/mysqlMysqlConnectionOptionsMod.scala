package typings.typeorm

import typings.typeorm.anon.RemoveNodeErrorCount
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.mysqlMysqlConnectionCredentialsOptionsMod.MysqlConnectionCredentialsOptions
import typings.typeorm.typeormStrings.mariadb
import typings.typeorm.typeormStrings.mysql
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mysqlMysqlConnectionOptionsMod {
  
  trait MysqlConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with MysqlConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10000)
      * This difference between connectTimeout and acquireTimeout is subtle and is described in the mysqljs/mysql docs
      * https://github.com/mysqljs/mysql/tree/master#pool-options
      */
    val acquireTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Enabling both supportBigNumbers and bigNumberStrings forces big numbers (BIGINT and DECIMAL columns) to be always
      * returned as JavaScript String objects (Default: false). Enabling supportBigNumbers but leaving bigNumberStrings
      * disabled will return big numbers as String objects only when they cannot be accurately represented with
      * [JavaScript Number objects](http://ecma262-5.com/ELS5_HTML.htm#Section_8.5) (which happens when they exceed the [-2^53, +2^53] range),
      * otherwise they will be returned as Number objects. This option is ignored if supportBigNumbers is disabled.
      */
    val bigNumberStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The charset for the connection. This is called "collation" in the SQL-level of MySQL (like utf8_general_ci).
      * If a SQL-level charset is specified (like utf8mb4) then the default collation for that charset is used.
      * Default: 'UTF8_GENERAL_CI'
      */
    val charset: js.UndefOr[String] = js.undefined
    
    /**
      * The milliseconds before a timeout occurs during the initial connection to the MySQL server. (Default: 10000)
      */
    val connectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Force date types (TIMESTAMP, DATETIME, DATE) to be returned as strings rather then inflated into JavaScript Date objects.
      * Can be true/false or an array of type names to keep as strings.
      */
    val dateStrings: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Prints protocol details to stdout. Can be true/false or an array of packet type names that should be printed.
      * (Default: false)
      */
    val debug: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * List of connection flags to use other than the default ones. It is also possible to blacklist default ones.
      * For more information, check https://github.com/mysqljs/mysql#connection-flags.
      */
    val flags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Allow connecting to MySQL instances that ask for the old (insecure) authentication method. (Default: false)
      */
    val insecureAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use spatial functions like GeomFromText and AsText which are removed in MySQL 8.
      * (Default: true)
      */
    val legacySpatialSupport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow multiple mysql statements per query. Be careful with this, it could increase the scope of SQL injection attacks.
      * (Default: false)
      */
    val multipleStatements: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[RemoveNodeErrorCount] = js.undefined
    
    /**
      * When dealing with big numbers (BIGINT and DECIMAL columns) in the database, you should enable this option (Default: false)
      */
    val supportBigNumbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The timezone configured on the MySQL server.
      * This is used to type cast server date/time values to JavaScript Date object and vice versa.
      * This can be 'local', 'Z', or an offset in the form +HH:MM or -HH:MM. (Default: 'local')
      */
    val timezone: js.UndefOr[String] = js.undefined
    
    /**
      * Generates stack traces on Error to include call site of library entrance ("long stack traces").
      * Slight performance penalty for most calls. (Default: true)
      */
    val trace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_MysqlConnectionOptions: mysql | mariadb
  }
  object MysqlConnectionOptions {
    
    @scala.inline
    def apply(`type`: mysql | mariadb): MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MysqlConnectionOptions]
    }
    
    @scala.inline
    implicit class MysqlConnectionOptionsMutableBuilder[Self <: MysqlConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcquireTimeout(value: Double): Self = StObject.set(x, "acquireTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcquireTimeoutUndefined: Self = StObject.set(x, "acquireTimeout", js.undefined)
      
      @scala.inline
      def setBigNumberStrings(value: Boolean): Self = StObject.set(x, "bigNumberStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigNumberStringsUndefined: Self = StObject.set(x, "bigNumberStrings", js.undefined)
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setDateStrings(value: Boolean | js.Array[String]): Self = StObject.set(x, "dateStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateStringsUndefined: Self = StObject.set(x, "dateStrings", js.undefined)
      
      @scala.inline
      def setDateStringsVarargs(value: String*): Self = StObject.set(x, "dateStrings", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean | js.Array[String]): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDebugVarargs(value: String*): Self = StObject.set(x, "debug", js.Array(value :_*))
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setInsecureAuth(value: Boolean): Self = StObject.set(x, "insecureAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureAuthUndefined: Self = StObject.set(x, "insecureAuth", js.undefined)
      
      @scala.inline
      def setLegacySpatialSupport(value: Boolean): Self = StObject.set(x, "legacySpatialSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacySpatialSupportUndefined: Self = StObject.set(x, "legacySpatialSupport", js.undefined)
      
      @scala.inline
      def setMultipleStatements(value: Boolean): Self = StObject.set(x, "multipleStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleStatementsUndefined: Self = StObject.set(x, "multipleStatements", js.undefined)
      
      @scala.inline
      def setReplication(value: RemoveNodeErrorCount): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      @scala.inline
      def setSupportBigNumbers(value: Boolean): Self = StObject.set(x, "supportBigNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportBigNumbersUndefined: Self = StObject.set(x, "supportBigNumbers", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
      
      @scala.inline
      def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      @scala.inline
      def setType(value: mysql | mariadb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
