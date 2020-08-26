package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlChannelTrigger extends IClosable {
  var controlChannelTriggerId: String = js.native
  var currentKeepAliveIntervalInMinutes: Double = js.native
  var keepAliveTrigger: IBackgroundTrigger = js.native
  var pushNotificationTrigger: IBackgroundTrigger = js.native
  var serverKeepAliveIntervalInMinutes: Double = js.native
  var transportObject: js.Any = js.native
  def decreaseNetworkKeepAliveInterval(): Unit = js.native
  def flushTransport(): Unit = js.native
  def usingTransport(transport: js.Any): Unit = js.native
  def waitForPushEnabled(): ControlChannelTriggerStatus = js.native
}

object IControlChannelTrigger {
  @scala.inline
  def apply(
    close: () => Unit,
    controlChannelTriggerId: String,
    currentKeepAliveIntervalInMinutes: Double,
    decreaseNetworkKeepAliveInterval: () => Unit,
    flushTransport: () => Unit,
    keepAliveTrigger: IBackgroundTrigger,
    pushNotificationTrigger: IBackgroundTrigger,
    serverKeepAliveIntervalInMinutes: Double,
    transportObject: js.Any,
    usingTransport: js.Any => Unit,
    waitForPushEnabled: () => ControlChannelTriggerStatus
  ): IControlChannelTrigger = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), controlChannelTriggerId = controlChannelTriggerId.asInstanceOf[js.Any], currentKeepAliveIntervalInMinutes = currentKeepAliveIntervalInMinutes.asInstanceOf[js.Any], decreaseNetworkKeepAliveInterval = js.Any.fromFunction0(decreaseNetworkKeepAliveInterval), flushTransport = js.Any.fromFunction0(flushTransport), keepAliveTrigger = keepAliveTrigger.asInstanceOf[js.Any], pushNotificationTrigger = pushNotificationTrigger.asInstanceOf[js.Any], serverKeepAliveIntervalInMinutes = serverKeepAliveIntervalInMinutes.asInstanceOf[js.Any], transportObject = transportObject.asInstanceOf[js.Any], usingTransport = js.Any.fromFunction1(usingTransport), waitForPushEnabled = js.Any.fromFunction0(waitForPushEnabled))
    __obj.asInstanceOf[IControlChannelTrigger]
  }
  @scala.inline
  implicit class IControlChannelTriggerOps[Self <: IControlChannelTrigger] (val x: Self) extends AnyVal {
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
    def setControlChannelTriggerId(value: String): Self = this.set("controlChannelTriggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentKeepAliveIntervalInMinutes(value: Double): Self = this.set("currentKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecreaseNetworkKeepAliveInterval(value: () => Unit): Self = this.set("decreaseNetworkKeepAliveInterval", js.Any.fromFunction0(value))
    @scala.inline
    def setFlushTransport(value: () => Unit): Self = this.set("flushTransport", js.Any.fromFunction0(value))
    @scala.inline
    def setKeepAliveTrigger(value: IBackgroundTrigger): Self = this.set("keepAliveTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushNotificationTrigger(value: IBackgroundTrigger): Self = this.set("pushNotificationTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerKeepAliveIntervalInMinutes(value: Double): Self = this.set("serverKeepAliveIntervalInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportObject(value: js.Any): Self = this.set("transportObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsingTransport(value: js.Any => Unit): Self = this.set("usingTransport", js.Any.fromFunction1(value))
    @scala.inline
    def setWaitForPushEnabled(value: () => ControlChannelTriggerStatus): Self = this.set("waitForPushEnabled", js.Any.fromFunction0(value))
  }
  
}

