package typings.w3cWebSerial

import typings.std.Event
import typings.std.EventTarget
import typings.std.ReadableStream
import typings.std.WritableStream
import typings.w3cWebSerial.w3cWebSerialStrings.connect
import typings.w3cWebSerial.w3cWebSerialStrings.disconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serialport */
@js.native
trait SerialPort
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
  
  def close(): js.Promise[Unit] = js.native
  
  def forget(): js.Promise[Unit] = js.native
  
  def getInfo(): SerialPortInfo = js.native
  
  def getSignals(): js.Promise[SerialInputSignals] = js.native
  
  var onconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  var ondisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  def open(options: SerialOptions): js.Promise[Unit] = js.native
  
  val readable: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  def removeEventListener(
    `type`: connect | disconnect,
    callback: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def setSignals(signals: SerialOutputSignals): js.Promise[Unit] = js.native
  
  val writable: WritableStream[js.typedarray.Uint8Array] | Null = js.native
}
