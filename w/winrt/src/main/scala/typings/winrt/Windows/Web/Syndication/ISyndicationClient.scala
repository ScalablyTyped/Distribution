package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationClient extends StObject {
  
  var bypassCacheOnRetrieve: Boolean = js.native
  
  var maxResponseBufferSize: Double = js.native
  
  var proxyCredential: PasswordCredential = js.native
  
  def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  
  var serverCredential: PasswordCredential = js.native
  
  def setRequestHeader(name: String, value: String): Unit = js.native
  
  var timeout: Double = js.native
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
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationClient]
  }
  
  @scala.inline
  implicit class ISyndicationClientMutableBuilder[Self <: ISyndicationClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassCacheOnRetrieve(value: Boolean): Self = StObject.set(x, "bypassCacheOnRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResponseBufferSize(value: Double): Self = StObject.set(x, "maxResponseBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveFeedAsync(value: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = StObject.set(x, "retrieveFeedAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
