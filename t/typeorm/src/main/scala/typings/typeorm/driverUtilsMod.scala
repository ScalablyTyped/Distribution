package typings.typeorm

import typings.typeorm.anon.UseSid
import typings.typeorm.driverMod.Driver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverUtilsMod {
  
  @JSImport("typeorm/browser/driver/DriverUtils", "DriverUtils")
  @js.native
  class DriverUtils () extends StObject
  /* static members */
  object DriverUtils {
    
    @JSImport("typeorm/browser/driver/DriverUtils", "DriverUtils")
    @js.native
    val ^ : js.Any = js.native
    
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
    @scala.inline
    def buildColumnAlias(hasMaxAliasLength: Driver, alias: String, column: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumnAlias")(hasMaxAliasLength.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Normalizes and builds a new driver options.
      * Extracts settings from connection url and sets to a new options object.
      */
    @scala.inline
    def buildDriverOptions(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDriverOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def buildDriverOptions(options: js.Any, buildOptions: UseSid): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDriverOptions")(options.asInstanceOf[js.Any], buildOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * Extracts connection data from the connection url.
      */
    @JSImport("typeorm/browser/driver/DriverUtils", "DriverUtils.parseConnectionUrl")
    @js.native
    def parseConnectionUrl: js.Any = js.native
    @scala.inline
    def parseConnectionUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseConnectionUrl")(x.asInstanceOf[js.Any])
  }
}
