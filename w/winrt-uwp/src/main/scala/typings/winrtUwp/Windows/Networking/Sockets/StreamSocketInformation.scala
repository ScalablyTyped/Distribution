package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides socket information on a StreamSocket object. */
trait StreamSocketInformation extends StObject {
  
  /** Gets bandwidth information for network data transfer on a StreamSocket object. */
  var bandwidthStatistics: BandwidthStatistics
  
  /** Gets the local IP address associated with a StreamSocket object. */
  var localAddress: HostName
  
  /** Get the TCP port number associated with a StreamSocket . */
  var localPort: String
  
  /** Gets the protection level that represents the integrity and encryption set on a StreamSocket object. */
  var protectionLevel: SocketProtectionLevel
  
  /** Get the IP address or hostname of the remote network destination associated with a StreamSocket object. */
  var remoteAddress: HostName
  
  /** Get the hostname or IP address of the remote network destination associated with a StreamSocket object. */
  var remoteHostName: HostName
  
  /** Get the TCP port number or service name of the remote network destination associated with a StreamSocket object. */
  var remotePort: String
  
  /** Get the service name or TCP port number of the remote network destination associated with a StreamSocket object. */
  var remoteServiceName: String
  
  /** Gets round trip time information for a StreamSocket object. */
  var roundTripTimeStatistics: RoundTripTimeStatistics
  
  /** Gets the certificate from the server when making an SSL connection with a StreamSocket . */
  var serverCertificate: Certificate
  
  /** Gets the category of an error that occurred making an SSL connection with a StreamSocket . */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity
  
  /** Gets the list of errors that occurred making an SSL connection with a StreamSocket . */
  var serverCertificateErrors: IVectorView[ChainValidationResult]
  
  /** Gets the intermediate certificates sent by the server during SSL negotiation when making an SSL connection with a StreamSocket . */
  var serverIntermediateCertificates: IVectorView[Certificate]
  
  /** Get a byte array that represents the private shared secret exchanged by proximity devices. */
  var sessionKey: IBuffer
}
object StreamSocketInformation {
  
  inline def apply(
    bandwidthStatistics: BandwidthStatistics,
    localAddress: HostName,
    localPort: String,
    protectionLevel: SocketProtectionLevel,
    remoteAddress: HostName,
    remoteHostName: HostName,
    remotePort: String,
    remoteServiceName: String,
    roundTripTimeStatistics: RoundTripTimeStatistics,
    serverCertificate: Certificate,
    serverCertificateErrorSeverity: SocketSslErrorSeverity,
    serverCertificateErrors: IVectorView[ChainValidationResult],
    serverIntermediateCertificates: IVectorView[Certificate],
    sessionKey: IBuffer
  ): StreamSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any], roundTripTimeStatistics = roundTripTimeStatistics.asInstanceOf[js.Any], serverCertificate = serverCertificate.asInstanceOf[js.Any], serverCertificateErrorSeverity = serverCertificateErrorSeverity.asInstanceOf[js.Any], serverCertificateErrors = serverCertificateErrors.asInstanceOf[js.Any], serverIntermediateCertificates = serverIntermediateCertificates.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketInformation]
  }
  
  extension [Self <: StreamSocketInformation](x: Self) {
    
    inline def setBandwidthStatistics(value: BandwidthStatistics): Self = StObject.set(x, "bandwidthStatistics", value.asInstanceOf[js.Any])
    
    inline def setLocalAddress(value: HostName): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalPort(value: String): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevel(value: SocketProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: HostName): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
    
    inline def setRemotePort(value: String): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    inline def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
    
    inline def setRoundTripTimeStatistics(value: RoundTripTimeStatistics): Self = StObject.set(x, "roundTripTimeStatistics", value.asInstanceOf[js.Any])
    
    inline def setServerCertificate(value: Certificate): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = StObject.set(x, "serverCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = StObject.set(x, "serverCertificateErrors", value.asInstanceOf[js.Any])
    
    inline def setServerIntermediateCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "serverIntermediateCertificates", value.asInstanceOf[js.Any])
    
    inline def setSessionKey(value: IBuffer): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
  }
}
