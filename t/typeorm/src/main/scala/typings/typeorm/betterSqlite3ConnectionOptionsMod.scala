package typings.typeorm

import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.`better-sqlite3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterSqlite3ConnectionOptionsMod {
  
  trait BetterSqlite3ConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Storage type or path to the storage.
      */
    val database: String
    
    /**
      * If the database does not exist, an Error will be thrown instead of creating a new file.
      * This option does not affect in-memory or readonly database connections.
      * Default: false.
      */
    val fileMustExist: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Encryption key for for SQLCipher.
      */
    val key: js.UndefOr[String] = js.undefined
    
    /**
      * Function to run before a database is used in typeorm.
      * You can set pragmas, register plugins or register
      * functions or aggregates in this function.
      */
    val prepareDatabase: js.UndefOr[js.Function1[/* db */ js.Any, Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * Open the database connection in readonly mode.
      * Default: false.
      */
    val readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Cache size of sqlite statement to speed up queries.
      * Default: 100.
      */
    val statementCacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of milliseconds to wait when executing queries
      * on a locked database, before throwing a SQLITE_BUSY error.
      * Default: 5000.
      */
    val timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_BetterSqlite3ConnectionOptions: `better-sqlite3`
    
    /**
      * Provide a function that gets called with every SQL string executed by the database connection.
      */
    val verbose: js.UndefOr[js.Function] = js.undefined
  }
  object BetterSqlite3ConnectionOptions {
    
    inline def apply(database: String): BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("better-sqlite3")
      __obj.asInstanceOf[BetterSqlite3ConnectionOptions]
    }
    
    extension [Self <: BetterSqlite3ConnectionOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setFileMustExist(value: Boolean): Self = StObject.set(x, "fileMustExist", value.asInstanceOf[js.Any])
      
      inline def setFileMustExistUndefined: Self = StObject.set(x, "fileMustExist", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPrepareDatabase(value: /* db */ js.Any => Unit | js.Promise[Unit]): Self = StObject.set(x, "prepareDatabase", js.Any.fromFunction1(value))
      
      inline def setPrepareDatabaseUndefined: Self = StObject.set(x, "prepareDatabase", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setStatementCacheSize(value: Double): Self = StObject.set(x, "statementCacheSize", value.asInstanceOf[js.Any])
      
      inline def setStatementCacheSizeUndefined: Self = StObject.set(x, "statementCacheSize", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: `better-sqlite3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: js.Function): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
