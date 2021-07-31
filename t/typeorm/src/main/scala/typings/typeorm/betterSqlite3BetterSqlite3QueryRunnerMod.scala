package typings.typeorm

import typings.typeorm.betterSqlite3BetterSqlite3DriverMod.BetterSqlite3Driver
import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterSqlite3BetterSqlite3QueryRunnerMod {
  
  @JSImport("typeorm/driver/better-sqlite3/BetterSqlite3QueryRunner", "BetterSqlite3QueryRunner")
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
