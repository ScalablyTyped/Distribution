package typings.typeorm

import typings.node.Buffer
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.AsyncIterable
import typings.std.Iterable
import typings.typeorm.typeormStrings.browser
import typings.typeorm.typeormStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformPlatformToolsMod {
  
  @JSImport("typeorm/platform/PlatformTools", "EventEmitter")
  @js.native
  class EventEmitter ()
    extends typings.node.eventsMod.EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  object EventEmitter {
    
    @JSImport("typeorm/platform/PlatformTools", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("typeorm/platform/PlatformTools", "EventEmitter.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    @scala.inline
    def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`
      * events. Listeners installed using this symbol are called before the regular
      * `'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an
      * `'error'` event is emitted, therefore the process will still crash if no
      * regular `'error'` listener is installed.
      */
    /* static member */
    @JSImport("typeorm/platform/PlatformTools", "EventEmitter.errorMonitor")
    @js.native
    val errorMonitor: js.Symbol = js.native
    
    /** @deprecated since v4.0.0 */
    /* static member */
    @JSImport("typeorm/platform/PlatformTools", "EventEmitter.listenerCount")
    @js.native
    def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: String): Double = js.native
    @JSImport("typeorm/platform/PlatformTools", "EventEmitter.listenerCount")
    @js.native
    def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: js.Symbol): Double = js.native
  }
  
  @JSImport("typeorm/platform/PlatformTools", "PlatformTools")
  @js.native
  class PlatformTools () extends StObject
  /* static members */
  object PlatformTools {
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.appendFileSync")
    @js.native
    def appendFileSync(filename: String, data: js.Any): Unit = js.native
    
    /**
      * Loads a dotenv file into the environment variables.
      *
      * @param path The file to load as a dotenv configuration
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.dotenv")
    @js.native
    def dotenv(pathStr: String): Unit = js.native
    
    /**
      * Synchronously checks if file exist. Does "fs.existsSync".
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.fileExist")
    @js.native
    def fileExist(pathStr: String): Boolean = js.native
    
    /**
      * Gets environment variable.
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.getEnvVariable")
    @js.native
    def getEnvVariable(name: String): js.Any = js.native
    
    /**
      * Gets global variable where global stuff can be stored.
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.getGlobalVariable")
    @js.native
    def getGlobalVariable(): js.Any = js.native
    
    /**
      * Highlights json string to be print in the console.
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.highlightJson")
    @js.native
    def highlightJson(json: String): String = js.native
    
    /**
      * Highlights sql string to be print in the console.
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.highlightSql")
    @js.native
    def highlightSql(sql: String): String = js.native
    
    /**
      * Loads ("require"-s) given file or package.
      * This operation only supports on node platform
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.load")
    @js.native
    def load(name: String): js.Any = js.native
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.log")
    @js.native
    def log(message: String): Unit = js.native
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.logError")
    @js.native
    def logError(prefix: String, error: js.Any): Unit = js.native
    
    /**
      * Logging functions needed by AdvancedConsoleLogger
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.logInfo")
    @js.native
    def logInfo(prefix: String, info: js.Any): Unit = js.native
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.logWarn")
    @js.native
    def logWarn(prefix: String, warning: js.Any): Unit = js.native
    
    /**
      * Gets file extension. Does "path.extname".
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.pathExtname")
    @js.native
    def pathExtname(pathStr: String): String = js.native
    
    /**
      * Normalizes given path. Does "path.normalize".
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.pathNormalize")
    @js.native
    def pathNormalize(pathStr: String): String = js.native
    
    /**
      * Resolved given path. Does "path.resolve".
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.pathResolve")
    @js.native
    def pathResolve(pathStr: String): String = js.native
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.readFileSync")
    @js.native
    def readFileSync(filename: String): Buffer = js.native
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.warn")
    @js.native
    def warn(message: String): String = js.native
    
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.writeFile")
    @js.native
    def writeFile(path: String, data: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Type of the currently running platform.
      */
    @JSImport("typeorm/platform/PlatformTools", "PlatformTools.type")
    @js.native
    val `type`: browser | node = js.native
  }
  
  @JSImport("typeorm/platform/PlatformTools", "ReadStream")
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("typeorm/platform/PlatformTools", "Readable")
  @js.native
  class Readable ()
    extends typings.node.streamMod.Readable {
    def this(opts: ReadableOptions) = this()
  }
  object Readable {
    
    @JSImport("typeorm/platform/PlatformTools", "Readable.from")
    @js.native
    def from(iterable: AsyncIterable[_]): typings.node.streamMod.Readable = js.native
    @JSImport("typeorm/platform/PlatformTools", "Readable.from")
    @js.native
    def from(iterable: AsyncIterable[_], options: ReadableOptions): typings.node.streamMod.Readable = js.native
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    @JSImport("typeorm/platform/PlatformTools", "Readable.from")
    @js.native
    def from(iterable: Iterable[_]): typings.node.streamMod.Readable = js.native
    @JSImport("typeorm/platform/PlatformTools", "Readable.from")
    @js.native
    def from(iterable: Iterable[_], options: ReadableOptions): typings.node.streamMod.Readable = js.native
  }
  
  @JSImport("typeorm/platform/PlatformTools", "Writable")
  @js.native
  class Writable ()
    extends typings.node.streamMod.Writable {
    def this(opts: WritableOptions) = this()
  }
}
