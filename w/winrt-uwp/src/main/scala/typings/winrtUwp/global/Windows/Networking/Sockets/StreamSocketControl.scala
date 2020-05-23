package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
@js.native
abstract class StreamSocketControl ()
  extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketControl {
  /** Gets or sets the client SSL/TLS certificate that will be sent to the server if the server requests a client certificate. */
  /* CompleteClass */
  override var clientCertificate: Certificate = js.native
  /** Get a vector of SSL server errors to ignore when making an SSL connection with a StreamSocket . */
  /* CompleteClass */
  override var ignorableServerCertificateErrors: IVector[ChainValidationResult] = js.native
  /** A value that indicates whether keep-alive packets are sent to the remote destination on a StreamSocket object. */
  /* CompleteClass */
  override var keepAlive: Boolean = js.native
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object. */
  /* CompleteClass */
  override var noDelay: Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object. */
  /* CompleteClass */
  override var outboundBufferSizeInBytes: Double = js.native
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object. */
  /* CompleteClass */
  override var outboundUnicastHopLimit: Double = js.native
  /** The quality of service on a StreamSocket object. */
  /* CompleteClass */
  override var qualityOfService: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService = js.native
  /** A value that indicates whether, when multiple connection attempts are being made, the attempts are made in parallel or serially. */
  /* CompleteClass */
  override var serializeConnectionAttempts: Boolean = js.native
}

