package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

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
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding
  
  /** Use the Optimal Asymmetric Encryption Padding (OAEP) scheme. */
  @js.native
  sealed trait rsaOaep
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding
  
  /** Use the standard padding scheme for public-key cryptography based on the RSA algorithm as defined in RFC 3447. */
  @js.native
  sealed trait rsaPkcs1V15
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding
  
  /** Use the Probabilistic Signature Scheme (PSS) scheme. */
  @js.native
  sealed trait rsaPss
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding
  
  val none: none with java.lang.String = js.native
  val rsaOaep: rsaOaep with java.lang.String = js.native
  val rsaPkcs1V15: rsaPkcs1V15 with java.lang.String = js.native
  val rsaPss: rsaPss with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPadding with java.lang.String
  ] = js.native
}

