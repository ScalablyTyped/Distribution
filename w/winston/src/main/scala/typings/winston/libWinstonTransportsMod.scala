package typings.winston

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.Agent
import typings.winston.anon.Bearer
import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWinstonTransportsMod extends Shortcut {
  
  @JSImport("winston/lib/winston/transports", JSImport.Namespace)
  @js.native
  val ^ : Transports = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "Console")
  @js.native
  open class Console () extends ConsoleTransportInstance {
    def this(options: ConsoleTransportOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "File")
  @js.native
  open class File () extends FileTransportInstance {
    def this(options: FileTransportOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "Http")
  @js.native
  open class Http () extends HttpTransportInstance {
    def this(options: HttpTransportOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "Stream")
  @js.native
  open class Stream () extends StreamTransportInstance {
    def this(options: StreamTransportOptions) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait ConsoleTransportInstance
    extends typings.winstonTransport.mod.^ {
    
    var eol: String = js.native
    
    var name: String = js.native
    
    var stderrLevels: js.Array[String] = js.native
  }
  
  trait ConsoleTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var consoleWarnLevels: js.UndefOr[js.Array[String]] = js.undefined
    
    var debugStdout: js.UndefOr[Boolean] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var stderrLevels: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConsoleTransportOptions {
    
    inline def apply(): ConsoleTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsoleTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setConsoleWarnLevels(value: js.Array[String]): Self = StObject.set(x, "consoleWarnLevels", value.asInstanceOf[js.Any])
      
      inline def setConsoleWarnLevelsUndefined: Self = StObject.set(x, "consoleWarnLevels", js.undefined)
      
      inline def setConsoleWarnLevelsVarargs(value: String*): Self = StObject.set(x, "consoleWarnLevels", js.Array(value*))
      
      inline def setDebugStdout(value: Boolean): Self = StObject.set(x, "debugStdout", value.asInstanceOf[js.Any])
      
      inline def setDebugStdoutUndefined: Self = StObject.set(x, "debugStdout", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setStderrLevels(value: js.Array[String]): Self = StObject.set(x, "stderrLevels", value.asInstanceOf[js.Any])
      
      inline def setStderrLevelsUndefined: Self = StObject.set(x, "stderrLevels", js.undefined)
      
      inline def setStderrLevelsVarargs(value: String*): Self = StObject.set(x, "stderrLevels", js.Array(value*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait FileTransportInstance
    extends typings.winstonTransport.mod.^ {
    
    var dirname: String = js.native
    
    var eol: String = js.native
    
    var filename: String = js.native
    
    var maxFiles: Double | Null = js.native
    
    var maxsize: Double | Null = js.native
    
    var name: String = js.native
    
    var options: js.Object = js.native
    
    var rotationFormat: js.Function | Boolean = js.native
    
    var tailable: Boolean = js.native
    
    var zippedArchive: Boolean = js.native
  }
  
  trait FileTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    var maxsize: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var rotationFormat: js.UndefOr[js.Function] = js.undefined
    
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    var tailable: js.UndefOr[Boolean] = js.undefined
    
    var zippedArchive: js.UndefOr[Boolean] = js.undefined
  }
  object FileTransportOptions {
    
    inline def apply(): FileTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMaxsize(value: Double): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
      
      inline def setMaxsizeUndefined: Self = StObject.set(x, "maxsize", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRotationFormat(value: js.Function): Self = StObject.set(x, "rotationFormat", value.asInstanceOf[js.Any])
      
      inline def setRotationFormatUndefined: Self = StObject.set(x, "rotationFormat", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
      
      inline def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
      
      inline def setZippedArchive(value: Boolean): Self = StObject.set(x, "zippedArchive", value.asInstanceOf[js.Any])
      
      inline def setZippedArchiveUndefined: Self = StObject.set(x, "zippedArchive", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait HttpTransportInstance
    extends typings.winstonTransport.mod.^ {
    
    var agent: js.UndefOr[Agent | Null] = js.native
    
    var auth: js.UndefOr[Bearer] = js.native
    
    var host: String = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var port: Double = js.native
    
    var ssl: Boolean = js.native
  }
  
  trait HttpTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var auth: js.UndefOr[Bearer] = js.undefined
    
    var batch: js.UndefOr[Boolean] = js.undefined
    
    var batchCount: js.UndefOr[Double] = js.undefined
    
    var batchInterval: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    var ssl: js.UndefOr[Any] = js.undefined
  }
  object HttpTransportOptions {
    
    inline def apply(): HttpTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAuth(value: Bearer): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchCount(value: Double): Self = StObject.set(x, "batchCount", value.asInstanceOf[js.Any])
      
      inline def setBatchCountUndefined: Self = StObject.set(x, "batchCount", js.undefined)
      
      inline def setBatchInterval(value: Double): Self = StObject.set(x, "batchInterval", value.asInstanceOf[js.Any])
      
      inline def setBatchIntervalUndefined: Self = StObject.set(x, "batchInterval", js.undefined)
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSsl(value: Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait StreamTransportInstance
    extends typings.winstonTransport.mod.^ {
    
    var eol: String = js.native
  }
  
  trait StreamTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var eol: js.UndefOr[String] = js.undefined
    
    var stream: WritableStream
  }
  object StreamTransportOptions {
    
    inline def apply(stream: WritableStream): StreamTransportOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transports extends StObject {
    
    var Console: ConsoleTransportInstance
    
    var ConsoleTransportOptions: typings.winston.libWinstonTransportsMod.ConsoleTransportOptions
    
    var File: FileTransportInstance
    
    var FileTransportOptions: typings.winston.libWinstonTransportsMod.FileTransportOptions
    
    var Http: HttpTransportInstance
    
    var HttpTransportOptions: typings.winston.libWinstonTransportsMod.HttpTransportOptions
    
    var Stream: StreamTransportInstance
    
    var StreamTransportOptions: typings.winston.libWinstonTransportsMod.StreamTransportOptions
  }
  object Transports {
    
    inline def apply(
      Console: ConsoleTransportInstance,
      ConsoleTransportOptions: ConsoleTransportOptions,
      File: FileTransportInstance,
      FileTransportOptions: FileTransportOptions,
      Http: HttpTransportInstance,
      HttpTransportOptions: HttpTransportOptions,
      Stream: StreamTransportInstance,
      StreamTransportOptions: StreamTransportOptions
    ): Transports = {
      val __obj = js.Dynamic.literal(Console = Console.asInstanceOf[js.Any], ConsoleTransportOptions = ConsoleTransportOptions.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileTransportOptions = FileTransportOptions.asInstanceOf[js.Any], Http = Http.asInstanceOf[js.Any], HttpTransportOptions = HttpTransportOptions.asInstanceOf[js.Any], Stream = Stream.asInstanceOf[js.Any], StreamTransportOptions = StreamTransportOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transports] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: ConsoleTransportInstance): Self = StObject.set(x, "Console", value.asInstanceOf[js.Any])
      
      inline def setConsoleTransportOptions(value: ConsoleTransportOptions): Self = StObject.set(x, "ConsoleTransportOptions", value.asInstanceOf[js.Any])
      
      inline def setFile(value: FileTransportInstance): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
      
      inline def setFileTransportOptions(value: FileTransportOptions): Self = StObject.set(x, "FileTransportOptions", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: HttpTransportInstance): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
      
      inline def setHttpTransportOptions(value: HttpTransportOptions): Self = StObject.set(x, "HttpTransportOptions", value.asInstanceOf[js.Any])
      
      inline def setStream(value: StreamTransportInstance): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
      
      inline def setStreamTransportOptions(value: StreamTransportOptions): Self = StObject.set(x, "StreamTransportOptions", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Transports
  
  /* This means you don't have to write `^`, but can instead just say `libWinstonTransportsMod.foo` */
  override def _to: Transports = ^
}
