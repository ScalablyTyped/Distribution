package typings.typeorm

import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.sqliteSqliteDriverMod.SqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteSqliteQueryRunnerMod {
  
  @JSImport("typeorm/driver/sqlite/SqliteQueryRunner", "SqliteQueryRunner")
  @js.native
  class SqliteQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: SqliteDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_SqliteQueryRunner: SqliteDriver = js.native
  }
}
