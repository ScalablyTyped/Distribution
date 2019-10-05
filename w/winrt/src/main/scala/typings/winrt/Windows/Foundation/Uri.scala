package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected ()
  extends IUriRuntimeClass
     with IUriRuntimeClassWithAbsoluteCanonicalUri {
  def this(uri: String) = this()
  def this(baseUri: String, relativeUri: String) = this()
  /* CompleteClass */
  override var absoluteCanonicalUri: String = js.native
  /* CompleteClass */
  override var absoluteUri: String = js.native
  /* CompleteClass */
  override var displayIri: String = js.native
  /* CompleteClass */
  override var displayUri: String = js.native
  /* CompleteClass */
  override var domain: String = js.native
  /* CompleteClass */
  override var extension: String = js.native
  /* CompleteClass */
  override var fragment: String = js.native
  /* CompleteClass */
  override var host: String = js.native
  /* CompleteClass */
  override var password: String = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var port: Double = js.native
  /* CompleteClass */
  override var query: String = js.native
  /* CompleteClass */
  override var queryParsed: WwwFormUrlDecoder = js.native
  /* CompleteClass */
  override var rawUri: String = js.native
  /* CompleteClass */
  override var schemeName: String = js.native
  /* CompleteClass */
  override var suspicious: Boolean = js.native
  /* CompleteClass */
  override var userName: String = js.native
  /* CompleteClass */
  override def combineUri(relativeUri: String): Uri = js.native
  /* CompleteClass */
  override def equals(pUri: Uri): Boolean = js.native
}

/* static members */
@JSGlobal("Windows.Foundation.Uri")
@js.native
object Uri extends js.Object {
  def escapeComponent(toEscape: String): String = js.native
  def unescapeComponent(toUnescape: String): String = js.native
}

