package typings.w3cDashWebDashUsb

import typings.std.Event
import typings.std.EventTarget
import typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.connect
import typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USB")
@js.native
class USB () extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_connect(`type`: connect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connect(
    `type`: connect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnect(
    `type`: disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnect(
    `type`: disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getDevices(): js.Promise[js.Array[USBDevice]] = js.native
  def onconnect(): js.ThisFunction1[/* this */ this.type, /* ev */ Event, _] = js.native
  def ondisconnect(): js.ThisFunction1[/* this */ this.type, /* ev */ Event, _] = js.native
  def requestDevice(): js.Promise[USBDevice] = js.native
  def requestDevice(options: USBDeviceRequestOptions): js.Promise[USBDevice] = js.native
}

