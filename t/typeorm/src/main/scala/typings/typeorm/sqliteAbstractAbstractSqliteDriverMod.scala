package typings.typeorm

import typings.typeorm.anon.ScaleType
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteAbstractAbstractSqliteDriverMod {
  
  @JSImport("typeorm/driver/sqlite-abstract/AbstractSqliteDriver", "AbstractSqliteDriver")
  @js.native
  abstract class AbstractSqliteDriver protected () extends Driver {
    def this(connection: Connection) = this()
    
    /**
      * Connection used by driver.
      */
    var connection: Connection = js.native
    
    /**
      * Creates connection with the database.
      */
    /* protected */ def createDatabaseConnection(): Unit = js.native
    
    /**
      * Real database connection with sqlite database.
      */
    var databaseConnection: js.Any = js.native
    
    /**
      * If driver dependency is not given explicitly, then try to load it via "require".
      */
    /* protected */ def loadDependencies(): Unit = js.native
    
    /**
      * Creates a database type from a given column metadata.
      */
    def normalizeType(column: ScaleType): String = js.native
    
    /**
      * Sqlite has a single QueryRunner because it works on a single database connection.
      */
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /**
      * SQLite underlying library.
      */
    var sqlite: js.Any = js.native
  }
}
