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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformToolsMod {
  
  @JSImport("typeorm/browser/platform/PlatformTools", "EventEmitter")
  @js.native
  class EventEmitter ()
    extends typings.node.eventsMod.EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  object EventEmitter {
    
    @JSImport("typeorm/browser/platform/PlatformTools", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("typeorm/browser/platform/PlatformTools", "EventEmitter.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
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
    @JSImport("typeorm/browser/platform/PlatformTools", "EventEmitter.errorMonitor")
    @js.native
    val errorMonitor: js.Symbol = js.native
    
    /** @deprecated since v4.0.0 */
    /* static member */
    inline def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def listenerCount(emitter: typings.node.eventsMod.EventEmitter, event: js.Symbol): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("typeorm/browser/platform/PlatformTools", "PlatformTools")
  @js.native
  class PlatformTools () extends StObject
  /* static members */
  object PlatformTools {
    
    @JSImport("typeorm/browser/platform/PlatformTools", "PlatformTools")
    @js.native
    val ^ : js.Any = js.native
    
    inline def appendFileSync(filename: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Loads a dotenv file into the environment variables.
      *
      * @param path The file to load as a dotenv configuration
      */
    inline def dotenv(pathStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dotenv")(pathStr.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Synchronously checks if file exist. Does "fs.existsSync".
      */
    inline def fileExist(pathStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExist")(pathStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Gets environment variable.
      */
    inline def getEnvVariable(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvVariable")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Gets global variable where global stuff can be stored.
      */
    inline def getGlobalVariable(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalVariable")().asInstanceOf[js.Any]
    
    /**
      * Highlights json string to be print in the console.
      */
    inline def highlightJson(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightJson")(json.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Highlights sql string to be print in the console.
      */
    inline def highlightSql(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightSql")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Loads ("require"-s) given file or package.
      * This operation only supports on node platform
      */
    inline def load(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logError(prefix: String, error: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logError")(prefix.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Logging functions needed by AdvancedConsoleLogger
      */
    inline def logInfo(prefix: String, info: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logInfo")(prefix.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logWarn(prefix: String, warning: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logWarn")(prefix.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets file extension. Does "path.extname".
      */
    inline def pathExtname(pathStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExtname")(pathStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Normalizes given path. Does "path.normalize".
      */
    inline def pathNormalize(pathStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathNormalize")(pathStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Resolved given path. Does "path.resolve".
      */
    inline def pathResolve(pathStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathResolve")(pathStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def readFileSync(filename: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Type of the currently running platform.
      */
    @JSImport("typeorm/browser/platform/PlatformTools", "PlatformTools.type")
    @js.native
    val `type`: browser | node = js.native
    
    inline def warn(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def writeFile(path: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("typeorm/browser/platform/PlatformTools", "ReadStream")
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("typeorm/browser/platform/PlatformTools", "Readable")
  @js.native
  class Readable ()
    extends typings.node.streamMod.Readable {
    def this(opts: ReadableOptions) = this()
  }
  object Readable {
    
    @JSImport("typeorm/browser/platform/PlatformTools", "Readable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(iterable: AsyncIterable[js.Any]): typings.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.Readable]
    inline def from(iterable: AsyncIterable[js.Any], options: ReadableOptions): typings.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.streamMod.Readable]
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    inline def from(iterable: Iterable[js.Any]): typings.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.Readable]
    inline def from(iterable: Iterable[js.Any], options: ReadableOptions): typings.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.streamMod.Readable]
  }
  
  @JSImport("typeorm/browser/platform/PlatformTools", "Writable")
  @js.native
  class Writable ()
    extends typings.node.streamMod.Writable {
    def this(opts: WritableOptions) = this()
  }
}
