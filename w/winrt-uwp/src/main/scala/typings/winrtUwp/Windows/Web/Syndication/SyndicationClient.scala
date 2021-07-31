package typings.winrtUwp.Windows.Web.Syndication

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Implements the ISyndicationClient interface which retrieves feeds from a URI asynchronously. */
trait SyndicationClient extends StObject {
  
  /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
  var bypassCacheOnRetrieve: Boolean
  
  /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
  var maxResponseBufferSize: Double
  
  /** Gets or sets the credentials to use when making requests via a proxy. */
  var proxyCredential: PasswordCredential
  
  /**
    * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
    * @param uri The URI from which the feed is downloaded.
    * @return Contains the results of the operation.
    */
  def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
  
  /** Gets or sets the credentials to use when making requests to the server. */
  var serverCredential: PasswordCredential
  
  /**
    * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
    * @param name The name of the header.
    * @param value The value of the header.
    */
  def setRequestHeader(name: String, value: String): Unit
  
  /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
  var timeout: Double
}
object SyndicationClient {
  
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double
  ): SyndicationClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationClient]
  }
  
  @scala.inline
  implicit class SyndicationClientMutableBuilder[Self <: SyndicationClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassCacheOnRetrieve(value: Boolean): Self = StObject.set(x, "bypassCacheOnRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResponseBufferSize(value: Double): Self = StObject.set(x, "maxResponseBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveFeedAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = StObject.set(x, "retrieveFeedAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
