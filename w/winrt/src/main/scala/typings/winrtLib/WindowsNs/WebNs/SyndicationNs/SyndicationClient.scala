package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationClient")
@js.native
class SyndicationClient () extends ISyndicationClient {
  def this(serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential) = this()
  /* CompleteClass */
  override var bypassCacheOnRetrieve: scala.Boolean = js.native
  /* CompleteClass */
  override var maxResponseBufferSize: scala.Double = js.native
  /* CompleteClass */
  override var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var timeout: scala.Double = js.native
  /* CompleteClass */
  override def retrieveFeedAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /* CompleteClass */
  override def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

