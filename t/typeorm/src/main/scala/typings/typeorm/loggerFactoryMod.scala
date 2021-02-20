package typings.typeorm

import typings.typeorm.loggerMod.Logger
import typings.typeorm.loggerOptionsMod.LoggerOptions
import typings.typeorm.typeormStrings.`advanced-console`
import typings.typeorm.typeormStrings.`simple-console`
import typings.typeorm.typeormStrings.debug
import typings.typeorm.typeormStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerFactoryMod {
  
  @JSImport("typeorm/browser/logger/LoggerFactory", "LoggerFactory")
  @js.native
  class LoggerFactory () extends StObject {
    
    /**
      * Creates a new logger depend on a given connection's driver.
      */
    def create(): Logger = js.native
    def create(logger: js.UndefOr[scala.Nothing], options: LoggerOptions): Logger = js.native
    def create(logger: Logger): Logger = js.native
    def create(logger: Logger, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_advancedconsole(logger: `advanced-console`): Logger = js.native
    @JSName("create")
    def create_advancedconsole(logger: `advanced-console`, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_debug(logger: debug): Logger = js.native
    @JSName("create")
    def create_debug(logger: debug, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_file(logger: file): Logger = js.native
    @JSName("create")
    def create_file(logger: file, options: LoggerOptions): Logger = js.native
    @JSName("create")
    def create_simpleconsole(logger: `simple-console`): Logger = js.native
    @JSName("create")
    def create_simpleconsole(logger: `simple-console`, options: LoggerOptions): Logger = js.native
  }
}
