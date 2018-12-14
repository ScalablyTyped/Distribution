package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDataChannel
  extends stdLib.EventTarget {
  var binaryType: java.lang.String = js.native
  val bufferedAmount: scala.Double = js.native
  var bufferedAmountLowThreshold: scala.Double = js.native
  val id: scala.Double | scala.Null = js.native
  val label: java.lang.String = js.native
  val maxPacketLifeTime: scala.Double | scala.Null = js.native
  val maxRetransmits: scala.Double | scala.Null = js.native
  val negotiated: scala.Boolean = js.native
  var onbufferedamountlow: DataChannelEventHandler[stdLib.Event] = js.native
  var onclose: DataChannelEventHandler[stdLib.Event] = js.native
  var onerror: DataChannelEventHandler[stdLib.RTCErrorEvent] = js.native
  var onmessage: DataChannelEventHandler[stdLib.MessageEvent] = js.native
  var onopen: DataChannelEventHandler[stdLib.Event] = js.native
  val ordered: scala.Boolean = js.native
  val protocol: java.lang.String = js.native
  val readyState: stdLib.RTCDataChannelState = js.native
  def close(): scala.Unit = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def send(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def send(data: stdLib.ArrayBufferView): scala.Unit = js.native
  def send(data: stdLib.Blob): scala.Unit = js.native
}

