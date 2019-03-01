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
    retrieveFeedAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
    ],
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    setRequestHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    timeout: scala.Double
  ): ISyndicationClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bypassCacheOnRetrieve")(bypassCacheOnRetrieve)
    __obj.updateDynamic("maxResponseBufferSize")(maxResponseBufferSize)
    __obj.updateDynamic("proxyCredential")(proxyCredential)
    __obj.updateDynamic("retrieveFeedAsync")(retrieveFeedAsync)
    __obj.updateDynamic("serverCredential")(serverCredential)
    __obj.updateDynamic("setRequestHeader")(setRequestHeader)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[ISyndicationClient]
  }
}

