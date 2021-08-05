package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.betterSqlite3DriverMod.BetterSqlite3Driver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object betterSqlite3QueryRunnerMod {
  
  @JSImport("typeorm/browser/driver/better-sqlite3/BetterSqlite3QueryRunner", "BetterSqlite3QueryRunner")
  @js.native
  class BetterSqlite3QueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: BetterSqlite3Driver) = this()
    
    /* private */ var cacheSize: js.Any = js.native
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_BetterSqlite3QueryRunner: BetterSqlite3Driver = js.native
    
    /* private */ var getStmt: js.Any = js.native
    
    /* private */ var stmtCache: js.Any = js.native
  }
}
