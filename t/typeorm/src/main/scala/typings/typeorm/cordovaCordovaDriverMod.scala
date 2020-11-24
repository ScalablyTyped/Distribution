package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/cordova/CordovaDriver", JSImport.Namespace)
@js.native
object cordovaCordovaDriverMod extends js.Object {
  
  @js.native
  class CordovaDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_CordovaDriver: CordovaConnectionOptions = js.native
  }
}
