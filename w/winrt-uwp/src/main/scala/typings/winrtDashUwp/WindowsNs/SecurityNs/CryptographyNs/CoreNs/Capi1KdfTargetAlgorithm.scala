package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs

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
  sealed trait aes extends Capi1KdfTargetAlgorithm
  
  /** The target algorithm is not AES. */
  @js.native
  sealed trait notAes extends Capi1KdfTargetAlgorithm
  
  /* 1 */ val aes: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.Capi1KdfTargetAlgorithm.aes with Double = js.native
  /* 0 */ val notAes: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CoreNs.Capi1KdfTargetAlgorithm.notAes with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Capi1KdfTargetAlgorithm with Double] = js.native
}

