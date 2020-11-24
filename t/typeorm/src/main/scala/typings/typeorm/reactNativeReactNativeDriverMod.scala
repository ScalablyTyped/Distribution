package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/react-native/ReactNativeDriver", JSImport.Namespace)
@js.native
object reactNativeReactNativeDriverMod extends js.Object {
  
  @js.native
  class ReactNativeDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ReactNativeDriver: ReactNativeConnectionOptions = js.native
  }
}
