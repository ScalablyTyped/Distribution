package typings.typeorm

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

object loggerOptionsMod {
  
  trait FileLoggerOptions extends StObject {
    
    /**
      * Specify custom path for log file, relative to application root
      */
    var logPath: String
  }
  object FileLoggerOptions {
    
    inline def apply(logPath: String): FileLoggerOptions = {
      val __obj = js.Dynamic.literal(logPath = logPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileLoggerOptions]
    }
    
    extension [Self <: FileLoggerOptions](x: Self) {
      
      inline def setLogPath(value: String): Self = StObject.set(x, "logPath", value.asInstanceOf[js.Any])
    }
  }
  
  type LoggerOptions = Boolean | all | (js.Array[query | schema | error | warn | info | log | migration])
}
