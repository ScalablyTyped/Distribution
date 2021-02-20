package typings.typeorm

import typings.typeorm.typeormStrings.browser
import typings.typeorm.typeormStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserPlatformToolsMod {
  
  @JSImport("typeorm/browser/platform/BrowserPlatformTools", "EventEmitter")
  @js.native
  class EventEmitter () extends StObject
  
  @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools")
  @js.native
  class PlatformTools () extends StObject
  /* static members */
  object PlatformTools {
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.appendFileSync")
    @js.native
    def appendFileSync(filename: String, data: js.Any): Unit = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.dotenv")
    @js.native
    def dotenv(pathStr: String): Unit = js.native
    
    /**
      * Synchronously checks if file exist. Does "fs.existsSync".
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.fileExist")
    @js.native
    def fileExist(pathStr: String): Boolean = js.native
    
    /**
      * Gets environment variable.
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.getEnvVariable")
    @js.native
    def getEnvVariable(name: String): js.Any = js.native
    
    /**
      * Gets global variable where global stuff can be stored.
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.getGlobalVariable")
    @js.native
    def getGlobalVariable(): js.Any = js.native
    
    /**
      * Highlights json string to be print in the console.
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.highlightJson")
    @js.native
    def highlightJson(json: String): String = js.native
    
    /**
      * Highlights sql string to be print in the console.
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.highlightSql")
    @js.native
    def highlightSql(sql: String): String = js.native
    
    /**
      * Loads ("require"-s) given file or package.
      * This operation only supports on node platform
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.load")
    @js.native
    def load(name: String): js.Any = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.log")
    @js.native
    def log(message: String): Unit = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.logError")
    @js.native
    def logError(prefix: String, error: js.Any): Unit = js.native
    
    /**
      * Logging functions needed by AdvancedConsoleLogger (but here without chalk)
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.logInfo")
    @js.native
    def logInfo(prefix: String, info: js.Any): Unit = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.logWarn")
    @js.native
    def logWarn(prefix: String, warning: js.Any): Unit = js.native
    
    /**
      * Gets file extension. Does "path.extname".
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.pathExtname")
    @js.native
    def pathExtname(pathStr: String): String = js.native
    
    /**
      * Normalizes given path. Does "path.normalize".
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.pathNormalize")
    @js.native
    def pathNormalize(pathStr: String): String = js.native
    
    /**
      * Resolved given path. Does "path.resolve".
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.pathResolve")
    @js.native
    def pathResolve(pathStr: String): String = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.readFileSync")
    @js.native
    def readFileSync(filename: String): js.Any = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.warn")
    @js.native
    def warn(message: String): String = js.native
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.writeFile")
    @js.native
    def writeFile(path: String, data: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Type of the currently running platform.
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.type")
    @js.native
    val `type`: browser | node = js.native
  }
  
  @JSImport("typeorm/browser/platform/BrowserPlatformTools", "Readable")
  @js.native
  class Readable () extends StObject
  
  @JSImport("typeorm/browser/platform/BrowserPlatformTools", "Writable")
  @js.native
  class Writable () extends StObject
  
  @js.native
  trait ReadStream extends StObject
}
