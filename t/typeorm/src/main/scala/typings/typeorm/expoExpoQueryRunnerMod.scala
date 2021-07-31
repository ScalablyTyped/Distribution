package typings.typeorm

import typings.typeorm.expoExpoDriverMod.ExpoDriver
import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoExpoQueryRunnerMod {
  
  @JSImport("typeorm/driver/expo/ExpoQueryRunner", "ExpoQueryRunner")
  @js.native
  class ExpoQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: ExpoDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_ExpoQueryRunner: ExpoDriver = js.native
    
    /**
      * Database transaction object
      */
    var transaction: js.Any = js.native
  }
}
