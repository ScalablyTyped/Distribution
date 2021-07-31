package typings.typeorm

import typings.typeorm.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugLoggerMod {
  
  @JSImport("typeorm/browser/logger/DebugLogger", "DebugLogger")
  @js.native
  class DebugLogger ()
    extends StObject
       with Logger {
    
    var debugInfo: js.Any = js.native
    
    var debugLog: js.Any = js.native
    
    var debugMigration: js.Any = js.native
    
    var debugQueryError: js.Any = js.native
    
    var debugQueryLog: js.Any = js.native
    
    var debugQuerySlow: js.Any = js.native
    
    var debugSchemaBuild: js.Any = js.native
    
    var debugWarn: js.Any = js.native
  }
}
