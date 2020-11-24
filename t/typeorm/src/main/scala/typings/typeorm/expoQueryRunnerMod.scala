package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.expoDriverMod.ExpoDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/expo/ExpoQueryRunner", JSImport.Namespace)
@js.native
object expoQueryRunnerMod extends js.Object {
  
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
