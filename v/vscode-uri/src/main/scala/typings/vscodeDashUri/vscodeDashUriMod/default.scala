package typings.vscodeDashUri.vscodeDashUriMod

import typings.vscodeDashUri.Anon_Authority
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
  protected def this(scheme: String) = this()
  protected def this(scheme: String, authority: String) = this()
  protected def this(scheme: String, authority: String, path: String) = this()
  protected def this(scheme: String, authority: String, path: String, query: String) = this()
  protected def this(scheme: String, authority: String, path: String, query: String, fragment: String) = this()
  protected def this(scheme: String, authority: String, path: String, query: String, fragment: String, _strict: Boolean) = this()
  /* CompleteClass */
  override var authority: String = js.native
  /* CompleteClass */
  override var fragment: String = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var query: String = js.native
  /* CompleteClass */
  override var scheme: String = js.native
}

/* static members */
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
  def file(path: String): URI = js.native
  def from(components: Anon_Authority): URI = js.native
  def isUri(thing: js.Any): /* is vscode-uri.vscode-uri.URI */ Boolean = js.native
  /**
    * Creates a new URI from a string, e.g. `http://www.msft.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an URI (see `URI#toString`).
    */
  def parse(value: String): URI = js.native
  def parse(value: String, _strict: Boolean): URI = js.native
  def revive(): js.UndefOr[URI] = js.native
  def revive(data: URI): js.UndefOr[URI] = js.native
  def revive(data: UriComponents): js.UndefOr[URI] = js.native
  @JSName("revive")
  def revive_URI(data: URI): URI = js.native
  @JSName("revive")
  def revive_URI(data: UriComponents): URI = js.native
}

