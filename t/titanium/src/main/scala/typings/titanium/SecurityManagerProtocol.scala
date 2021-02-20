package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The protocol that the <Titanium.Network.HTTPClient.securityManager> must implement.
  */
@js.native
trait SecurityManagerProtocol extends StObject {
  
  /**
    * The <APSConnectionDelegate> for this connection.
    */
  def connectionDelegateForUrl(url: js.Any): APSConnectionDelegate = js.native
  
  /**
    * Returns an array of objects implementing the [X509KeyManager](https://developer.android.com/reference/javax/net/ssl/X509KeyManager.html) protocol for the SSL Context.
    */
  def getKeyManagers(proxy: js.Any): js.Array[_] = js.native
  
  /**
    * Returns an array of objects implementing the [X509TrustManager](https://developer.android.com/reference/javax/net/ssl/X509TrustManager.html) protocol for the SSL Context.
    */
  def getTrustManagers(proxy: js.Any): js.Array[_] = js.native
  
  /**
    * Returns if the security manager will participate in authentication of this end point.
    */
  def willHandleURL(url: js.Any): Boolean = js.native
}
object SecurityManagerProtocol {
  
  @scala.inline
  def apply(
    connectionDelegateForUrl: js.Any => APSConnectionDelegate,
    getKeyManagers: js.Any => js.Array[_],
    getTrustManagers: js.Any => js.Array[_],
    willHandleURL: js.Any => Boolean
  ): SecurityManagerProtocol = {
    val __obj = js.Dynamic.literal(connectionDelegateForUrl = js.Any.fromFunction1(connectionDelegateForUrl), getKeyManagers = js.Any.fromFunction1(getKeyManagers), getTrustManagers = js.Any.fromFunction1(getTrustManagers), willHandleURL = js.Any.fromFunction1(willHandleURL))
    __obj.asInstanceOf[SecurityManagerProtocol]
  }
  
  @scala.inline
  implicit class SecurityManagerProtocolMutableBuilder[Self <: SecurityManagerProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionDelegateForUrl(value: js.Any => APSConnectionDelegate): Self = StObject.set(x, "connectionDelegateForUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyManagers(value: js.Any => js.Array[_]): Self = StObject.set(x, "getKeyManagers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTrustManagers(value: js.Any => js.Array[_]): Self = StObject.set(x, "getTrustManagers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWillHandleURL(value: js.Any => Boolean): Self = StObject.set(x, "willHandleURL", js.Any.fromFunction1(value))
  }
}
