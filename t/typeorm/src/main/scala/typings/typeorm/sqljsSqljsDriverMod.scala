package typings.typeorm

import typings.std.Uint8Array
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import typings.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqljsSqljsDriverMod {
  
  @JSImport("typeorm/driver/sqljs/SqljsDriver", "SqljsDriver")
  @js.native
  class SqljsDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    /**
      * This gets called by the QueryRunner when a change to the database is made.
      * If a custom autoSaveCallback is specified, it get's called with the database as Uint8Array,
      * otherwise the save method is called which saves it to file (Node.js), local storage (browser)
      * or indexedDB (browser with enabled useLocalForage option).
      */
    def autoSave(): js.Promise[Unit] = js.native
    
    /**
      * Creates connection with an optional database.
      * If database is specified it is loaded, otherwise a new empty database is created.
      */
    /* protected */ def createDatabaseConnectionWithImport(): js.Promise[_] = js.native
    /* protected */ def createDatabaseConnectionWithImport(database: Uint8Array): js.Promise[_] = js.native
    
    /**
      * Returns the current database as Uint8Array.
      */
    def export(): Uint8Array = js.native
    
    /**
      * Loads a database from a given file (Node.js), local storage key (browser) or array.
      * This will delete the current database!
      */
    def load(fileNameOrLocalStorageOrData: String): js.Promise[_] = js.native
    def load(fileNameOrLocalStorageOrData: String, checkIfFileOrLocalStorageExists: Boolean): js.Promise[_] = js.native
    def load(fileNameOrLocalStorageOrData: Uint8Array): js.Promise[_] = js.native
    def load(fileNameOrLocalStorageOrData: Uint8Array, checkIfFileOrLocalStorageExists: Boolean): js.Promise[_] = js.native
    
    @JSName("options")
    var options_SqljsDriver: SqljsConnectionOptions = js.native
    
    /**
      * Saved the current database to the given file (Node.js), local storage key (browser) or
      * indexedDB key (browser with enabled useLocalForage option).
      * If no location path is given, the location path in the options (if specified) will be used.
      */
    def save(): js.Promise[Unit] = js.native
    def save(location: String): js.Promise[Unit] = js.native
  }
}
