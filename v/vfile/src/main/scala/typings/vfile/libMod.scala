package typings.vfile

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.vfileMessage.mod.VFileMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("vfile/lib", "VFile")
  @js.native
  /**
    * Create a new virtual file.
    *
    * If `options` is `string` or `Buffer`, it’s treated as `{value: options}`.
    * If `options` is a `URL`, it’s treated as `{path: options}`.
    * If `options` is a `VFile`, shallow copies its data over to the new file.
    * All fields in `options` are set on the newly created `VFile`.
    *
    * Path related fields are set in the following order (least specific to
    * most specific): `history`, `path`, `basename`, `stem`, `extname`,
    * `dirname`.
    *
    * It’s not possible to set either `dirname` or `extname` without setting
    * either `history`, `path`, `basename`, or `stem` as well.
    *
    * @param {Compatible} [value]
    */
  open class VFile ()
    extends StObject
       with _Compatible {
    def this(value: Compatible) = this()
    
    /**
      * Get the basename (including extname) (example: `'index.min.js'`).
      */
    def basename: js.UndefOr[String] = js.native
    /**
      * Set basename (including extname) (`'index.min.js'`).
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be nullified (use `file.path = file.dirname` instead).
      */
    def basename_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Base of `path` (default: `process.cwd()` or `'/'` in browsers).
      * @type {string}
      */
    var cwd: String = js.native
    
    /**
      * Place to store custom information (default: `{}`).
      * It’s OK to store custom data directly on the file but moving it to
      * `data` is recommended.
      * @type {Data}
      */
    var data: Data = js.native
    
    /**
      * Get the parent path (example: `'~'`).
      */
    def dirname: js.UndefOr[String] = js.native
    /**
      * Set the parent path (example: `'~'`).
      * Cannot be set if there’s no `path` yet.
      */
    def dirname_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Get the extname (including dot) (example: `'.js'`).
      */
    def extname: js.UndefOr[String] = js.native
    /**
      * Set the extname (including dot) (example: `'.js'`).
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be set if there’s no `path` yet.
      */
    def extname_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Like `VFile#message()`, but associates a fatal message where `fatal` is
      * set to `true`, and then immediately throws it.
      *
      * > 👉 **Note**: a fatal error means that a file is no longer processable.
      *
      * @param {string|Error} reason
      *   Human readable reason for the message, uses the stack and message of the error if given.
      * @param {Node|NodeLike|Position|Point} [place]
      *   Place where the message occurred in the file.
      * @param {string} [origin]
      *   Computer readable reason for the message
      * @returns {never}
      *   Message.
      */
    def fail(reason: String): scala.Nothing = js.native
    def fail(reason: String, place: Unit, origin: String): scala.Nothing = js.native
    def fail(reason: String, place: typings.unist.mod.Node[typings.unist.mod.Data]): scala.Nothing = js.native
    def fail(reason: String, place: typings.unist.mod.Node[typings.unist.mod.Data], origin: String): scala.Nothing = js.native
    def fail(reason: String, place: typings.unist.mod.Point): scala.Nothing = js.native
    def fail(reason: String, place: typings.unist.mod.Point, origin: String): scala.Nothing = js.native
    def fail(reason: String, place: typings.unist.mod.Position): scala.Nothing = js.native
    def fail(reason: String, place: typings.unist.mod.Position, origin: String): scala.Nothing = js.native
    def fail(reason: String, place: NodeLike): scala.Nothing = js.native
    def fail(reason: String, place: NodeLike, origin: String): scala.Nothing = js.native
    def fail(reason: js.Error): scala.Nothing = js.native
    def fail(reason: js.Error, place: Unit, origin: String): scala.Nothing = js.native
    def fail(reason: js.Error, place: typings.unist.mod.Node[typings.unist.mod.Data]): scala.Nothing = js.native
    def fail(reason: js.Error, place: typings.unist.mod.Node[typings.unist.mod.Data], origin: String): scala.Nothing = js.native
    def fail(reason: js.Error, place: typings.unist.mod.Point): scala.Nothing = js.native
    def fail(reason: js.Error, place: typings.unist.mod.Point, origin: String): scala.Nothing = js.native
    def fail(reason: js.Error, place: typings.unist.mod.Position): scala.Nothing = js.native
    def fail(reason: js.Error, place: typings.unist.mod.Position, origin: String): scala.Nothing = js.native
    def fail(reason: js.Error, place: NodeLike): scala.Nothing = js.native
    def fail(reason: js.Error, place: NodeLike, origin: String): scala.Nothing = js.native
    
    /**
      * List of filepaths the file moved between.
      * The first is the original path and the last is the current path.
      * @type {Array<string>}
      */
    var history: js.Array[String] = js.native
    
    /**
      * Like `VFile#message()`, but associates an informational message where
      * `fatal` is set to `null`.
      *
      * @param {string|Error} reason
      *   Human readable reason for the message, uses the stack and message of the error if given.
      * @param {Node|NodeLike|Position|Point} [place]
      *   Place where the message occurred in the file.
      * @param {string} [origin]
      *   Computer readable reason for the message
      * @returns {VFileMessage}
      *   Message.
      */
    def info(reason: String): VFileMessage = js.native
    def info(reason: String, place: Unit, origin: String): VFileMessage = js.native
    def info(reason: String, place: typings.unist.mod.Node[typings.unist.mod.Data]): VFileMessage = js.native
    def info(reason: String, place: typings.unist.mod.Node[typings.unist.mod.Data], origin: String): VFileMessage = js.native
    def info(reason: String, place: typings.unist.mod.Point): VFileMessage = js.native
    def info(reason: String, place: typings.unist.mod.Point, origin: String): VFileMessage = js.native
    def info(reason: String, place: typings.unist.mod.Position): VFileMessage = js.native
    def info(reason: String, place: typings.unist.mod.Position, origin: String): VFileMessage = js.native
    def info(reason: String, place: NodeLike): VFileMessage = js.native
    def info(reason: String, place: NodeLike, origin: String): VFileMessage = js.native
    def info(reason: js.Error): VFileMessage = js.native
    def info(reason: js.Error, place: Unit, origin: String): VFileMessage = js.native
    def info(reason: js.Error, place: typings.unist.mod.Node[typings.unist.mod.Data]): VFileMessage = js.native
    def info(reason: js.Error, place: typings.unist.mod.Node[typings.unist.mod.Data], origin: String): VFileMessage = js.native
    def info(reason: js.Error, place: typings.unist.mod.Point): VFileMessage = js.native
    def info(reason: js.Error, place: typings.unist.mod.Point, origin: String): VFileMessage = js.native
    def info(reason: js.Error, place: typings.unist.mod.Position): VFileMessage = js.native
    def info(reason: js.Error, place: typings.unist.mod.Position, origin: String): VFileMessage = js.native
    def info(reason: js.Error, place: NodeLike): VFileMessage = js.native
    def info(reason: js.Error, place: NodeLike, origin: String): VFileMessage = js.native
    
    /**
      * Sometimes files have a source map associated with them.
      * This can be stored in the `map` field.
      * This should be a `Map` type, which is equivalent to the `RawSourceMap`
      * type from the `source-map` module.
      * @type {Map|undefined}
      */
    var map: js.UndefOr[Map] = js.native
    
    /**
      * Constructs a new `VFileMessage`, where `fatal` is set to `false`, and
      * associates it with the file by adding it to `vfile.messages` and setting
      * `message.file` to the current filepath.
      *
      * @param {string|Error} reason
      *   Human readable reason for the message, uses the stack and message of the error if given.
      * @param {Node|NodeLike|Position|Point} [place]
      *   Place where the message occurred in the file.
      * @param {string} [origin]
      *   Computer readable reason for the message
      * @returns {VFileMessage}
      *   Message.
      */
    def message(reason: String): VFileMessage = js.native
    def message(reason: String, place: Unit, origin: String): VFileMessage = js.native
    def message(reason: String, place: typings.unist.mod.Node[typings.unist.mod.Data]): VFileMessage = js.native
    def message(reason: String, place: typings.unist.mod.Node[typings.unist.mod.Data], origin: String): VFileMessage = js.native
    def message(reason: String, place: typings.unist.mod.Point): VFileMessage = js.native
    def message(reason: String, place: typings.unist.mod.Point, origin: String): VFileMessage = js.native
    def message(reason: String, place: typings.unist.mod.Position): VFileMessage = js.native
    def message(reason: String, place: typings.unist.mod.Position, origin: String): VFileMessage = js.native
    def message(reason: String, place: NodeLike): VFileMessage = js.native
    def message(reason: String, place: NodeLike, origin: String): VFileMessage = js.native
    def message(reason: js.Error): VFileMessage = js.native
    def message(reason: js.Error, place: Unit, origin: String): VFileMessage = js.native
    def message(reason: js.Error, place: typings.unist.mod.Node[typings.unist.mod.Data]): VFileMessage = js.native
    def message(reason: js.Error, place: typings.unist.mod.Node[typings.unist.mod.Data], origin: String): VFileMessage = js.native
    def message(reason: js.Error, place: typings.unist.mod.Point): VFileMessage = js.native
    def message(reason: js.Error, place: typings.unist.mod.Point, origin: String): VFileMessage = js.native
    def message(reason: js.Error, place: typings.unist.mod.Position): VFileMessage = js.native
    def message(reason: js.Error, place: typings.unist.mod.Position, origin: String): VFileMessage = js.native
    def message(reason: js.Error, place: NodeLike): VFileMessage = js.native
    def message(reason: js.Error, place: NodeLike, origin: String): VFileMessage = js.native
    
    /**
      * List of messages associated with the file.
      * @type {Array<VFileMessage>}
      */
    var messages: js.Array[VFileMessage] = js.native
    
    /**
      * Get the full path (example: `'~/index.min.js'`).
      * @returns {string}
      */
    def path: String = js.native
    /**
      * Set the full path (example: `'~/index.min.js'`).
      * Cannot be nullified.
      * You can set a file URL (a `URL` object with a `file:` protocol) which will
      * be turned into a path with `url.fileURLToPath`.
      * @param {string|URL} path
      */
    def path_=(arg: String): Unit = js.native
    
    /**
      * Sometimes files have a non-string, compiled, representation.
      * This can be stored in the `result` field.
      * One example is when turning markdown into React nodes.
      * This is used by unified to store non-string results.
      * @type {unknown}
      */
    var result: Any = js.native
    
    /**
      * Get the stem (basename w/o extname) (example: `'index.min'`).
      */
    def stem: js.UndefOr[String] = js.native
    /**
      * Set the stem (basename w/o extname) (example: `'index.min'`).
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be nullified (use `file.path = file.dirname` instead).
      */
    def stem_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Whether a file was saved to disk.
      * This is used by vfile reporters.
      * @type {boolean}
      */
    var stored: Boolean = js.native
    
    def toString(encoding: BufferEncoding): String = js.native
    
    /**
      * Raw value.
      * @type {Value}
      */
    var value: Value = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vfile.vfileStrings.ascii
    - typings.vfile.vfileStrings.utf8
    - typings.vfile.vfileStrings.`utf-8`
    - typings.vfile.vfileStrings.utf16le
    - typings.vfile.vfileStrings.ucs2
    - typings.vfile.vfileStrings.`ucs-2`
    - typings.vfile.vfileStrings.base64
    - typings.vfile.vfileStrings.base64url
    - typings.vfile.vfileStrings.latin1
    - typings.vfile.vfileStrings.binary
    - typings.vfile.vfileStrings.hex
  */
  trait BufferEncoding extends StObject
  object BufferEncoding {
    
    inline def ascii: typings.vfile.vfileStrings.ascii = "ascii".asInstanceOf[typings.vfile.vfileStrings.ascii]
    
    inline def base64: typings.vfile.vfileStrings.base64 = "base64".asInstanceOf[typings.vfile.vfileStrings.base64]
    
    inline def base64url: typings.vfile.vfileStrings.base64url = "base64url".asInstanceOf[typings.vfile.vfileStrings.base64url]
    
    inline def binary: typings.vfile.vfileStrings.binary = "binary".asInstanceOf[typings.vfile.vfileStrings.binary]
    
    inline def hex: typings.vfile.vfileStrings.hex = "hex".asInstanceOf[typings.vfile.vfileStrings.hex]
    
    inline def latin1: typings.vfile.vfileStrings.latin1 = "latin1".asInstanceOf[typings.vfile.vfileStrings.latin1]
    
    inline def `ucs-2`: typings.vfile.vfileStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.vfile.vfileStrings.`ucs-2`]
    
    inline def ucs2: typings.vfile.vfileStrings.ucs2 = "ucs2".asInstanceOf[typings.vfile.vfileStrings.ucs2]
    
    inline def `utf-8`: typings.vfile.vfileStrings.`utf-8` = "utf-8".asInstanceOf[typings.vfile.vfileStrings.`utf-8`]
    
    inline def utf16le: typings.vfile.vfileStrings.utf16le = "utf16le".asInstanceOf[typings.vfile.vfileStrings.utf16le]
    
    inline def utf8: typings.vfile.vfileStrings.utf8 = "utf8".asInstanceOf[typings.vfile.vfileStrings.utf8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vfile.libMod.Value
    - typings.vfile.libMod.Options
    - typings.vfile.libMod.VFile
    - typings.vfile.libMod.URL
  */
  type Compatible = _Compatible | Value | URL
  
  type Data = typings.vfile.mod.Data
  
  trait Map extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: Double
  }
  object Map {
    
    inline def apply(
      file: String,
      mappings: String,
      names: js.Array[String],
      sources: js.Array[String],
      version: Double
    ): Map = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = typings.unist.mod.Node[typings.unist.mod.Data]
  
  type NodeLike = (Record[String, Any]) & typings.vfile.anon.Position
  
  trait Options
    extends StObject
       with VFileCoreOptions
       with /* key */ StringDictionary[Any]
       with _Compatible
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
  
  type Reporter = js.Function2[/* files */ js.Array[VFile], /* options */ ReporterSettings, String]
  
  type ReporterSettings = Record[String, Any]
  
  type URL = typings.vfile.minurlSharedMod.URL
  
  trait VFileCoreOptions extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[typings.vfile.mod.Data] = js.undefined
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String | typings.vfile.minurlSharedMod.URL] = js.undefined
    
    var stem: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[typings.vfile.mod.Value] = js.undefined
  }
  object VFileCoreOptions {
    
    inline def apply(): VFileCoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VFileCoreOptions]
    }
    
    extension [Self <: VFileCoreOptions](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setData(value: typings.vfile.mod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setPath(value: String | typings.vfile.minurlSharedMod.URL): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      inline def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
      
      inline def setValue(value: typings.vfile.mod.Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Value = typings.vfile.mod.Value
  
  trait _Compatible extends StObject
}
