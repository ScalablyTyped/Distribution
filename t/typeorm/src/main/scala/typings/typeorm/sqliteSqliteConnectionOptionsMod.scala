package typings.typeorm

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.sqlite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteSqliteConnectionOptionsMod {
  
  trait SqliteConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * In your SQLite application when you perform parallel writes its common to face SQLITE_BUSY error.
      * This error indicates that SQLite failed to write to the database file since someone else already writes into it.
      * Since SQLite cannot handle parallel saves this error cannot be avoided.
      *
      * To simplify life's of those who have this error this particular option sets a timeout within which ORM will try
      * to perform requested write operation again and again until it receives SQLITE_BUSY error.
      *
      * Enabling WAL can improve your app performance and face less SQLITE_BUSY issues.
      * Time in milliseconds.
      */
    val busyErrorRetry: js.UndefOr[Double] = js.undefined
    
    /**
      * Storage type or path to the storage.
      */
    val database: String
    
    /**
      * Enables WAL mode. By default its disabled.
      *
      * @see https://www.sqlite.org/wal.html
      */
    val enableWAL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Encryption key for for SQLCipher.
      */
    val key: js.UndefOr[String] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_SqliteConnectionOptions: sqlite
  }
  object SqliteConnectionOptions {
    
    @scala.inline
    def apply(database: String): SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sqlite")
      __obj.asInstanceOf[SqliteConnectionOptions]
    }
    
    @scala.inline
    implicit class SqliteConnectionOptionsMutableBuilder[Self <: SqliteConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusyErrorRetry(value: Double): Self = StObject.set(x, "busyErrorRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusyErrorRetryUndefined: Self = StObject.set(x, "busyErrorRetry", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWAL(value: Boolean): Self = StObject.set(x, "enableWAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWALUndefined: Self = StObject.set(x, "enableWAL", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setType(value: sqlite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
