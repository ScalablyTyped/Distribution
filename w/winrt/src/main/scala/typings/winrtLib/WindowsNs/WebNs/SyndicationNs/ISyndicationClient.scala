package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationClient extends js.Object {
  var bypassCacheOnRetrieve: scala.Boolean
  var maxResponseBufferSize: scala.Double
  var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  var timeout: scala.Double
  def retrieveFeedAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
  def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit
}

object ISyndicationClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: scala.Boolean,
    maxResponseBufferSize: scala.Double,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    retrieveFeedAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    setRequestHeader: (java.lang.String, java.lang.String) => scala.Unit,
    timeout: scala.Double
  ): ISyndicationClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve, maxResponseBufferSize = maxResponseBufferSize, proxyCredential = proxyCredential, retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), serverCredential = serverCredential, setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout)
  
    __obj.asInstanceOf[ISyndicationClient]
  }
}

