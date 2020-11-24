package typings.typeorm

import typings.typeorm.loggerLoggerMod.Logger
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

@JSImport("typeorm/logger/SimpleConsoleLogger", JSImport.Namespace)
@js.native
object loggerSimpleConsoleLoggerMod extends js.Object {
  
  @js.native
  class SimpleConsoleLogger () extends Logger {
    def this(options: js.Array[log | info | warn | query | schema | error | migration]) = this()
    def this(options: Boolean) = this()
    def this(options: all) = this()
    
    var options: js.Any = js.native
    
    /**
      * Converts parameters to a string.
      * Sometimes parameters can have circular objects and therefor we are handle this case too.
      */
    /* protected */ def stringifyParams(parameters: js.Array[_]): String | js.Array[_] = js.native
  }
}
