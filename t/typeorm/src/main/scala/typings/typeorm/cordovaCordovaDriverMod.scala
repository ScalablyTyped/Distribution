package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions
import typings.typeorm.sqliteAbstractAbstractSqliteDriverMod.AbstractSqliteDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaCordovaDriverMod {
  
  @JSImport("typeorm/driver/cordova/CordovaDriver", "CordovaDriver")
  @js.native
  class CordovaDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_CordovaDriver: CordovaConnectionOptions = js.native
  }
}
