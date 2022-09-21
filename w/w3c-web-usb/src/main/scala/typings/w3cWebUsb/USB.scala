package typings.w3cWebUsb

import typings.std.EventTarget
import typings.w3cWebUsb.w3cWebUsbStrings.connect
import typings.w3cWebUsb.w3cWebUsbStrings.disconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USB
  extends StObject
     with EventTarget {
  
  def addEventListener(
    `type`: connect | disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: connect | disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def getDevices(): js.Promise[js.Array[USBDevice]] = js.native
  
  var onconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, Any]) | Null = js.native
  
  var ondisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, Any]) | Null = js.native
  
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ USBConnectionEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def requestDevice(): js.Promise[USBDevice] = js.native
  def requestDevice(options: USBDeviceRequestOptions): js.Promise[USBDevice] = js.native
}
