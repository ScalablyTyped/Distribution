package typings.typeorm

import typings.typeorm.loggerMod.Logger
import typings.typeorm.typeormStrings.all
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.log
import typings.typeorm.typeormStrings.migration
import typings.typeorm.typeormStrings.query
import typings.typeorm.typeormStrings.schema
import typings.typeorm.typeormStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advancedConsoleLoggerMod {
  
  @JSImport("typeorm/browser/logger/AdvancedConsoleLogger", "AdvancedConsoleLogger")
  @js.native
  class AdvancedConsoleLogger ()
    extends StObject
       with Logger {
    def this(options: js.Array[error | log | info | warn | query | schema | migration]) = this()
    def this(options: Boolean) = this()
    def this(options: all) = this()
    
    var options: js.Any = js.native
    
    /**
      * Converts parameters to a string.
      * Sometimes parameters can have circular objects and therefor we are handle this case too.
      */
    /* protected */ def stringifyParams(parameters: js.Array[js.Any]): String | js.Array[js.Any] = js.native
  }
}
