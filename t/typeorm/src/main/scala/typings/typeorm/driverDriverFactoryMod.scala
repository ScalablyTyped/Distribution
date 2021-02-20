package typings.typeorm

import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.driverDriverMod.Driver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverDriverFactoryMod {
  
  @JSImport("typeorm/driver/DriverFactory", "DriverFactory")
  @js.native
  class DriverFactory () extends StObject {
    
    /**
      * Creates a new driver depend on a given connection's driver type.
      */
    def create(connection: Connection): Driver = js.native
  }
}
