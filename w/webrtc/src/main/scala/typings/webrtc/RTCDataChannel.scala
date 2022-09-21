package typings.webrtc

import typings.std.Blob
import typings.std.Event
import typings.std.EventTarget
import typings.std.MessageEvent
import typings.std.RTCDataChannelState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannel
  extends StObject
     with EventTarget {
  
  val bufferedAmount: Double = js.native
  
  var bufferedAmountLowThreshold: Double = js.native
  
  // binaryType: string;
  def close(): Unit = js.native
  
  val id: Double | Null = js.native
  
  val label: String = js.native
  
  val maxPacketLifeTime: Double | Null = js.native
  
  val maxRetransmits: Double | Null = js.native
  
  val negotiated: Boolean = js.native
  
  var onbufferedamountlow: DataChannelEventHandler[Event] = js.native
  
  // onerror: DataChannelEventHandler<RTCErrorEvent>;
  var onclose: DataChannelEventHandler[Event] = js.native
  
  var onmessage: DataChannelEventHandler[MessageEvent[Any]] = js.native
  
  var onopen: DataChannelEventHandler[Event] = js.native
  
  val ordered: Boolean = js.native
  
  val protocol: String = js.native
  
  val readyState: RTCDataChannelState = js.native
  
  def send(data: String): Unit = js.native
  def send(data: js.typedarray.ArrayBuffer): Unit = js.native
  def send(data: js.typedarray.ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}
