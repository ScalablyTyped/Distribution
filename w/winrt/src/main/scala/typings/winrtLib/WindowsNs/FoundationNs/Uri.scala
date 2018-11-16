package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Uri")
@js.native
class Uri protected ()
  extends IUriRuntimeClass
     with IUriRuntimeClassWithAbsoluteCanonicalUri {
  def this(uri: java.lang.String) = this()
  def this(baseUri: java.lang.String, relativeUri: java.lang.String) = this()
  /* CompleteClass */
  override var absoluteCanonicalUri: java.lang.String = js.native
  /* CompleteClass */
  override var absoluteUri: java.lang.String = js.native
  /* CompleteClass */
  override var displayIri: java.lang.String = js.native
  /* CompleteClass */
  override var displayUri: java.lang.String = js.native
  /* CompleteClass */
  override var domain: java.lang.String = js.native
  /* CompleteClass */
  override var extension: java.lang.String = js.native
  /* CompleteClass */
  override var fragment: java.lang.String = js.native
  /* CompleteClass */
  override var host: java.lang.String = js.native
  /* CompleteClass */
  override var password: java.lang.String = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var port: scala.Double = js.native
  /* CompleteClass */
  override var query: java.lang.String = js.native
  /* CompleteClass */
  override var queryParsed: WwwFormUrlDecoder = js.native
  /* CompleteClass */
  override var rawUri: java.lang.String = js.native
  /* CompleteClass */
  override var schemeName: java.lang.String = js.native
  /* CompleteClass */
  override var suspicious: scala.Boolean = js.native
  /* CompleteClass */
  override var userName: java.lang.String = js.native
  /* CompleteClass */
  override def combineUri(relativeUri: java.lang.String): Uri = js.native
  /* CompleteClass */
  override def equals(pUri: Uri): scala.Boolean = js.native
}

@JSGlobal("Windows.Foundation.Uri")
@js.native
object Uri extends js.Object {
  def escapeComponent(toEscape: java.lang.String): java.lang.String = js.native
  def unescapeComponent(toUnescape: java.lang.String): java.lang.String = js.native
}

