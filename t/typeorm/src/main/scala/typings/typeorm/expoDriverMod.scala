package typings.typeorm

import typings.typeorm.abstractSqliteDriverMod.AbstractSqliteDriver
import typings.typeorm.connectionMod.Connection
import typings.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoDriverMod {
  
  @JSImport("typeorm/browser/driver/expo/ExpoDriver", "ExpoDriver")
  @js.native
  class ExpoDriver protected () extends AbstractSqliteDriver {
    def this(connection: Connection) = this()
    
    @JSName("options")
    var options_ExpoDriver: ExpoConnectionOptions = js.native
  }
}
