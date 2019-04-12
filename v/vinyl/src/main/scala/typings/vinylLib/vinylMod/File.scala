package typings
package vinylLib.vinylMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File
  extends /* customProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var base: java.lang.String = js.native
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
  var basename: java.lang.String = js.native
  /**
    * Gets and sets the contents of the file. If set to a `Stream`, it is wrapped in
    * a `cloneable-readable` stream.
    *
    * Throws when set to any value other than a `Stream`, a `Buffer` or `null`.
    */
  var contents: nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream | scala.Null = js.native
  /**
    * Gets and sets current working directory. Will always be normalized and have trailing
    * separators removed.
    *
    * Throws when set to any value other than non-empty strings.
    */
  var cwd: java.lang.String = js.native
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
  var dirname: java.lang.String = js.native
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
  var extname: java.lang.String = js.native
  /**
    * Array of `file.path` values the Vinyl object has had, from `file.history[0]` (original)
    * through `file.history[file.history.length - 1]` (current). `file.history` and its elements
    * should normally be treated as read-only and only altered indirectly by setting `file.path`.
    */
  val history: js.Array[java.lang.String] = js.native
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
  var path: java.lang.String = js.native
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
  var relative: java.lang.String = js.native
  var stat: nodeLib.fsMod.Stats | scala.Null = js.native
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
  var stem: java.lang.String = js.native
  /**
    * Gets and sets the path where the file points to if it's a symbolic link. Will always
    * be normalized and have trailing separators removed.
    *
    * Throws when set to any value other than a string.
    */
  var symlink: java.lang.String | scala.Null = js.native
  def clone(opts: scala.Boolean): this.type = js.native
  def clone(opts: vinylLib.Anon_ContentsDeep): this.type = js.native
  /**
    * Returns a formatted-string interpretation of the Vinyl object.
    * Automatically called by node's `console.log`.
    */
  def inspect(): java.lang.String = js.native
  /**
    * Returns `true` if the file contents are a `Buffer`, otherwise `false`.
    */
  def isBuffer(): /* is vinyl.vinyl.File.BufferFile */ scala.Boolean = js.native
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
  def isDirectory(): /* is vinyl.vinyl.File.DirectoryFile */ scala.Boolean = js.native
  /**
    * Returns `true` if the file contents are `null`, otherwise `false`.
    */
  def isNull(): /* is vinyl.vinyl.File.NullFile */ scala.Boolean = js.native
  /**
    * Returns `true` if the file contents are a `Stream`, otherwise `false`.
    */
  def isStream(): /* is vinyl.vinyl.File.StreamFile */ scala.Boolean = js.native
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
  def isSymbolic(): /* is vinyl.vinyl.File.SymbolicFile */ scala.Boolean = js.native
  /**
    * @deprecated This method was removed in v2.0.
    * If file.contents is a Buffer, it will write it to the stream.
    * If file.contents is a Stream, it will pipe it to the stream.
    * If file.contents is null, it will do nothing.
    */
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](stream: T): T = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](stream: T, opts: vinylLib.Anon_End): T = js.native
}

