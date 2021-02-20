package typings.w3cWebUsb

import typings.std.EventTarget
import typings.w3cWebUsb.w3cWebUsbStrings.connect
import typings.w3cWebUsb.w3cWebUsbStrings.disconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USB extends EventTarget {
  
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
  
  var onconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]) | Null = js.native
  
  var ondisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_connect(`type`: connect, callback: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connect(
    `type`: connect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_disconnect(
    `type`: disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_disconnect(
    `type`: disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  def requestDevice(): js.Promise[USBDevice] = js.native
  def requestDevice(options: USBDeviceRequestOptions): js.Promise[USBDevice] = js.native
}
