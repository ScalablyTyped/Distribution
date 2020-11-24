package typings.typeorm

import typings.typeorm.abstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.reactNativeDriverMod.ReactNativeDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/react-native/ReactNativeQueryRunner", JSImport.Namespace)
@js.native
object reactNativeQueryRunnerMod extends js.Object {
  
  @js.native
  class ReactNativeQueryRunner protected () extends AbstractSqliteQueryRunner {
    def this(driver: ReactNativeDriver) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_ReactNativeQueryRunner: ReactNativeDriver = js.native
    
    /**
      * Parametrizes given object of values. Used to create column=value queries.
      */
    /* protected */ def parametrize(objectLiteral: ObjectLiteral): js.Array[String] = js.native
    /* protected */ def parametrize(objectLiteral: ObjectLiteral, startIndex: Double): js.Array[String] = js.native
  }
}
