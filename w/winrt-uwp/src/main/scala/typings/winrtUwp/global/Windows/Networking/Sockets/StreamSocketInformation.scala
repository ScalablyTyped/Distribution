package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.BandwidthStatistics
import typings.winrtUwp.Windows.Networking.Sockets.RoundTripTimeStatistics
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
@js.native
abstract class StreamSocketInformation ()
  extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketInformation {
  /** Gets bandwidth information for network data transfer on a StreamSocket object. */
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /** Gets the local IP address associated with a StreamSocket object. */
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /** Get the TCP port number associated with a StreamSocket . */
  /* CompleteClass */
  override var localPort: String = js.native
  /** Gets the protection level that represents the integrity and encryption set on a StreamSocket object. */
  /* CompleteClass */
  override var protectionLevel: typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel = js.native
  /** Get the IP address or hostname of the remote network destination associated with a StreamSocket object. */
  /* CompleteClass */
  override var remoteAddress: HostName = js.native
  /** Get the hostname or IP address of the remote network destination associated with a StreamSocket object. */
  /* CompleteClass */
  override var remoteHostName: HostName = js.native
  /** Get the TCP port number or service name of the remote network destination associated with a StreamSocket object. */
  /* CompleteClass */
  override var remotePort: String = js.native
  /** Get the service name or TCP port number of the remote network destination associated with a StreamSocket object. */
  /* CompleteClass */
  override var remoteServiceName: String = js.native
  /** Gets round trip time information for a StreamSocket object. */
  /* CompleteClass */
  override var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  /** Gets the certificate from the server when making an SSL connection with a StreamSocket . */
  /* CompleteClass */
  override var serverCertificate: Certificate = js.native
  /** Gets the category of an error that occurred making an SSL connection with a StreamSocket . */
  /* CompleteClass */
  override var serverCertificateErrorSeverity: typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity = js.native
  /** Gets the list of errors that occurred making an SSL connection with a StreamSocket . */
  /* CompleteClass */
  override var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  /** Gets the intermediate certificates sent by the server during SSL negotiation when making an SSL connection with a StreamSocket . */
  /* CompleteClass */
  override var serverIntermediateCertificates: IVectorView[Certificate] = js.native
  /** Get a byte array that represents the private shared secret exchanged by proximity devices. */
  /* CompleteClass */
  override var sessionKey: IBuffer = js.native
}

