package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserFileLoggerDummyMod {
  
  @JSImport("typeorm/browser/platform/BrowserFileLoggerDummy", "DummyLogger")
  @js.native
  class DummyLogger () extends StObject {
    
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
  
  @JSImport("typeorm/browser/platform/BrowserFileLoggerDummy", "FileLogger")
  @js.native
  class FileLogger () extends DummyLogger
}
