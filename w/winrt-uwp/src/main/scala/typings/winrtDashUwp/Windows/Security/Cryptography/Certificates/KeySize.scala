package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeySize extends js.Object

/** Specifies commonly used RSA algorithm key sizes. This enumeration type can be used in the KeySize property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
@js.native
object KeySize extends js.Object {
  /** No size is specified. */
  @js.native
  sealed trait invalid extends KeySize
  
  /** The key length is 2048 bits. */
  @js.native
  sealed trait rsa2048 extends KeySize
  
  /** The key length is 4096 bits. */
  @js.native
  sealed trait rsa4096 extends KeySize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeySize with Double] = js.native
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 1 */ @js.native
  object rsa2048 extends TopLevel[rsa2048 with Double]
  
  /* 2 */ @js.native
  object rsa4096 extends TopLevel[rsa4096 with Double]
  
}

