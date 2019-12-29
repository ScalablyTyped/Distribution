package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayReadyEncryptionAlgorithm extends js.Object

/** Indicates the type of encryption algorithm specified in a PlayReady content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm")
@js.native
object PlayReadyEncryptionAlgorithm extends js.Object {
  /** AES-128 Counter-mode encryption. */
  @js.native
  sealed trait aes128Ctr extends PlayReadyEncryptionAlgorithm
  
  /** Cocktail encryption. */
  @js.native
  sealed trait cocktail extends PlayReadyEncryptionAlgorithm
  
  /** The encryption method has not been set. */
  @js.native
  sealed trait uninitialized extends PlayReadyEncryptionAlgorithm
  
  /** Content is not encrypted. */
  @js.native
  sealed trait unprotected extends PlayReadyEncryptionAlgorithm
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayReadyEncryptionAlgorithm with Double] = js.native
  /* 1 */ @js.native
  object aes128Ctr extends TopLevel[aes128Ctr with Double]
  
  /* 2 */ @js.native
  object cocktail extends TopLevel[cocktail with Double]
  
  /* 3 */ @js.native
  object uninitialized extends TopLevel[uninitialized with Double]
  
  /* 0 */ @js.native
  object unprotected extends TopLevel[unprotected with Double]
  
}

