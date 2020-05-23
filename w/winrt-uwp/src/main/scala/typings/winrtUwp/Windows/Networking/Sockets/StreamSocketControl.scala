package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamSocket object. */
trait StreamSocketControl extends js.Object {
  /** Gets or sets the client SSL/TLS certificate that will be sent to the server if the server requests a client certificate. */
  var clientCertificate: Certificate
  /** Get a vector of SSL server errors to ignore when making an SSL connection with a StreamSocket . */
  var ignorableServerCertificateErrors: IVector[ChainValidationResult]
  /** A value that indicates whether keep-alive packets are sent to the remote destination on a StreamSocket object. */
  var keepAlive: Boolean
  /** A value that indicates whether the Nagle algorithm is used on a StreamSocket object. */
  var noDelay: Boolean
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamSocket object. */
  var outboundBufferSizeInBytes: Double
  /** The hop limit on an outbound packet sent to a unicast IP address by the StreamSocket object. */
  var outboundUnicastHopLimit: Double
  /** The quality of service on a StreamSocket object. */
  var qualityOfService: SocketQualityOfService
  /** A value that indicates whether, when multiple connection attempts are being made, the attempts are made in parallel or serially. */
  var serializeConnectionAttempts: Boolean
}

object StreamSocketControl {
  @scala.inline
  def apply(
    clientCertificate: Certificate,
    ignorableServerCertificateErrors: IVector[ChainValidationResult],
    keepAlive: Boolean,
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService,
    serializeConnectionAttempts: Boolean
  ): StreamSocketControl = {
    val __obj = js.Dynamic.literal(clientCertificate = clientCertificate.asInstanceOf[js.Any], ignorableServerCertificateErrors = ignorableServerCertificateErrors.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any], serializeConnectionAttempts = serializeConnectionAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketControl]
  }
}

