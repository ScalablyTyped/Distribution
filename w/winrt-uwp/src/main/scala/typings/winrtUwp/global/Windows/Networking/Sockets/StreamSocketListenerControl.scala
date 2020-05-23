package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamSocketListener object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketListenerControl")
@js.native
abstract class StreamSocketListenerControl ()
  extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerControl {
  /** A value that indicates whether keep-alive packets should be sent on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  /* CompleteClass */
  override var keepAlive: Boolean = js.native
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  /* CompleteClass */
  override var noDelay: Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  /* CompleteClass */
  override var outboundBufferSizeInBytes: Double = js.native
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object created when a connection is received by the StreamSocketListener object. */
  /* CompleteClass */
  override var outboundUnicastHopLimit: Double = js.native
  /** The quality of service to be set on a StreamSocket object created when a connection is received by the StreamSocketListener object. */
  /* CompleteClass */
  override var qualityOfService: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService = js.native
}

