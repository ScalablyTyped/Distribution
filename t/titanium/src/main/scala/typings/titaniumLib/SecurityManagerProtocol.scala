package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol that the <Titanium.Network.HTTPClient.securityManager> must implement.
  */
trait SecurityManagerProtocol extends js.Object {
  /**
  	 * The <APSConnectionDelegate> for this connection.
  	 */
  def connectionDelegateForUrl(url: js.Any): APSConnectionDelegate
  /**
  	 * Returns an array of objects implementing the [X509KeyManager](https://developer.android.com/reference/javax/net/ssl/X509KeyManager.html) protocol for the SSL Context.
  	 */
  def getKeyManagers(proxy: js.Any): js.Array[_]
  /**
  	 * Returns an array of objects implementing the [X509TrustManager](https://developer.android.com/reference/javax/net/ssl/X509TrustManager.html) protocol for the SSL Context.
  	 */
  def getTrustManagers(proxy: js.Any): js.Array[_]
  /**
  	 * Returns if the security manager will participate in authentication of this end point.
  	 */
  def willHandleURL(url: js.Any): scala.Boolean
}

object SecurityManagerProtocol {
  @scala.inline
  def apply(
    connectionDelegateForUrl: js.Function1[js.Any, APSConnectionDelegate],
    getKeyManagers: js.Function1[js.Any, js.Array[_]],
    getTrustManagers: js.Function1[js.Any, js.Array[_]],
    willHandleURL: js.Function1[js.Any, scala.Boolean]
  ): SecurityManagerProtocol = {
    val __obj = js.Dynamic.literal(connectionDelegateForUrl = connectionDelegateForUrl, getKeyManagers = getKeyManagers, getTrustManagers = getTrustManagers, willHandleURL = willHandleURL)
  
    __obj.asInstanceOf[SecurityManagerProtocol]
  }
}

