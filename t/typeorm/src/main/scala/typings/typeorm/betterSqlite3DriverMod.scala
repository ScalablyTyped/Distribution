package typings.typeorm

import typings.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typings.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
import typings.typeorm.connectionMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/better-sqlite3/BetterSqlite3Driver", JSImport.Namespace)
@js.native
object betterSqlite3DriverMod extends js.Object {
  
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
