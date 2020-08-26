package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol that the <Titanium.Network.HTTPClient.securityManager> must implement.
  */
@js.native
trait SecurityManagerProtocol extends js.Object {
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
  implicit class SecurityManagerProtocolOps[Self <: SecurityManagerProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionDelegateForUrl(value: js.Any => APSConnectionDelegate): Self = this.set("connectionDelegateForUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetKeyManagers(value: js.Any => js.Array[_]): Self = this.set("getKeyManagers", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTrustManagers(value: js.Any => js.Array[_]): Self = this.set("getTrustManagers", js.Any.fromFunction1(value))
    @scala.inline
    def setWillHandleURL(value: js.Any => Boolean): Self = this.set("willHandleURL", js.Any.fromFunction1(value))
  }
  
}

