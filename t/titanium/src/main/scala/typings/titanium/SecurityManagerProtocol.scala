package typings.titanium

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
  def willHandleURL(url: js.Any): Boolean
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
}

