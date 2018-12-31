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

