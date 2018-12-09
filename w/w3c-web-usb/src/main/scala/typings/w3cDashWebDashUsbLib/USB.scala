package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USB")
@js.native
class USB ()
  extends stdLib.EventTarget {
  @JSName("addEventListener")
  def addEventListener_connect(
    `type`: w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.connect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connect(
    `type`: w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.connect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnect(
    `type`: w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnect(
    `type`: w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getDevices(): js.Promise[js.Array[USBDevice]] = js.native
  def onconnect(): js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _] = js.native
  def ondisconnect(): js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _] = js.native
  def requestDevice(): js.Promise[USBDevice] = js.native
  def requestDevice(options: USBDeviceRequestOptions): js.Promise[USBDevice] = js.native
}

