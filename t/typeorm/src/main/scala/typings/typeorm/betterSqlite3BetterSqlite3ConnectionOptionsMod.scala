package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`better-sqlite3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterSqlite3BetterSqlite3ConnectionOptionsMod {
  
  @js.native
  trait BetterSqlite3ConnectionOptions
    extends BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Storage type or path to the storage.
      */
    val database: String = js.native
    
    /**
      * If the database does not exist, an Error will be thrown instead of creating a new file.
      * This option does not affect in-memory or readonly database connections.
      * Default: false.
      */
    val fileMustExist: js.UndefOr[Boolean] = js.native
    
    /**
      * Encryption key for for SQLCipher.
      */
    val key: js.UndefOr[String] = js.native
    
    /**
      * Function to run before a database is used in typeorm.
      * You can set pragmas, register plugins or register
      * functions or aggregates in this function.
      */
    val prepareDatabase: js.UndefOr[js.Function1[/* db */ js.Any, Unit | js.Promise[Unit]]] = js.native
    
    /**
      * Open the database connection in readonly mode.
      * Default: false.
      */
    val readonly: js.UndefOr[Boolean] = js.native
    
    /**
      * Cache size of sqlite statement to speed up queries.
      * Default: 100.
      */
    val statementCacheSize: js.UndefOr[Double] = js.native
    
    /**
      * The number of milliseconds to wait when executing queries
      * on a locked database, before throwing a SQLITE_BUSY error.
      * Default: 5000.
      */
    val timeout: js.UndefOr[Double] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_BetterSqlite3ConnectionOptions: `better-sqlite3` = js.native
    
    /**
      * Provide a function that gets called with every SQL string executed by the database connection.
      */
    val verbose: js.UndefOr[js.Function] = js.native
  }
  object BetterSqlite3ConnectionOptions {
    
    @scala.inline
    def apply(database: String, `type`: `better-sqlite3`): BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    implicit class BetterSqlite3ConnectionOptionsMutableBuilder[Self <: BetterSqlite3ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileMustExist(value: Boolean): Self = StObject.set(x, "fileMustExist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileMustExistUndefined: Self = StObject.set(x, "fileMustExist", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPrepareDatabase(value: /* db */ js.Any => Unit | js.Promise[Unit]): Self = StObject.set(x, "prepareDatabase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrepareDatabaseUndefined: Self = StObject.set(x, "prepareDatabase", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setStatementCacheSize(value: Double): Self = StObject.set(x, "statementCacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementCacheSizeUndefined: Self = StObject.set(x, "statementCacheSize", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: `better-sqlite3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: js.Function): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
