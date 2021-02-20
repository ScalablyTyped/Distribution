package typings.winston

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.Agent
import typings.winston.anon.Bearer
import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod extends Shortcut {
  
  @JSImport("winston/lib/winston/transports", JSImport.Namespace)
  @js.native
  val ^ : Transports = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "Console")
  @js.native
  class Console () extends ConsoleTransportInstance {
    def this(options: ConsoleTransportOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "File")
  @js.native
  class File () extends FileTransportInstance {
    def this(options: FileTransportOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "Http")
  @js.native
  class Http () extends HttpTransportInstance {
    def this(options: HttpTransportOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("winston/lib/winston/transports", "Stream")
  @js.native
  class Stream () extends StreamTransportInstance {
    def this(options: StreamTransportOptions) = this()
  }
  
  @js.native
  trait ConsoleTransportInstance
    extends typings.winstonTransport.mod.^
       with Instantiable0[ConsoleTransportInstance]
       with Instantiable1[/* options */ ConsoleTransportOptions, ConsoleTransportInstance] {
    
    var eol: String = js.native
    
    var name: String = js.native
    
    var stderrLevels: js.Array[String] = js.native
  }
  
  @js.native
  trait ConsoleTransportOptions extends TransportStreamOptions {
    
    var consoleWarnLevels: js.UndefOr[js.Array[String]] = js.native
    
    var debugStdout: js.UndefOr[Boolean] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var stderrLevels: js.UndefOr[js.Array[String]] = js.native
  }
  object ConsoleTransportOptions {
    
    @scala.inline
    def apply(): ConsoleTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleTransportOptions]
    }
    
    @scala.inline
    implicit class ConsoleTransportOptionsMutableBuilder[Self <: ConsoleTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsoleWarnLevels(value: js.Array[String]): Self = StObject.set(x, "consoleWarnLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleWarnLevelsUndefined: Self = StObject.set(x, "consoleWarnLevels", js.undefined)
      
      @scala.inline
      def setConsoleWarnLevelsVarargs(value: String*): Self = StObject.set(x, "consoleWarnLevels", js.Array(value :_*))
      
      @scala.inline
      def setDebugStdout(value: Boolean): Self = StObject.set(x, "debugStdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugStdoutUndefined: Self = StObject.set(x, "debugStdout", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setStderrLevels(value: js.Array[String]): Self = StObject.set(x, "stderrLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrLevelsUndefined: Self = StObject.set(x, "stderrLevels", js.undefined)
      
      @scala.inline
      def setStderrLevelsVarargs(value: String*): Self = StObject.set(x, "stderrLevels", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FileTransportInstance
    extends typings.winstonTransport.mod.^
       with Instantiable0[FileTransportInstance]
       with Instantiable1[/* options */ FileTransportOptions, FileTransportInstance] {
    
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
  
  @js.native
  trait FileTransportOptions extends TransportStreamOptions {
    
    var dirname: js.UndefOr[String] = js.native
    
    var eol: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var maxFiles: js.UndefOr[Double] = js.native
    
    var maxsize: js.UndefOr[Double] = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    var rotationFormat: js.UndefOr[js.Function] = js.native
    
    var stream: js.UndefOr[WritableStream] = js.native
    
    var tailable: js.UndefOr[Boolean] = js.native
    
    var zippedArchive: js.UndefOr[Boolean] = js.native
  }
  object FileTransportOptions {
    
    @scala.inline
    def apply(): FileTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileTransportOptions]
    }
    
    @scala.inline
    implicit class FileTransportOptionsMutableBuilder[Self <: FileTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      @scala.inline
      def setMaxsize(value: Double): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxsizeUndefined: Self = StObject.set(x, "maxsize", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRotationFormat(value: js.Function): Self = StObject.set(x, "rotationFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationFormatUndefined: Self = StObject.set(x, "rotationFormat", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
      
      @scala.inline
      def setZippedArchive(value: Boolean): Self = StObject.set(x, "zippedArchive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZippedArchiveUndefined: Self = StObject.set(x, "zippedArchive", js.undefined)
    }
  }
  
  @js.native
  trait HttpTransportInstance
    extends typings.winstonTransport.mod.^
       with Instantiable0[HttpTransportInstance]
       with Instantiable1[/* options */ HttpTransportOptions, HttpTransportInstance] {
    
    var agent: js.UndefOr[Agent | Null] = js.native
    
    var auth: js.UndefOr[Bearer] = js.native
    
    var host: String = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var port: Double = js.native
    
    var ssl: Boolean = js.native
  }
  
  @js.native
  trait HttpTransportOptions extends TransportStreamOptions {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var auth: js.UndefOr[Bearer] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var ssl: js.UndefOr[js.Any] = js.native
  }
  object HttpTransportOptions {
    
    @scala.inline
    def apply(): HttpTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpTransportOptions]
    }
    
    @scala.inline
    implicit class HttpTransportOptionsMutableBuilder[Self <: HttpTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: Bearer): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSsl(value: js.Any): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  @js.native
  trait StreamTransportInstance
    extends typings.winstonTransport.mod.^
       with Instantiable0[StreamTransportInstance]
       with Instantiable1[/* options */ StreamTransportOptions, StreamTransportInstance] {
    
    var eol: String = js.native
  }
  
  @js.native
  trait StreamTransportOptions extends TransportStreamOptions {
    
    var eol: js.UndefOr[String] = js.native
    
    var stream: WritableStream = js.native
  }
  object StreamTransportOptions {
    
    @scala.inline
    def apply(stream: WritableStream): StreamTransportOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTransportOptions]
    }
    
    @scala.inline
    implicit class StreamTransportOptionsMutableBuilder[Self <: StreamTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transports extends StObject {
    
    var Console: ConsoleTransportInstance = js.native
    
    var ConsoleTransportOptions: typings.winston.transportsMod.ConsoleTransportOptions = js.native
    
    var File: FileTransportInstance = js.native
    
    var FileTransportOptions: typings.winston.transportsMod.FileTransportOptions = js.native
    
    var Http: HttpTransportInstance = js.native
    
    var HttpTransportOptions: typings.winston.transportsMod.HttpTransportOptions = js.native
    
    var Stream: StreamTransportInstance = js.native
    
    var StreamTransportOptions: typings.winston.transportsMod.StreamTransportOptions = js.native
  }
  object Transports {
    
    @scala.inline
    def apply(
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
    implicit class TransportsMutableBuilder[Self <: Transports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsole(value: ConsoleTransportInstance): Self = StObject.set(x, "Console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleTransportOptions(value: ConsoleTransportOptions): Self = StObject.set(x, "ConsoleTransportOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: FileTransportInstance): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTransportOptions(value: FileTransportOptions): Self = StObject.set(x, "FileTransportOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp(value: HttpTransportInstance): Self = StObject.set(x, "Http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpTransportOptions(value: HttpTransportOptions): Self = StObject.set(x, "HttpTransportOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: StreamTransportInstance): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamTransportOptions(value: StreamTransportOptions): Self = StObject.set(x, "StreamTransportOptions", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Transports
  
  /* This means you don't have to write `^`, but can instead just say `transportsMod.foo` */
  override def _to: Transports = ^
}
