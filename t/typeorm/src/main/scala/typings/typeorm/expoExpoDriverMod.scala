package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/expo/ExpoDriver", JSImport.Namespace)
@js.native
object expoExpoDriverMod extends js.Object {
  
  @js.native
  class ExpoDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ExpoDriver: ExpoConnectionOptions = js.native
  }
}
