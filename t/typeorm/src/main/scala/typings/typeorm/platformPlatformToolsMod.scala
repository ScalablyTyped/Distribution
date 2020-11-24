package typings.typeorm

import typings.node.Buffer
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.AsyncIterable
import typings.std.Iterable
import typings.typeorm.typeormStrings.browser
import typings.typeorm.typeormStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/platform/PlatformTools", JSImport.Namespace)
@js.native
object platformPlatformToolsMod extends js.Object {
  
  @js.native
  class EventEmitter ()
    extends typings.node.eventsMod.EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    
    var defaultMaxListeners: Double = js.native
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`
      * events. Listeners installed using this symbol are called before the regular
      * `'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an
      * `'error'` event is emitted, therefore the process will still crash if no
      * regular `'error'` listener is installed.
      */
    val errorMonitor: js.Symbol = js.native
    
    /** @deprecated since v4.0.0 */
    def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: String): Double = js.native
    def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: js.Symbol): Double = js.native
  }
  
  @js.native
  class PlatformTools () extends js.Object
  /* static members */
  @js.native
  object PlatformTools extends js.Object {
    
    def appendFileSync(filename: String, data: js.Any): Unit = js.native
    
    /**
      * Loads a dotenv file into the environment variables.
      *
      * @param path The file to load as a dotenv configuration
      */
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
      * Logging functions needed by AdvancedConsoleLogger
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
    
    def readFileSync(filename: String): Buffer = js.native
    
    /**
      * Type of the currently running platform.
      */
    var `type`: browser | node = js.native
    
    def warn(message: String): String = js.native
    
    def writeFile(path: String, data: js.Any): js.Promise[Unit] = js.native
  }
  
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream
  
  @js.native
  class Readable ()
    extends typings.node.streamMod.Readable {
    def this(opts: ReadableOptions) = this()
  }
  /* static members */
  @js.native
  object Readable extends js.Object {
    
    def from(iterable: AsyncIterable[_]): typings.node.streamMod.Readable = js.native
    def from(iterable: AsyncIterable[_], options: ReadableOptions): typings.node.streamMod.Readable = js.native
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    def from(iterable: Iterable[_]): typings.node.streamMod.Readable = js.native
    def from(iterable: Iterable[_], options: ReadableOptions): typings.node.streamMod.Readable = js.native
  }
  
  @js.native
  class Writable ()
    extends typings.node.streamMod.Writable {
    def this(opts: WritableOptions) = this()
  }
}
