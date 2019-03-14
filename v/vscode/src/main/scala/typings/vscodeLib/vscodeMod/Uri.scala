package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Uri")
@js.native
class Uri () extends js.Object {
  /**
  		 * Authority is the `www.msft.com` part of `http://www.msft.com/some/path?query#fragment`.
  		 * The part between the first double slashes and the next slash.
  		 */
  val authority: java.lang.String = js.native
  /**
  		 * Fragment is the `fragment` part of `http://www.msft.com/some/path?query#fragment`.
  		 */
  val fragment: java.lang.String = js.native
  /**
  		 * The string representing the corresponding file system path of this Uri.
  		 *
  		 * Will handle UNC paths and normalize windows drive letters to lower-case. Also
  		 * uses the platform specific path separator. Will *not* validate the path for
  		 * invalid characters and semantics. Will *not* look at the scheme of this Uri.
  		 */
  val fsPath: java.lang.String = js.native
  /**
  		 * Path is the `/some/path` part of `http://www.msft.com/some/path?query#fragment`.
  		 */
  val path: java.lang.String = js.native
  /**
  		 * Query is the `query` part of `http://www.msft.com/some/path?query#fragment`.
  		 */
  val query: java.lang.String = js.native
  /**
  		 * Scheme is the `http` part of `http://www.msft.com/some/path?query#fragment`.
  		 * The part before the first colon.
  		 */
  val scheme: java.lang.String = js.native
  /**
  		 * Returns a JSON representation of this Uri.
  		 *
  		 * @return An object.
  		 */
  def toJSON(): js.Any = js.native
  def toString(skipEncoding: scala.Boolean): java.lang.String = js.native
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
  def `with`(change: vscodeLib.Anon_Authority): Uri = js.native
}

/* static members */
@JSImport("vscode", "Uri")
@js.native
object Uri extends js.Object {
  /**
  		 * Create an URI from a file system path. The [scheme](#Uri.scheme)
  		 * will be `file`.
  		 *
  		 * @param path A file system or UNC path.
  		 * @return A new Uri instance.
  		 */
  def file(path: java.lang.String): vscodeLib.vscodeMod.Uri = js.native
  /**
  		 * Create an URI from a string. Will throw if the given value is not
  		 * valid.
  		 *
  		 * @param value The string value of an Uri.
  		 * @return A new Uri instance.
  		 */
  def parse(value: java.lang.String): vscodeLib.vscodeMod.Uri = js.native
}

