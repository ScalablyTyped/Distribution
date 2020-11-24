package typings.typeorm.browserPlatformToolsMod

import typings.typeorm.typeormStrings.browser
import typings.typeorm.typeormStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools")
@js.native
class PlatformTools () extends js.Object
/* static members */
@JSImport("typeorm/browser/platform/BrowserPlatformTools", "PlatformTools")
@js.native
object PlatformTools extends js.Object {
  
  def appendFileSync(filename: String, data: js.Any): Unit = js.native
  
  def dotenv(pathStr: String): Unit = js.native
  
  /**
    * Synchronously checks if file exist. Does "fs.existsSync".
    */
  def fileExist(pathStr: String): Boolean = js.native
  
  /**
    * Gets environment variable.
    */
  def getEnvVariable(name: String): js.Any = js.native
  
  /**
    * Gets global variable where global stuff can be stored.
    */
  def getGlobalVariable(): js.Any = js.native
  
  /**
    * Highlights json string to be print in the console.
    */
  def highlightJson(json: String): String = js.native
  
  /**
    * Highlights sql string to be print in the console.
    */
  def highlightSql(sql: String): String = js.native
  
  /**
    * Loads ("require"-s) given file or package.
    * This operation only supports on node platform
    */
  def load(name: String): js.Any = js.native
  
  def log(message: String): Unit = js.native
  
  def logError(prefix: String, error: js.Any): Unit = js.native
  
  /**
    * Logging functions needed by AdvancedConsoleLogger (but here without chalk)
    */
  def logInfo(prefix: String, info: js.Any): Unit = js.native
  
  def logWarn(prefix: String, warning: js.Any): Unit = js.native
  
  /**
    * Gets file extension. Does "path.extname".
    */
  def pathExtname(pathStr: String): String = js.native
  
  /**
    * Normalizes given path. Does "path.normalize".
    */
  def pathNormalize(pathStr: String): String = js.native
  
  /**
    * Resolved given path. Does "path.resolve".
    */
  def pathResolve(pathStr: String): String = js.native
  
  def readFileSync(filename: String): js.Any = js.native
  
  /**
    * Type of the currently running platform.
    */
  var `type`: browser | node = js.native
  
  def warn(message: String): String = js.native
  
  def writeFile(path: String, data: js.Any): js.Promise[Unit] = js.native
}
