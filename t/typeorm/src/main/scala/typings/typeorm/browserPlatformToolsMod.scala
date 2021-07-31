package typings.typeorm

import typings.typeorm.typeormStrings.browser
import typings.typeorm.typeormStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def appendFileSync(filename: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def dotenv(pathStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dotenv")(pathStr.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Synchronously checks if file exist. Does "fs.existsSync".
      */
    @scala.inline
    def fileExist(pathStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExist")(pathStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Gets environment variable.
      */
    @scala.inline
    def getEnvVariable(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvVariable")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Gets global variable where global stuff can be stored.
      */
    @scala.inline
    def getGlobalVariable(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalVariable")().asInstanceOf[js.Any]
    
    /**
      * Highlights json string to be print in the console.
      */
    @scala.inline
    def highlightJson(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightJson")(json.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Highlights sql string to be print in the console.
      */
    @scala.inline
    def highlightSql(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightSql")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Loads ("require"-s) given file or package.
      * This operation only supports on node platform
      */
    @scala.inline
    def load(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def logError(prefix: String, error: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logError")(prefix.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Logging functions needed by AdvancedConsoleLogger (but here without chalk)
      */
    @scala.inline
    def logInfo(prefix: String, info: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logInfo")(prefix.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def logWarn(prefix: String, warning: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logWarn")(prefix.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets file extension. Does "path.extname".
      */
    @scala.inline
    def pathExtname(pathStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExtname")(pathStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Normalizes given path. Does "path.normalize".
      */
    @scala.inline
    def pathNormalize(pathStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathNormalize")(pathStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Resolved given path. Does "path.resolve".
      */
    @scala.inline
    def pathResolve(pathStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathResolve")(pathStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def readFileSync(filename: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Type of the currently running platform.
      */
    @JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools.type")
    @js.native
    val `type`: browser | node = js.native
    
    @scala.inline
    def warn(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def writeFile(path: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("typeorm/browser/platform/BrowserPlatformTools", "Readable")
  @js.native
  class Readable () extends StObject
  
  @JSImport("typeorm/browser/platform/BrowserPlatformTools", "Writable")
  @js.native
  class Writable () extends StObject
  
  trait ReadStream extends StObject
}
