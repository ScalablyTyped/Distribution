package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationClient extends StObject {
  
  var bypassCacheOnRetrieve: Boolean
  
  var maxResponseBufferSize: Double
  
  var proxyCredential: PasswordCredential
  
  def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
  
  var serverCredential: PasswordCredential
  
  def setRequestHeader(name: String, value: String): Unit
  
  var timeout: Double
}
object ISyndicationClient {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ISyndicationClient] (val x: Self) extends AnyVal {
    
    inline def setBypassCacheOnRetrieve(value: Boolean): Self = StObject.set(x, "bypassCacheOnRetrieve", value.asInstanceOf[js.Any])
    
    inline def setMaxResponseBufferSize(value: Double): Self = StObject.set(x, "maxResponseBufferSize", value.asInstanceOf[js.Any])
    
    inline def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
    
    inline def setRetrieveFeedAsync(value: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = StObject.set(x, "retrieveFeedAsync", js.Any.fromFunction1(value))
    
    inline def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
    
    inline def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
