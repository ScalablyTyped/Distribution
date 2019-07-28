package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationClient")
@js.native
class SyndicationClient () extends ISyndicationClient {
  def this(serverCredential: PasswordCredential) = this()
  /* CompleteClass */
  override var bypassCacheOnRetrieve: Boolean = js.native
  /* CompleteClass */
  override var maxResponseBufferSize: Double = js.native
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var timeout: Double = js.native
  /* CompleteClass */
  override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /* CompleteClass */
  override def setRequestHeader(name: String, value: String): Unit = js.native
}

