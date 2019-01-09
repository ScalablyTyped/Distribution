package typings
package vscodeDashUriLib.vscodeDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URI extends UriComponents {
  /**
    * Returns a string representing the corresponding file system path of this URI.
    * Will handle UNC paths, normalizes windows drive letters to lower-case, and uses the
    * platform specific path separator.
    *
    * * Will *not* validate the path for invalid characters and semantics.
    * * Will *not* look at the scheme of this URI.
    * * The result shall *not* be used for display purposes but for accessing a file on disk.
    *
    *
    * The *difference* to `URI#path` is the use of the platform specific separator and the handling
    * of UNC paths. See the below sample of a file-uri with an authority (UNC path).
    *
    * ```ts
    const u = URI.parse('file://server/c$/folder/file.txt')
    u.authority === 'server'
    u.path === '/shares/c$/file.txt'
    u.fsPath === '\\server\c$\folder\file.txt'
    ```
    *
    * Using `URI#path` to read a file (using fs-apis) would not be enough because parts of the path,
    * namely the server name, would be missing. Therefore `URI#fsPath` exists - it's sugar to ease working
    * with URIs that represent files on disk (`file` scheme).
    */
  val fsPath: java.lang.String = js.native
  def toJSON(): js.Object = js.native
  def toString(skipEncoding: scala.Boolean): java.lang.String = js.native
  def `with`(change: vscodeDashUriLib.Anon_AuthorityFragment): URI = js.native
}

