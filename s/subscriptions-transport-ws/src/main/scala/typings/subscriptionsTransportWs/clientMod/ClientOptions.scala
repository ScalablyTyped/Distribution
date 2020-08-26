package typings.subscriptionsTransportWs.clientMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var connectionCallback: js.UndefOr[js.Function2[/* error */ js.Array[Error], /* result */ js.UndefOr[js.Any], Unit]] = js.native
  var connectionParams: js.UndefOr[ConnectionParamsOptions] = js.native
  var inactivityTimeout: js.UndefOr[Double] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var reconnect: js.UndefOr[Boolean] = js.native
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setConnectionCallback(value: (/* error */ js.Array[Error], /* result */ js.UndefOr[js.Any]) => Unit): Self = this.set("connectionCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConnectionCallback: Self = this.set("connectionCallback", js.undefined)
    @scala.inline
    def setConnectionParams(value: ConnectionParamsOptions): Self = this.set("connectionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionParams: Self = this.set("connectionParams", js.undefined)
    @scala.inline
    def setInactivityTimeout(value: Double): Self = this.set("inactivityTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactivityTimeout: Self = this.set("inactivityTimeout", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    @scala.inline
    def setReconnectionAttempts(value: Double): Self = this.set("reconnectionAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectionAttempts: Self = this.set("reconnectionAttempts", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

