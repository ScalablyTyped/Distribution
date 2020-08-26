package typings.tarantoolDriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TarantoolOptions extends js.Object {
  var beforeReserve: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var lazyConnect: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var reserveHosts: js.UndefOr[js.Array[String]] = js.native
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var username: js.UndefOr[String] = js.native
}

object TarantoolOptions {
  @scala.inline
  def apply(): TarantoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TarantoolOptions]
  }
  @scala.inline
  implicit class TarantoolOptionsOps[Self <: TarantoolOptions] (val x: Self) extends AnyVal {
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
    def setBeforeReserve(value: Double): Self = this.set("beforeReserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeReserve: Self = this.set("beforeReserve", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLazyConnect(value: Boolean): Self = this.set("lazyConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyConnect: Self = this.set("lazyConnect", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setReserveHostsVarargs(value: String*): Self = this.set("reserveHosts", js.Array(value :_*))
    @scala.inline
    def setReserveHosts(value: js.Array[String]): Self = this.set("reserveHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReserveHosts: Self = this.set("reserveHosts", js.undefined)
    @scala.inline
    def setRetryStrategy(value: /* times */ Double => Double): Self = this.set("retryStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

