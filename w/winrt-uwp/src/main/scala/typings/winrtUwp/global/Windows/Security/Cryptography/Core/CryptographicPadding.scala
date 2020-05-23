package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a padding mode for asymmetric algorithm signature or encryption operations. */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPadding")
@js.native
object CryptographicPadding extends js.Object {
  /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.none with Double = js.native
  /* 1 */ val rsaOaep: typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaOaep with Double = js.native
  /* 2 */ val rsaPkcs1V15: typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaPkcs1V15 with Double = js.native
  /* 3 */ val rsaPss: typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding.rsaPss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicPadding with Double
  ] = js.native
}

