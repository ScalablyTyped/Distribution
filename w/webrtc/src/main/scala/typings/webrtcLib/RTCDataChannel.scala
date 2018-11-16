package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
@js.native
trait RTCDataChannel
  extends stdLib.EventTarget {
  var binaryType: RTCBinaryType = js.native
  val bufferedAmount: scala.Double = js.native
  var bufferedAmountLowThreshold: scala.Double = js.native
  val id: scala.Double = js.native
  val label: java.lang.String = js.native
  val maxPacketLifeTime: scala.Double | scala.Null = js.native
  val maxRetransmits: scala.Double | scala.Null = js.native
  val negotiated: scala.Boolean = js.native
  @JSName("onbufferedamountlow")
  var onbufferedamountlow_Original: EventHandler = js.native
  @JSName("onclose")
  var onclose_Original: EventHandler = js.native
  @JSName("onopen")
  var onopen_Original: EventHandler = js.native
  val ordered: scala.Boolean = js.native
  val protocol: java.lang.String = js.native
  val readyState: RTCDataChannelState = js.native
  def close(): scala.Unit = js.native
  def onbufferedamountlow(event: stdLib.Event): scala.Unit = js.native
  def onclose(event: stdLib.Event): scala.Unit = js.native
  def onerror(event: stdLib.ErrorEvent): scala.Unit = js.native
  def onmessage(event: stdLib.MessageEvent): scala.Unit = js.native
  def onopen(event: stdLib.Event): scala.Unit = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def send(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def send(data: stdLib.ArrayBufferView): scala.Unit = js.native
  def send(data: stdLib.Blob): scala.Unit = js.native
}

