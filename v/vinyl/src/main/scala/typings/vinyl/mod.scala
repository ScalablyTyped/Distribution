package typings.vinyl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.Stats
import typings.vinyl.anon.ConstructorOptionscontent
import typings.vinyl.anon.ConstructorOptionscontentBase
import typings.vinyl.anon.ConstructorOptionscontentDictcustomOption
import typings.vinyl.anon.Contents
import typings.vinyl.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vinyl", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FileConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("vinyl", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with NullFile {
    def this(options: ConstructorOptionscontent) = this()
  }
  
  // See https://github.com/Microsoft/TypeScript/issues/11796
  @js.native
  trait BufferFile
    extends StObject
       with File {
    
    @JSName("contents")
    var contents_BufferFile: Buffer = js.native
  }
  
  trait ConstructorOptions
    extends StObject
       with /* customProperty */ StringDictionary[Any] {
    
    /**
      * Used for relative pathing. Typically where a glob starts. Default: options.cwd
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * File contents.
      * Type: `Buffer`, `Stream`, or null
      * Default: null
      */
    var contents: js.UndefOr[Buffer | ReadableStream | Null] = js.undefined
    
    /**
      * The current working directory of the file. Default: process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Stores the path history. If `options.path` and `options.history` are both passed,
      * `options.path` is appended to `options.history`. All `options.history` paths are
      * normalized by the `file.path` setter.
      * Default: `[]` (or `[options.path]` if `options.path` is passed)
      */
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Full path to the file.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The result of an fs.stat call. This is how you mark the file as a directory or
      * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
      * https://nodejs.org/api/fs.html#fs_class_fs_stats
      */
    var stat: js.UndefOr[Stats] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setContents(value: Buffer | ReadableStream): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsNull: Self = StObject.set(x, "contents", null)
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  @js.native
  trait DirectoryFile
    extends StObject
       with NullFile
  
  @js.native
  trait File
    extends StObject
       with /* customProperty */ StringDictionary[Any] {
    
    //
    /**
      * Gets and sets base directory. Used for relative pathing (typically where a glob starts).
      * When `null` or `undefined`, it simply proxies the `file.cwd` property. Will always be
      * normalized and have trailing separators removed.
      *
      * Throws when set to any value other than non-empty strings or `null`/`undefined`.
      *
      * The setter's type is actually `string | null | undefined`, but TypeScript doesn't allow
      * get/set accessors to be of different type. The property is declared as `string` for the
      * compiler not to require useless null checks for the getter. (Hopefully, noone will need
      * to assign `null` to this property.)
      */
    var base: String = js.native
    
    /**
      * Gets and sets the basename of `file.path`.
      *
      * Throws when `file.path` is not set.
      *
      * Example:
      *
      * ```js
      * var file = new File({
      *   cwd: '/',
      *   base: '/test/',
      *   path: '/test/file.js'
      * });
      *
      * console.log(file.basename); // file.js
      *
      * file.basename = 'file.txt';
      *
      * console.log(file.basename); // file.txt
      * console.log(file.path); // /test/file.txt
      * ```
      */
    var basename: String = js.native
    
    def clone(opts: Boolean): this.type = js.native
    def clone(opts: Contents): this.type = js.native
    
    /**
      * Gets and sets the contents of the file. If set to a `Stream`, it is wrapped in
      * a `cloneable-readable` stream.
      *
      * Throws when set to any value other than a `Stream`, a `Buffer` or `null`.
      */
    var contents: Buffer | ReadableStream | Null = js.native
    
    /**
      * Gets and sets current working directory. Will always be normalized and have trailing
      * separators removed.
      *
      * Throws when set to any value other than non-empty strings.
      */
    var cwd: String = js.native
    
    /**
      * Gets and sets the dirname of `file.path`. Will always be normalized and have trailing
      * separators removed.
      *
      * Throws when `file.path` is not set.
      *
      * Example:
      *
      * ```js
      * var file = new File({
      *   cwd: '/',
      *   base: '/test/',
      *   path: '/test/file.js'
      * });
      *
      * console.log(file.dirname); // /test
      *
      * file.dirname = '/specs';
      *
      * console.log(file.dirname); // /specs
      * console.log(file.path); // /specs/file.js
      * ```
      */
    var dirname: String = js.native
    
    /**
      * Gets and sets extname of `file.path`.
      *
      * Throws when `file.path` is not set.
      *
      * Example:
      *
      * ```js
      * var file = new File({
      *   cwd: '/',
      *   base: '/test/',
      *   path: '/test/file.js'
      * });
      *
      * console.log(file.extname); // .js
      *
      * file.extname = '.txt';
      *
      * console.log(file.extname); // .txt
      * console.log(file.path); // /test/file.txt
      * ```
      */
    var extname: String = js.native
    
    /**
      * Array of `file.path` values the Vinyl object has had, from `file.history[0]` (original)
      * through `file.history[file.history.length - 1]` (current). `file.history` and its elements
      * should normally be treated as read-only and only altered indirectly by setting `file.path`.
      */
    val history: js.Array[String] = js.native
    
    /**
      * Returns a formatted-string interpretation of the Vinyl object.
      * Automatically called by node's `console.log`.
      */
    def inspect(): String = js.native
    
    /**
      * Returns `true` if the file contents are a `Buffer`, otherwise `false`.
      */
    def isBuffer(): /* is vinyl.vinyl.BufferFile */ Boolean = js.native
    
    /**
      * Returns `true` if the file represents a directory, otherwise `false`.
      *
      * A file is considered a directory when:
      *
      * - `file.isNull()` is `true`
      * - `file.stat` is an object
      * - `file.stat.isDirectory()` returns `true`
      *
      * When constructing a Vinyl object, pass in a valid `fs.Stats` object via `options.stat`.
      * If you are mocking the `fs.Stats` object, you may need to stub the `isDirectory()` method.
      */
    def isDirectory(): /* is vinyl.vinyl.DirectoryFile */ Boolean = js.native
    
    /**
      * Returns `true` if the file contents are `null`, otherwise `false`.
      */
    def isNull(): /* is vinyl.vinyl.NullFile */ Boolean = js.native
    
    /**
      * Returns `true` if the file contents are a `Stream`, otherwise `false`.
      */
    def isStream(): /* is vinyl.vinyl.StreamFile */ Boolean = js.native
    
    /**
      * Returns `true` if the file represents a symbolic link, otherwise `false`.
      *
      * A file is considered symbolic when:
      *
      * - `file.isNull()` is `true`
      * - `file.stat` is an object
      * - `file.stat.isSymbolicLink()` returns `true`
      *
      * When constructing a Vinyl object, pass in a valid `fs.Stats` object via `options.stat`.
      * If you are mocking the `fs.Stats` object, you may need to stub the `isSymbolicLink()` method.
      */
    def isSymbolic(): /* is vinyl.vinyl.SymbolicFile */ Boolean = js.native
    
    /**
      * Gets and sets the absolute pathname string or `undefined`. Setting to a different value
      * appends the new path to `file.history`. If set to the same value as the current path, it
      * is ignored. All new values are normalized and have trailing separators removed.
      *
      * Throws when set to any value other than a string.
      *
      * The getter is actually of type `string | undefined` whereas the setter is just `string`,
      * however TypeScript doesn't allow get/set accessors to be of different type. See the
      * comment for the `base` properties.
      */
    var path: String = js.native
    
    /**
      * @deprecated This method was removed in v2.0.
      * If file.contents is a Buffer, it will write it to the stream.
      * If file.contents is a Stream, it will pipe it to the stream.
      * If file.contents is null, it will do nothing.
      */
    def pipe[T /* <: WritableStream */](stream: T): T = js.native
    def pipe[T /* <: WritableStream */](stream: T, opts: End): T = js.native
    
    /**
      * Gets the result of `path.relative(file.base, file.path)`.
      *
      * Throws when set or when `file.path` is not set.
      *
      * Example:
      *
      * ```js
      * var file = new File({
      *   cwd: '/',
      *   base: '/test/',
      *   path: '/test/file.js'
      * });
      *
      * console.log(file.relative); // file.js
      * ```
      */
    var relative: String = js.native
    
    var stat: Stats | Null = js.native
    
    /**
      * Gets and sets stem (filename without suffix) of `file.path`.
      *
      * Throws when `file.path` is not set.
      *
      * Example:
      *
      * ```js
      * var file = new File({
      *   cwd: '/',
      *   base: '/test/',
      *   path: '/test/file.js'
      * });
      *
      * console.log(file.stem); // file
      *
      * file.stem = 'foo';
      *
      * console.log(file.stem); // foo
      * console.log(file.path); // /test/foo.js
      * ```
      */
    var stem: String = js.native
    
    /**
      * Gets and sets the path where the file points to if it's a symbolic link. Will always
      * be normalized and have trailing separators removed.
      *
      * Throws when set to any value other than a string.
      */
    var symlink: String | Null = js.native
  }
  
  @js.native
  trait FileConstructor
    extends StObject
       with Instantiable0[typings.std.File]
       with Instantiable1[
          (/* options */ ConstructorOptions) | (/* options */ ConstructorOptionscontent) | (/* options */ ConstructorOptionscontentBase) | (/* options */ ConstructorOptionscontentDictcustomOption), 
          BufferFile | typings.std.File | NullFile | StreamFile
        ] {
    
    /**
      * Checks if a property is not managed internally.
      */
    def isCustomProp(name: String): Boolean = js.native
    
    /**
      * Checks if a given object is a vinyl file.
      */
    def isVinyl(obj: Any): /* is std.File */ Boolean = js.native
  }
  
  @js.native
  trait NullFile
    extends StObject
       with File {
    
    @JSName("contents")
    var contents_NullFile: Null = js.native
  }
  
  @js.native
  trait StreamFile
    extends StObject
       with File {
    
    @JSName("contents")
    var contents_StreamFile: ReadableStream = js.native
  }
  
  @js.native
  trait SymbolicFile
    extends StObject
       with NullFile
  
  type _To = js.Object & FileConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & FileConstructor = ^
}
