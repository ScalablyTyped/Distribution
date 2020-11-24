package typings.typeorm

import typings.typeorm.loggerLoggerMod.Logger
import typings.typeorm.loggerLoggerOptionsMod.FileLoggerOptions
import typings.typeorm.typeormStrings.all
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.log
import typings.typeorm.typeormStrings.migration
import typings.typeorm.typeormStrings.query
import typings.typeorm.typeormStrings.schema
import typings.typeorm.typeormStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/logger/FileLogger", JSImport.Namespace)
@js.native
object loggerFileLoggerMod extends js.Object {
  
  @js.native
  class FileLogger () extends Logger {
    def this(options: js.Array[log | info | warn | query | schema | error | migration]) = this()
    def this(options: Boolean) = this()
    def this(options: all) = this()
    def this(options: js.UndefOr[scala.Nothing], fileLoggerOptions: FileLoggerOptions) = this()
    def this(
      options: js.Array[log | info | warn | query | schema | error | migration],
      fileLoggerOptions: FileLoggerOptions
    ) = this()
    def this(options: Boolean, fileLoggerOptions: FileLoggerOptions) = this()
    def this(options: all, fileLoggerOptions: FileLoggerOptions) = this()
    
    var fileLoggerOptions: js.Any = js.native
    
    var options: js.Any = js.native
    
    /**
      * Converts parameters to a string.
      * Sometimes parameters can have circular objects and therefor we are handle this case too.
      */
    /* protected */ def stringifyParams(parameters: js.Array[_]): String | js.Array[_] = js.native
    
    /**
      * Writes given strings into the log file.
      */
    /* protected */ def write(strings: String): Unit = js.native
    /* protected */ def write(strings: js.Array[String]): Unit = js.native
  }
}
