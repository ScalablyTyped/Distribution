package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.driverMod.Driver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverFactoryMod {
  
  @JSImport("typeorm/browser/driver/DriverFactory", "DriverFactory")
  @js.native
  class DriverFactory () extends StObject {
    
    /**
      * Creates a new driver depend on a given connection's driver type.
      */
    def create(connection: Connection): Driver = js.native
  }
}
