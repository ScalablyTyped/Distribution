package typings.webrtc

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.Event
import typings.std.EventTarget
import typings.std.MessageEvent
import typings.std.RTCDataChannelState
import typings.std.RTCErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDataChannel extends EventTarget {
  var binaryType: String = js.native
  val bufferedAmount: Double = js.native
  var bufferedAmountLowThreshold: Double = js.native
  val id: Double | Null = js.native
  val label: String = js.native
  val maxPacketLifeTime: Double | Null = js.native
  val maxRetransmits: Double | Null = js.native
  val negotiated: Boolean = js.native
  var onbufferedamountlow: DataChannelEventHandler[Event] = js.native
  var onclose: DataChannelEventHandler[Event] = js.native
  var onerror: DataChannelEventHandler[RTCErrorEvent] = js.native
  var onmessage: DataChannelEventHandler[MessageEvent] = js.native
  var onopen: DataChannelEventHandler[Event] = js.native
  val ordered: Boolean = js.native
  val protocol: String = js.native
  val readyState: RTCDataChannelState = js.native
  def close(): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

