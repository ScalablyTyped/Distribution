package typings.winrtDashUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPadding extends js.Object

/** Specifies a padding mode for asymmetric algorithm signature or encryption operations. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPadding")
@js.native
object CryptographicPadding extends js.Object {
  /** Do not use padding. */
  @js.native
  sealed trait none extends CryptographicPadding
  
  /** Use the Optimal Asymmetric Encryption Padding (OAEP) scheme. */
  @js.native
  sealed trait rsaOaep extends CryptographicPadding
  
  /** Use the standard padding scheme for public-key cryptography based on the RSA algorithm as defined in RFC 3447. */
  @js.native
  sealed trait rsaPkcs1V15 extends CryptographicPadding
  
  /** Use the Probabilistic Signature Scheme (PSS) scheme. */
  @js.native
  sealed trait rsaPss extends CryptographicPadding
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPadding with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object rsaOaep extends TopLevel[rsaOaep with Double]
  
  /* 2 */ @js.native
  object rsaPkcs1V15 extends TopLevel[rsaPkcs1V15 with Double]
  
  /* 3 */ @js.native
  object rsaPss extends TopLevel[rsaPss with Double]
  
}

