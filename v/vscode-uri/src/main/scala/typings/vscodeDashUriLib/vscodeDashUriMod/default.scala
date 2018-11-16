package typings
package vscodeDashUriLib.vscodeDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-uri", JSImport.Default)
@js.native
class default protected () extends URI {
  /**
       * @internal
       */
  protected def this(components: UriComponents) = this()
  /**
       * @internal
       */
  protected def this(scheme: java.lang.String, authority: java.lang.String, path: java.lang.String, query: java.lang.String, fragment: java.lang.String) = this()
  /* CompleteClass */
  override var authority: java.lang.String = js.native
  /* CompleteClass */
  override var fragment: java.lang.String = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var query: java.lang.String = js.native
  /* CompleteClass */
  override var scheme: java.lang.String = js.native
}

@JSImport("vscode-uri", JSImport.Default)
@js.native
object default extends js.Object {
  /**
       * Creates a new URI from a file system path, e.g. `c:\my\files`,
       * `/usr/home`, or `\\server\share\some\path`.
       *
       * The *difference* between `URI#parse` and `URI#file` is that the latter treats the argument
       * as path, not as stringified-uri. E.g. `URI.file(path)` is **not the same as**
       * `URI.parse('file://' + path)` because the path might contain characters that are
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
       * @param path A file system path (see `URI#fsPath`)
       */
  def file(path: java.lang.String): vscodeDashUriLib.vscodeDashUriMod.URI = js.native
  def from(components: vscodeDashUriLib.Anon_Path): vscodeDashUriLib.vscodeDashUriMod.URI = js.native
  def isUri(thing: js.Any): /* is URI */scala.Boolean = js.native
  /**
       * Creates a new URI from a string, e.g. `http://www.msft.com/some/path`,
       * `file:///usr/home`, or `scheme:with/path`.
       *
       * @param value A string which represents an URI (see `URI#toString`).
       */
  def parse(value: java.lang.String): vscodeDashUriLib.vscodeDashUriMod.URI = js.native
  def revive(data: js.Any): vscodeDashUriLib.vscodeDashUriMod.URI = js.native
  def revive(data: vscodeDashUriLib.vscodeDashUriMod.UriComponents): vscodeDashUriLib.vscodeDashUriMod.URI = js.native
}

