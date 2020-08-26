package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WampyOptions extends js.Object {
  var authid: js.UndefOr[String] = js.native
  var authmethods: js.UndefOr[js.Array[String]] = js.native
  var autoReconnect: js.UndefOr[Boolean] = js.native
  var helloCustomDetails: js.UndefOr[js.Any] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var onChallenge: js.UndefOr[ChallengeCallback] = js.native
  var onClose: js.UndefOr[Callback] = js.native
  var onConnect: js.UndefOr[Callback] = js.native
  var onError: js.UndefOr[Callback] = js.native
  var onReconnect: js.UndefOr[Callback] = js.native
  var onReconnectSuccess: js.UndefOr[Callback] = js.native
  var realm: js.UndefOr[String] = js.native
  var reconnectInterval: js.UndefOr[Double] = js.native
  var serializer: js.UndefOr[js.Any] = js.native
  var ws: js.UndefOr[js.Any] = js.native
}

object WampyOptions {
  @scala.inline
  def apply(): WampyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WampyOptions]
  }
  @scala.inline
  implicit class WampyOptionsOps[Self <: WampyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthid(value: String): Self = this.set("authid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthid: Self = this.set("authid", js.undefined)
    @scala.inline
    def setAuthmethodsVarargs(value: String*): Self = this.set("authmethods", js.Array(value :_*))
    @scala.inline
    def setAuthmethods(value: js.Array[String]): Self = this.set("authmethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthmethods: Self = this.set("authmethods", js.undefined)
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    @scala.inline
    def setHelloCustomDetails(value: js.Any): Self = this.set("helloCustomDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelloCustomDetails: Self = this.set("helloCustomDetails", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setOnChallenge(value: (/* auth_method */ String, /* extra */ Dict) => String): Self = this.set("onChallenge", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChallenge: Self = this.set("onChallenge", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnConnect(value: () => Unit): Self = this.set("onConnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnReconnect(value: () => Unit): Self = this.set("onReconnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReconnect: Self = this.set("onReconnect", js.undefined)
    @scala.inline
    def setOnReconnectSuccess(value: () => Unit): Self = this.set("onReconnectSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReconnectSuccess: Self = this.set("onReconnectSuccess", js.undefined)
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    @scala.inline
    def setReconnectInterval(value: Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    @scala.inline
    def setSerializer(value: js.Any): Self = this.set("serializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
    @scala.inline
    def setWs(value: js.Any): Self = this.set("ws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWs: Self = this.set("ws", js.undefined)
  }
  
}

