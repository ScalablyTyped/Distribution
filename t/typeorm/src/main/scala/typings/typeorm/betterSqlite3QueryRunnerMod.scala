package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.betterSqlite3DriverMod.BetterSqlite3Driver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/better-sqlite3/BetterSqlite3QueryRunner", JSImport.Namespace)
@js.native
object betterSqlite3QueryRunnerMod extends js.Object {
  
  @js.native
  class BetterSqlite3QueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: BetterSqlite3Driver) = this()
    
    var cacheSize: js.Any = js.native
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_BetterSqlite3QueryRunner: BetterSqlite3Driver = js.native
    
    var getStmt: js.Any = js.native
    
    var stmtCache: js.Any = js.native
  }
}
