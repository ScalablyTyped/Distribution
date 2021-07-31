package typings.typeorm

import typings.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterSqlite3BetterSqlite3DriverMod {
  
  @JSImport("typeorm/driver/better-sqlite3/BetterSqlite3Driver", "BetterSqlite3Driver")
  @js.native
  class BetterSqlite3Driver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    /**
      * Auto creates database directory if it does not exist.
      */
    /* protected */ def createDatabaseDirectory(fullPath: String): js.Promise[Unit] = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_BetterSqlite3Driver: BetterSqlite3ConnectionOptions = js.native
  }
}
