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
  
  val aes: aes with java.lang.String = js.native
  val notAes: notAes with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.Capi1KdfTargetAlgorithm with java.lang.String
  ] = js.native
}

