package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import typings.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteSqliteDriverMod {
  
  @JSImport("typeorm/driver/sqlite/SqliteDriver", "SqliteDriver")
  @js.native
  class SqliteDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    /**
      * Auto creates database directory if it does not exist.
      */
    /* protected */ def createDatabaseDirectory(fullPath: String): js.Promise[Unit] = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_SqliteDriver: SqliteConnectionOptions = js.native
  }
}
