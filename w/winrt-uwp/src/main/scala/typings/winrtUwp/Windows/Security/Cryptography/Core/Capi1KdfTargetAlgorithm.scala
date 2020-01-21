package typings.winrtUwp.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Capi1KdfTargetAlgorithm with Double] = js.native
  /* 1 */ @js.native
  object aes extends TopLevel[aes with Double]
  
  /* 0 */ @js.native
  object notAes extends TopLevel[notAes with Double]
  
}

