package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/platform/BrowserFileLoggerDummy", JSImport.Namespace)
@js.native
object browserFileLoggerDummyMod extends js.Object {
  
  @js.native
  class DummyLogger () extends js.Object {
    
    /**
      * Perform logging using given logger, or by default to the console.
      * Log has its own level and message.
      */
    def log(): Unit = js.native
    
    /**
      * Logs events from the migrations run process.
      */
    def logMigration(): Unit = js.native
    
    /**
      * Logs query and parameters used in it.
      */
    def logQuery(): Unit = js.native
    
    /**
      * Logs query that is failed.
      */
    def logQueryError(): Unit = js.native
    
    /**
      * Logs query that is slow.
      */
    def logQuerySlow(): Unit = js.native
    
    /**
      * Logs events from the schema build process.
      */
    def logSchemaBuild(): Unit = js.native
  }
  
  @js.native
  class FileLogger () extends DummyLogger
}
