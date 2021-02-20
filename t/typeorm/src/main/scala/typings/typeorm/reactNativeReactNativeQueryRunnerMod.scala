package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.reactNativeReactNativeDriverMod.ReactNativeDriver
import typings.typeorm.sqliteAbstractAbstractSqliteQueryRunnerMod.AbstractSqliteQueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeReactNativeQueryRunnerMod {
  
  @JSImport("typeorm/driver/react-native/ReactNativeQueryRunner", "ReactNativeQueryRunner")
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
