package typings.w3cWebHid

import typings.std.Event
import typings.std.EventTarget
import typings.w3cWebHid.w3cWebHidStrings.connect
import typings.w3cWebHid.w3cWebHidStrings.disconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hid-interface */
@js.native
trait HID
  extends StObject
     with EventTarget {
  
  def addEventListener(
    `type`: connect | disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HIDConnectionEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: connect | disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HIDConnectionEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def getDevices(): js.Promise[js.Array[HIDDevice]] = js.native
  
  var onconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  var ondisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ HIDConnectionEvent, Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ HIDConnectionEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def requestDevice(): js.Promise[js.Array[HIDDevice]] = js.native
  def requestDevice(options: HIDDeviceRequestOptions): js.Promise[js.Array[HIDDevice]] = js.native
}
