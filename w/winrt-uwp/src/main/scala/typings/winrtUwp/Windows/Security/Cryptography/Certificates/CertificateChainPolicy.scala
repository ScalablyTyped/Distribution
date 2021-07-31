package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateChainPolicy extends StObject
/** Describes the policy to use when performing a certificate chain validation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateChainPolicy")
@js.native
object CertificateChainPolicy extends StObject {
  
  /** Use the base chain policy verification checks. */
  @js.native
  sealed trait base
    extends StObject
       with CertificateChainPolicy
  
  /** Check the last element of the first simple chain for a Microsoft root public key. */
  @js.native
  sealed trait microsoftRoot
    extends StObject
       with CertificateChainPolicy
  
  /** Use the Windows NT Authentication chain policy checks. */
  @js.native
  sealed trait ntAuthentication
    extends StObject
       with CertificateChainPolicy
  
  /** Use the SSL client/server chain policy verification checks. */
  @js.native
  sealed trait ssl
    extends StObject
       with CertificateChainPolicy
}
