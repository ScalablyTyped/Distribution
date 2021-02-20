package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeReactNativeDriverMod {
  
  @JSImport("typeorm/driver/react-native/ReactNativeDriver", "ReactNativeDriver")
  @js.native
  class ReactNativeDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ReactNativeDriver: ReactNativeConnectionOptions = js.native
  }
}
