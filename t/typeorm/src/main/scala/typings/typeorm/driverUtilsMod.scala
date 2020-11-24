package typings.typeorm

import typings.typeorm.anon.UseSid
import typings.typeorm.driverMod.Driver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/DriverUtils", JSImport.Namespace)
@js.native
object driverUtilsMod extends js.Object {
  
  @js.native
  class DriverUtils () extends js.Object
  /* static members */
  @js.native
  object DriverUtils extends js.Object {
    
    /**
      * Builds column alias from given alias name and column name.
      *
      * If alias length is greater than the limit (if any) allowed by the current
      * driver, replaces it with a hashed string.
      *
      * @param driver Current `Driver`.
      * @param alias Alias part.
      * @param column Name of the column to be concatened to `alias`.
      *
      * @return An alias allowing to select/transform the target `column`.
      */
    def buildColumnAlias(hasMaxAliasLength: Driver, alias: String, column: String): String = js.native
    
    /**
      * Normalizes and builds a new driver options.
      * Extracts settings from connection url and sets to a new options object.
      */
    def buildDriverOptions(options: js.Any): js.Any = js.native
    def buildDriverOptions(options: js.Any, buildOptions: UseSid): js.Any = js.native
    
    /**
      * Extracts connection data from the connection url.
      */
    var parseConnectionUrl: js.Any = js.native
  }
}
