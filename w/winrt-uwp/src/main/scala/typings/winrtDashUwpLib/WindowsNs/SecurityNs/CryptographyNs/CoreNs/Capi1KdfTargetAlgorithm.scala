package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Capi1KdfTargetAlgorithm extends js.Object

/** Represents information about a target algorithm. */
@JSGlobal("Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm")
@js.native
object Capi1KdfTargetAlgorithm extends js.Object {
  /** The target algorithm is AES. */
  @js.native
  sealed trait aes
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.Capi1KdfTargetAlgorithm
  
  /** The target algorithm is not AES. */
  @js.native
  sealed trait notAes
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.Capi1KdfTargetAlgorithm
  
  /* 1 */ val aes: aes with scala.Double = js.native
  /* 0 */ val notAes: notAes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.Capi1KdfTargetAlgorithm with scala.Double
  ] = js.native
}

