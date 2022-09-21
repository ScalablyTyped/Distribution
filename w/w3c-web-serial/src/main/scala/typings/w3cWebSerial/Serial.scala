package typings.w3cWebSerial

import typings.std.Event
import typings.std.EventTarget
import typings.w3cWebSerial.w3cWebSerialStrings.connect
import typings.w3cWebSerial.w3cWebSerialStrings.disconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serial */
@js.native
trait Serial
  extends StObject
     with EventTarget {
  
  def addEventListener(
    `type`: connect | disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: connect | disconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def getPorts(): js.Promise[js.Array[SerialPort]] = js.native
  
  var onconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  var ondisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def requestPort(): js.Promise[SerialPort] = js.native
  def requestPort(options: SerialPortRequestOptions): js.Promise[SerialPort] = js.native
}
