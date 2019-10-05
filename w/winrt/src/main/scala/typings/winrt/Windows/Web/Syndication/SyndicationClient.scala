package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
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

