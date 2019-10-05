package typings.winrtDashUwp.Windows.Security.Cryptography.Core

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
  
  /* 0 */ val none: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPadding.none with Double = js.native
  /* 1 */ val rsaOaep: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaOaep with Double = js.native
  /* 2 */ val rsaPkcs1V15: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaPkcs1V15 with Double = js.native
  /* 3 */ val rsaPss: typings.winrtDashUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaPss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptographicPadding with Double] = js.native
}

