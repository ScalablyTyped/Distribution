package typings.winrtDashUwp.Windows.Networking.Sockets

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Networking.HostName
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
@js.native
abstract class StreamSocketInformation () extends js.Object {
  /** Gets bandwidth information for network data transfer on a StreamSocket object. */
  var bandwidthStatistics: BandwidthStatistics = js.native
  /** Gets the local IP address associated with a StreamSocket object. */
  var localAddress: HostName = js.native
  /** Get the TCP port number associated with a StreamSocket . */
  var localPort: String = js.native
  /** Gets the protection level that represents the integrity and encryption set on a StreamSocket object. */
  var protectionLevel: SocketProtectionLevel = js.native
  /** Get the IP address or hostname of the remote network destination associated with a StreamSocket object. */
  var remoteAddress: HostName = js.native
  /** Get the hostname or IP address of the remote network destination associated with a StreamSocket object. */
  var remoteHostName: HostName = js.native
  /** Get the TCP port number or service name of the remote network destination associated with a StreamSocket object. */
  var remotePort: String = js.native
  /** Get the service name or TCP port number of the remote network destination associated with a StreamSocket object. */
  var remoteServiceName: String = js.native
  /** Gets round trip time information for a StreamSocket object. */
  var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  /** Gets the certificate from the server when making an SSL connection with a StreamSocket . */
  var serverCertificate: Certificate = js.native
  /** Gets the category of an error that occurred making an SSL connection with a StreamSocket . */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection with a StreamSocket . */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation when making an SSL connection with a StreamSocket . */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
  /** Get a byte array that represents the private shared secret exchanged by proximity devices. */
  var sessionKey: IBuffer = js.native
}

