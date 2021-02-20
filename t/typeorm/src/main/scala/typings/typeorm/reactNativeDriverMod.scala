package typings.typeorm

import typings.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typings.typeorm.connectionMod.Connection
import typings.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeDriverMod {
  
  @JSImport("typeorm/browser/driver/react-native/ReactNativeDriver", "ReactNativeDriver")
  @js.native
  class ReactNativeDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ReactNativeDriver: ReactNativeConnectionOptions = js.native
  }
}
