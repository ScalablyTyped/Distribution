package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverDriverMod.Driver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/DriverFactory", JSImport.Namespace)
@js.native
object driverDriverFactoryMod extends js.Object {
  
  @js.native
  class DriverFactory () extends js.Object {
    
    /**
      * Creates a new driver depend on a given connection's driver type.
      */
    def create(connection: Connection): Driver = js.native
  }
}
