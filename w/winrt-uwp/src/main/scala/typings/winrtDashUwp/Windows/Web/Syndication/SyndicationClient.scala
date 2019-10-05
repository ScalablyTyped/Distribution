package typings.winrtDashUwp.Windows.Web.Syndication

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implements the ISyndicationClient interface which retrieves feeds from a URI asynchronously. */
@JSGlobal("Windows.Web.Syndication.SyndicationClient")
@js.native
/** Creates a new SyndicationClient object. */
class SyndicationClient () extends js.Object {
  /**
    * Creates a new SyndicationClient object with authentication credentials.
    * @param serverCredential Credentials for user authentication.
    */
  def this(serverCredential: PasswordCredential) = this()
  /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
  var bypassCacheOnRetrieve: Boolean = js.native
  /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
  var maxResponseBufferSize: Double = js.native
  /** Gets or sets the credentials to use when making requests via a proxy. */
  var proxyCredential: PasswordCredential = js.native
  /** Gets or sets the credentials to use when making requests to the server. */
  var serverCredential: PasswordCredential = js.native
  /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
  var timeout: Double = js.native
  /**
    * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
    * @param uri The URI from which the feed is downloaded.
    * @return Contains the results of the operation.
    */
  def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /**
    * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
    * @param name The name of the header.
    * @param value The value of the header.
    */
  def setRequestHeader(name: String, value: String): Unit = js.native
}

