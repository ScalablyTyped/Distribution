package typings.vfile

import typings.std.Record
import typings.std.URL
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
    * *   `string` or `Uint8Array` — `{value: options}`
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
  open class VFile () extends StObject {
    def this(value: Compatible) = this()
    
    /**
      * Get the basename (including extname) (example: `'index.min.js'`).
      *
      * @returns {string | undefined}
      *   Basename.
      */
    def basename: js.UndefOr[String] = js.native
    /**
      * Set basename (including extname) (`'index.min.js'`).
      *
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be nullified (use `file.path = file.dirname` instead).
      *
      * @param {string} basename
      *   Basename.
      * @returns {undefined}
      *   Nothing.
      */
    def basename_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Base of `path` (default: `process.cwd()` or `'/'` in browsers).
      *
      * @type {string}
      */
    var cwd: String = js.native
    
    /**
      * Place to store custom info (default: `{}`).
      *
      * It’s OK to store custom data directly on the file but moving it to
      * `data` is recommended.
      *
      * @type {Data}
      */
    var data: Data = js.native
    
    /**
      * Get the parent path (example: `'~'`).
      *
      * @returns {string | undefined}
      *   Dirname.
      */
    def dirname: js.UndefOr[String] = js.native
    /**
      * Set the parent path (example: `'~'`).
      *
      * Cannot be set if there’s no `path` yet.
      *
      * @param {string | undefined} dirname
      *   Dirname.
      * @returns {undefined}
      *   Nothing.
      */
    def dirname_=(arg: js.UndefOr[String]): Unit = js.native
    
    /**
      * Get the extname (including dot) (example: `'.js'`).
      *
      * @returns {string | undefined}
      *   Extname.
      */
    def extname: js.UndefOr[String] = js.native
    /**
      * Set the extname (including dot) (example: `'.js'`).
      *
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be set if there’s no `path` yet.
      *
      * @param {string | undefined} extname
      *   Extname.
      * @returns {undefined}
      *   Nothing.
      */
    def extname_=(arg: js.UndefOr[String]): Unit = js.native
    
    def fail(cause: js.Error): scala.Nothing = js.native
    def fail(cause: js.Error, origin: String): scala.Nothing = js.native
    def fail(cause: js.Error, parent: Null, origin: String): scala.Nothing = js.native
    def fail(cause: js.Error, parent: Unit, origin: String): scala.Nothing = js.native
    def fail(cause: js.Error, parent: Node): scala.Nothing = js.native
    def fail(cause: js.Error, parent: NodeLike): scala.Nothing = js.native
    def fail(cause: js.Error, parent: NodeLike, origin: String): scala.Nothing = js.native
    def fail(cause: js.Error, parent: Node, origin: String): scala.Nothing = js.native
    def fail(cause: js.Error, place: Point): scala.Nothing = js.native
    def fail(cause: js.Error, place: Point, origin: String): scala.Nothing = js.native
    def fail(cause: js.Error, place: Position): scala.Nothing = js.native
    def fail(cause: js.Error, place: Position, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage): scala.Nothing = js.native
    def fail(cause: VFileMessage, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage, parent: Null, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage, parent: Unit, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage, parent: Node): scala.Nothing = js.native
    def fail(cause: VFileMessage, parent: NodeLike): scala.Nothing = js.native
    def fail(cause: VFileMessage, parent: NodeLike, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage, parent: Node, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage, place: Point): scala.Nothing = js.native
    def fail(cause: VFileMessage, place: Point, origin: String): scala.Nothing = js.native
    def fail(cause: VFileMessage, place: Position): scala.Nothing = js.native
    def fail(cause: VFileMessage, place: Position, origin: String): scala.Nothing = js.native
    def fail(reason: String): scala.Nothing = js.native
    def fail(reason: String, options: MessageOptions): scala.Nothing = js.native
    def fail(reason: String, origin: String): scala.Nothing = js.native
    def fail(reason: String, parent: Null, origin: String): scala.Nothing = js.native
    def fail(reason: String, parent: Unit, origin: String): scala.Nothing = js.native
    def fail(reason: String, parent: Node): scala.Nothing = js.native
    def fail(reason: String, parent: NodeLike): scala.Nothing = js.native
    def fail(reason: String, parent: NodeLike, origin: String): scala.Nothing = js.native
    def fail(reason: String, parent: Node, origin: String): scala.Nothing = js.native
    def fail(reason: String, place: Point): scala.Nothing = js.native
    def fail(reason: String, place: Point, origin: String): scala.Nothing = js.native
    def fail(reason: String, place: Position): scala.Nothing = js.native
    def fail(reason: String, place: Position, origin: String): scala.Nothing = js.native
    
    /**
      * List of file paths the file moved between.
      *
      * The first is the original path and the last is the current path.
      *
      * @type {Array<string>}
      */
    var history: js.Array[String] = js.native
    
    def info(cause: js.Error): VFileMessage = js.native
    def info(cause: js.Error, origin: String): VFileMessage = js.native
    def info(cause: js.Error, parent: Null, origin: String): VFileMessage = js.native
    def info(cause: js.Error, parent: Unit, origin: String): VFileMessage = js.native
    def info(cause: js.Error, parent: Node): VFileMessage = js.native
    def info(cause: js.Error, parent: NodeLike): VFileMessage = js.native
    def info(cause: js.Error, parent: NodeLike, origin: String): VFileMessage = js.native
    def info(cause: js.Error, parent: Node, origin: String): VFileMessage = js.native
    def info(cause: js.Error, place: Point): VFileMessage = js.native
    def info(cause: js.Error, place: Point, origin: String): VFileMessage = js.native
    def info(cause: js.Error, place: Position): VFileMessage = js.native
    def info(cause: js.Error, place: Position, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage): VFileMessage = js.native
    def info(cause: VFileMessage, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage, parent: Null, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage, parent: Unit, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage, parent: Node): VFileMessage = js.native
    def info(cause: VFileMessage, parent: NodeLike): VFileMessage = js.native
    def info(cause: VFileMessage, parent: NodeLike, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage, parent: Node, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage, place: Point): VFileMessage = js.native
    def info(cause: VFileMessage, place: Point, origin: String): VFileMessage = js.native
    def info(cause: VFileMessage, place: Position): VFileMessage = js.native
    def info(cause: VFileMessage, place: Position, origin: String): VFileMessage = js.native
    def info(reason: String): VFileMessage = js.native
    def info(reason: String, options: MessageOptions): VFileMessage = js.native
    def info(reason: String, origin: String): VFileMessage = js.native
    def info(reason: String, parent: Null, origin: String): VFileMessage = js.native
    def info(reason: String, parent: Unit, origin: String): VFileMessage = js.native
    def info(reason: String, parent: Node): VFileMessage = js.native
    def info(reason: String, parent: NodeLike): VFileMessage = js.native
    def info(reason: String, parent: NodeLike, origin: String): VFileMessage = js.native
    def info(reason: String, parent: Node, origin: String): VFileMessage = js.native
    def info(reason: String, place: Point): VFileMessage = js.native
    def info(reason: String, place: Point, origin: String): VFileMessage = js.native
    def info(reason: String, place: Position): VFileMessage = js.native
    def info(reason: String, place: Position, origin: String): VFileMessage = js.native
    
    /**
      * Source map.
      *
      * This type is equivalent to the `RawSourceMap` type from the `source-map`
      * module.
      *
      * @type {Map | null | undefined}
      */
    var map: js.UndefOr[Map | Null] = js.native
    
    def message(cause: js.Error): VFileMessage = js.native
    def message(cause: js.Error, origin: String): VFileMessage = js.native
    def message(cause: js.Error, parent: Null, origin: String): VFileMessage = js.native
    def message(cause: js.Error, parent: Unit, origin: String): VFileMessage = js.native
    def message(cause: js.Error, parent: Node): VFileMessage = js.native
    def message(cause: js.Error, parent: NodeLike): VFileMessage = js.native
    def message(cause: js.Error, parent: NodeLike, origin: String): VFileMessage = js.native
    def message(cause: js.Error, parent: Node, origin: String): VFileMessage = js.native
    def message(cause: js.Error, place: Point): VFileMessage = js.native
    def message(cause: js.Error, place: Point, origin: String): VFileMessage = js.native
    def message(cause: js.Error, place: Position): VFileMessage = js.native
    def message(cause: js.Error, place: Position, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage): VFileMessage = js.native
    def message(cause: VFileMessage, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage, parent: Null, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage, parent: Unit, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage, parent: Node): VFileMessage = js.native
    def message(cause: VFileMessage, parent: NodeLike): VFileMessage = js.native
    def message(cause: VFileMessage, parent: NodeLike, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage, parent: Node, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage, place: Point): VFileMessage = js.native
    def message(cause: VFileMessage, place: Point, origin: String): VFileMessage = js.native
    def message(cause: VFileMessage, place: Position): VFileMessage = js.native
    def message(cause: VFileMessage, place: Position, origin: String): VFileMessage = js.native
    def message(reason: String): VFileMessage = js.native
    def message(reason: String, options: MessageOptions): VFileMessage = js.native
    def message(reason: String, origin: String): VFileMessage = js.native
    def message(reason: String, parent: Null, origin: String): VFileMessage = js.native
    def message(reason: String, parent: Unit, origin: String): VFileMessage = js.native
    def message(reason: String, parent: Node): VFileMessage = js.native
    def message(reason: String, parent: NodeLike): VFileMessage = js.native
    def message(reason: String, parent: NodeLike, origin: String): VFileMessage = js.native
    def message(reason: String, parent: Node, origin: String): VFileMessage = js.native
    def message(reason: String, place: Point): VFileMessage = js.native
    def message(reason: String, place: Point, origin: String): VFileMessage = js.native
    def message(reason: String, place: Position): VFileMessage = js.native
    def message(reason: String, place: Position, origin: String): VFileMessage = js.native
    
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
      *   Path.
      */
    def path: String = js.native
    /**
      * Set the full path (example: `'~/index.min.js'`).
      *
      * Cannot be nullified.
      * You can set a file URL (a `URL` object with a `file:` protocol) which will
      * be turned into a path with `url.fileURLToPath`.
      *
      * @param {URL | string} path
      *   Path.
      * @returns {undefined}
      *   Nothing.
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
      *
      * @returns {string | undefined}
      *   Stem.
      */
    def stem: js.UndefOr[String] = js.native
    /**
      * Set the stem (basename w/o extname) (example: `'index.min'`).
      *
      * Cannot contain path separators (`'/'` on unix, macOS, and browsers, `'\'`
      * on windows).
      * Cannot be nullified (use `file.path = file.dirname` instead).
      *
      * @param {string} stem
      *   Stem.
      * @returns {undefined}
      *   Nothing.
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
    
    def toString(encoding: String): String = js.native
    
    /**
      * Raw value.
      *
      * @type {Value}
      */
    var value: Value = js.native
  }
  
  type Compatible = Options | URL | VFile | Value
  
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
  
  type MessageOptions = typings.vfileMessage.mod.Options
  
  type Node = typings.unist.mod.Node[typings.unist.mod.Data]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait NodeLike extends StObject {
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: String
  }
  object NodeLike {
    
    inline def apply(`type`: String): NodeLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLike] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = (Record[String, Any]) & VFileCoreOptions
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
  
  type Reporter[Settings] = js.Function2[/* files */ js.Array[VFile], /* options */ Settings, String]
  
  type ReporterSettings = Record[String, Any]
  
  trait VFileCoreOptions extends StObject {
    
    /**
      * Set `basename` (name).
      */
    var basename: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `cwd` (working directory).
      */
    var cwd: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `data` (associated info).
      */
    var data: js.UndefOr[Data | Null] = js.undefined
    
    /**
      * Set `dirname` (path w/o basename).
      */
    var dirname: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `extname` (extension with dot).
      */
    var extname: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `history` (paths the file moved between).
      */
    var history: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Set `path` (current path).
      */
    var path: js.UndefOr[URL | String | Null] = js.undefined
    
    /**
      * Set `stem` (name without extension).
      */
    var stem: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Set `value` (the contents of the file).
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
}
