package typings.winrtUwp.global.Windows.Web.Http

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the underlying transport used by the HTTP connection. */
/* note: abstract class */ @JSGlobal("Windows.Web.Http.HttpTransportInformation")
@js.native
open class HttpTransportInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.HttpTransportInformation {
  
  /** Gets the certificate from the server with the SSL information. */
  /* CompleteClass */
  var serverCertificate: Certificate = js.native
  
  /** Gets the category of an error on an SSL connection. */
  /* CompleteClass */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity = js.native
  
  /** Gets the list of errors that occurred making an SSL connection. */
  /* CompleteClass */
  var serverCertificateErrors: IVectorView[ChainValidationResult] = js.native
  
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  /* CompleteClass */
  var serverIntermediateCertificates: IVectorView[Certificate] = js.native
}
