package typings.vscode.mod

import typings.vscode.anon.Authority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Uri")
@js.native
class Uri protected ()
  extends StObject
     with ConfigurationScope {
  /**
    * Use the `file` and `parse` factory functions to create new `Uri` objects.
    */
  /* private */ def this(scheme: String, authority: String, path: String, query: String, fragment: String) = this()
  
  /**
    * Authority is the `www.msft.com` part of `http://www.msft.com/some/path?query#fragment`.
    * The part between the first double slashes and the next slash.
    */
  val authority: String = js.native
  
  /**
    * Fragment is the `fragment` part of `http://www.msft.com/some/path?query#fragment`.
    */
  val fragment: String = js.native
  
  /**
    * The string representing the corresponding file system path of this Uri.
    *
    * Will handle UNC paths and normalize windows drive letters to lower-case. Also
    * uses the platform specific path separator.
    *
    * * Will *not* validate the path for invalid characters and semantics.
    * * Will *not* look at the scheme of this Uri.
    * * The resulting string shall *not* be used for display purposes but
    * for disk operations, like `readFile` et al.
    *
    * The *difference* to the [`path`](#Uri.path)-property is the use of the platform specific
    * path separator and the handling of UNC paths. The sample below outlines the difference:
    * ```ts
    const u = URI.parse('file://server/c$/folder/file.txt')
    u.authority === 'server'
    u.path === '/shares/c$/file.txt'
    u.fsPath === '\\server\c$\folder\file.txt'
    ```
    */
  val fsPath: String = js.native
  
  /**
    * Path is the `/some/path` part of `http://www.msft.com/some/path?query#fragment`.
    */
  val path: String = js.native
  
  /**
    * Query is the `query` part of `http://www.msft.com/some/path?query#fragment`.
    */
  val query: String = js.native
  
  /**
    * Scheme is the `http` part of `http://www.msft.com/some/path?query#fragment`.
    * The part before the first colon.
    */
  val scheme: String = js.native
  
  /**
    * Returns a JSON representation of this Uri.
    *
    * @return An object.
    */
  def toJSON(): js.Any = js.native
  
  def toString(skipEncoding: Boolean): String = js.native
  
  /**
    * Derive a new Uri from this Uri.
    *
    * ```ts
    * let file = Uri.parse('before:some/file/path');
    * let other = file.with({ scheme: 'after' });
    * assert.ok(other.toString() === 'after:some/file/path');
    * ```
    *
    * @param change An object that describes a change to this Uri. To unset components use `null` or
    *  the empty string.
    * @return A new Uri that reflects the given change. Will return `this` Uri if the change
    *  is not changing anything.
    */
  def `with`(change: Authority): Uri = js.native
}
/* static members */
object Uri {
  
  @JSImport("vscode", "Uri")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an URI from a file system path. The [scheme](#Uri.scheme)
    * will be `file`.
    *
    * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
    * as path, not as stringified-uri. E.g. `Uri.file(path)` is *not* the same as
    * `Uri.parse('file://' + path)` because the path might contain characters that are
    * interpreted (# and ?). See the following sample:
    * ```ts
    const good = URI.file('/coding/c#/project1');
    good.scheme === 'file';
    good.path === '/coding/c#/project1';
    good.fragment === '';
    const bad = URI.parse('file://' + '/coding/c#/project1');
    bad.scheme === 'file';
    bad.path === '/coding/c'; // path is now broken
    bad.fragment === '/project1';
    ```
    *
    * @param path A file system or UNC path.
    * @return A new Uri instance.
    */
  inline def file(path: String): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Uri]
  
  /**
    * Create a new uri which path is the result of joining
    * the path of the base uri with the provided path segments.
    *
    * - Note 1: `joinPath` only affects the path component
    * and all other components (scheme, authority, query, and fragment) are
    * left as they are.
    * - Note 2: The base uri must have a path; an error is thrown otherwise.
    *
    * The path segments are normalized in the following ways:
    * - sequences of path separators (`/` or `\`) are replaced with a single separator
    * - for `file`-uris on windows, the backslash-character (`\`) is considered a path-separator
    * - the `..`-segment denotes the parent segment, the `.` denotes the current segment
    * - paths have a root which always remains, for instance on windows drive-letters are roots
    * so that is true: `joinPath(Uri.file('file:///c:/root'), '../../other').fsPath === 'c:/other'`
    *
    * @param base An uri. Must have a path.
    * @param pathSegments One more more path fragments
    * @returns A new uri which path is joined with the given fragments
    */
  inline def joinPath(base: Uri, pathSegments: String*): Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(base.asInstanceOf[js.Any], pathSegments.asInstanceOf[js.Any])).asInstanceOf[Uri]
  
  /**
    * Create an URI from a string, e.g. `http://www.msft.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * *Note* that for a while uris without a `scheme` were accepted. That is not correct
    * as all uris should have a scheme. To avoid breakage of existing code the optional
    * `strict`-argument has been added. We *strongly* advise to use it, e.g. `Uri.parse('my:uri', true)`
    *
    * @see [Uri.toString](#Uri.toString)
    * @param value The string value of an Uri.
    * @param strict Throw an error when `value` is empty or when no `scheme` can be parsed.
    * @return A new Uri instance.
    */
  inline def parse(value: String): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Uri]
  inline def parse(value: String, strict: Boolean): Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Uri]
}
