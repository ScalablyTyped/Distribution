package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.expoDriverMod.ExpoDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoQueryRunnerMod {
  
  @JSImport("typeorm/browser/driver/expo/ExpoQueryRunner", "ExpoQueryRunner")
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
    /* private */ var transaction: js.Any = js.native
  }
}
