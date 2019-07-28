package typings.winrt.WindowsNs.WebNs.SyndicationNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationClient extends js.Object {
  var bypassCacheOnRetrieve: Boolean
  var maxResponseBufferSize: Double
  var proxyCredential: PasswordCredential
  var serverCredential: PasswordCredential
  var timeout: Double
  def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
  def setRequestHeader(name: String, value: String): Unit
}

object ISyndicationClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double
  ): ISyndicationClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve, maxResponseBufferSize = maxResponseBufferSize, proxyCredential = proxyCredential, retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), serverCredential = serverCredential, setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout)
  
    __obj.asInstanceOf[ISyndicationClient]
  }
}

