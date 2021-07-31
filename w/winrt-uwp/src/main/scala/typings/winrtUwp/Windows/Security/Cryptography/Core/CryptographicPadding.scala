package typings.winrtUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptographicPadding extends StObject
/** Specifies a padding mode for asymmetric algorithm signature or encryption operations. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPadding")
@js.native
object CryptographicPadding extends StObject {
  
  /** Do not use padding. */
  @js.native
  sealed trait none
    extends StObject
       with CryptographicPadding
  
  /** Use the Optimal Asymmetric Encryption Padding (OAEP) scheme. */
  @js.native
  sealed trait rsaOaep
    extends StObject
       with CryptographicPadding
  
  /** Use the standard padding scheme for public-key cryptography based on the RSA algorithm as defined in RFC 3447. */
  @js.native
  sealed trait rsaPkcs1V15
    extends StObject
       with CryptographicPadding
  
  /** Use the Probabilistic Signature Scheme (PSS) scheme. */
  @js.native
  sealed trait rsaPss
    extends StObject
       with CryptographicPadding
}
