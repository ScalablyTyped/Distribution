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
    * `options` is treated as:
    *
    * *   `string` or `Buffer` — `{value: options}`
    * *   `URL` — `{path: options}`
    * *   `VFile` — shallow copies its data over to the new file
    * *   `object` — all fields are shallow copied over to the new file
    *
    * Path related fields are set in the following order (least specific to
    * most specific): `history`, `path`, `basename`, `stem`, `extname`,
    * `dirname`.
    *
    * You cannot set `dirname` or `extname` without setting either `history`,
    * `path`, `basename`, or `stem` too.
    *
    * @param {Compatible | null | undefined} [value]
    *   File value.
    * @returns
    *   New instance.
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
      *
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be nullified (use `file.path = file.dirname` instead).
      */
    def basename_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Base of `path` (default: `process.cwd()` or `'/'` in browsers).
      *
      * @type {string}
      */
    var cwd: String = js.native
    
    /**
      * Place to store custom information (default: `{}`).
      *
      * It’s OK to store custom data directly on the file but moving it to
      * `data` is recommended.
      *
      * @type {Data}
      */
    var data: Data = js.native
    
    /**
      * Get the parent path (example: `'~'`).
      */
    def dirname: js.UndefOr[String] = js.native
    /**
      * Set the parent path (example: `'~'`).
      *
      * Cannot be set if there’s no `path` yet.
      */
    def dirname_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Get the extname (including dot) (example: `'.js'`).
      */
    def extname: js.UndefOr[String] = js.native
    /**
      * Set the extname (including dot) (example: `'.js'`).
      *
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be set if there’s no `path` yet.
      */
    def extname_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Create a fatal error associated with the file.
      *
      * Its `fatal` is set to `true` and `file` is set to the current file path.
      * Its added to `file.messages`.
      *
      * > 👉 **Note**: a fatal error means that a file is no longer processable.
      *
      * @param {string | Error | VFileMessage} reason
      *   Reason for message, uses the stack and message of the error if given.
      * @param {Node | NodeLike | Position | Point | null | undefined} [place]
      *   Place in file where the message occurred.
      * @param {string | null | undefined} [origin]
      *   Place in code where the message originates (example:
      *   `'my-package:my-rule'` or `'my-rule'`).
      * @returns {never}
      *   Message.
      * @throws {VFileMessage}
      *   Message.
      */
    def fail(
      reason: String | js.Error | VFileMessage,
      place: js.UndefOr[Node | NodeLike | Position | Point | Null],
      origin: js.UndefOr[String | Null]
    ): scala.Nothing = js.native
    
    /**
      * List of filepaths the file moved between.
      *
      * The first is the original path and the last is the current path.
      *
      * @type {Array<string>}
      */
    var history: js.Array[String] = js.native
    
    /**
      * Create an info message associated with the file.
      *
      * Its `fatal` is set to `null` and `file` is set to the current file path.
      * Its added to `file.messages`.
      *
      * @param {string | Error | VFileMessage} reason
      *   Reason for message, uses the stack and message of the error if given.
      * @param {Node | NodeLike | Position | Point | null | undefined} [place]
      *   Place in file where the message occurred.
      * @param {string | null | undefined} [origin]
      *   Place in code where the message originates (example:
      *   `'my-package:my-rule'` or `'my-rule'`).
      * @returns {VFileMessage}
      *   Message.
      */
    def info(
      reason: String | js.Error | VFileMessage,
      place: js.UndefOr[Node | NodeLike | Position | Point | Null],
      origin: js.UndefOr[String | Null]
    ): VFileMessage = js.native
    
    /**
      * Source map.
      *
      * This type is equivalent to the `RawSourceMap` type from the `source-map`
      * module.
      *
      * @type {Map | null | undefined}
      */
    var map: js.UndefOr[Map | Null] = js.native
    
    /**
      * Create a warning message associated with the file.
      *
      * Its `fatal` is set to `false` and `file` is set to the current file path.
      * Its added to `file.messages`.
      *
      * @param {string | Error | VFileMessage} reason
      *   Reason for message, uses the stack and message of the error if given.
      * @param {Node | NodeLike | Position | Point | null | undefined} [place]
      *   Place in file where the message occurred.
      * @param {string | null | undefined} [origin]
      *   Place in code where the message originates (example:
      *   `'my-package:my-rule'` or `'my-rule'`).
      * @returns {VFileMessage}
      *   Message.
      */
    def message(
      reason: String | js.Error | VFileMessage,
      place: js.UndefOr[Node | NodeLike | Position | Point | Null],
      origin: js.UndefOr[String | Null]
    ): VFileMessage = js.native
    
    /**
      * List of messages associated with the file.
      *
      * @type {Array<VFileMessage>}
      */
    var messages: js.Array[VFileMessage] = js.native
    
    /**
      * Get the full path (example: `'~/index.min.js'`).
      *
      * @returns {string}
      */
    def path: String = js.native
    /**
      * Set the full path (example: `'~/index.min.js'`).
      *
      * Cannot be nullified.
      * You can set a file URL (a `URL` object with a `file:` protocol) which will
      * be turned into a path with `url.fileURLToPath`.
      *
      * @param {string | URL} path
      */
    def path_=(arg: String): Unit = js.native
    
    /**
      * Custom, non-string, compiled, representation.
      *
      * This is used by unified to store non-string results.
      * One example is when turning markdown into React nodes.
      *
      * @type {unknown}
      */
    var result: Any = js.native
    
    /**
      * Get the stem (basename w/o extname) (example: `'index.min'`).
      */
    def stem: js.UndefOr[String] = js.native
    /**
      * Set the stem (basename w/o extname) (example: `'index.min'`).
      *
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be nullified (use `file.path = file.dirname` instead).
      */
    def stem_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Whether a file was saved to disk.
      *
      * This is used by vfile reporters.
      *
      * @type {boolean}
      */
    var stored: Boolean = js.native
    
    def toString(encoding: BufferEncoding): String = js.native
    
    /**
      * Raw value.
      *
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
    - typings.vfile.libMod.Options
    - typings.vfile.libMod.URL
    - typings.vfile.libMod.Value
    - typings.vfile.libMod.VFile
  */
  type Compatible = _Compatible | URL | Value
  
  type Data = typings.vfile.mod.Data
  
  trait Map extends StObject {
    
    /**
      *  The generated file this source map is associated with.
      */
    var file: String
    
    /**
      *  A string of base64 VLQs which contain the actual mappings.
      */
    var mappings: String
    
    /**
      *  An array of identifiers which can be referenced by individual mappings.
      */
    var names: js.Array[String]
    
    /**
      * The URL root from which all sources are relative.
      */
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    /**
      *  An array of URLs to the original source files.
      */
    var sources: js.Array[String]
    
    /**
      * An array of contents of the original source files.
      */
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  Which version of the source map spec this map is following.
      */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
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
  
  type Reporter[Settings /* <: ReporterSettings */] = js.Function2[/* files */ js.Array[VFile], /* options */ Settings, String]
  
  type ReporterSettings = Record[String, Any]
  
  type URL = typings.vfile.libMinurlDotsharedMod.URL
  
  trait VFileCoreOptions extends StObject {
    
    /**
      * Set `basename`.
      */
    var basename: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `cwd`.
      */
    var cwd: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `data`.
      */
    var data: js.UndefOr[Data | Null] = js.undefined
    
    /**
      * Set `dirname`.
      */
    var dirname: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `extname`.
      */
    var extname: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `history`.
      */
    var history: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Set `path`.
      */
    var path: js.UndefOr[URL | String | Null] = js.undefined
    
    /**
      * Set `stem`.
      */
    var stem: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `value`.
      */
    var value: js.UndefOr[Value | Null] = js.undefined
  }
  object VFileCoreOptions {
    
    inline def apply(): VFileCoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VFileCoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VFileCoreOptions] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameNull: Self = StObject.set(x, "basename", null)
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdNull: Self = StObject.set(x, "cwd", null)
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameNull: Self = StObject.set(x, "dirname", null)
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      inline def setExtnameNull: Self = StObject.set(x, "extname", null)
      
      inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryNull: Self = StObject.set(x, "history", null)
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setPath(value: URL | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      inline def setStemNull: Self = StObject.set(x, "stem", null)
      
      inline def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Value = typings.vfile.mod.Value
  
  trait _Compatible extends StObject
}
