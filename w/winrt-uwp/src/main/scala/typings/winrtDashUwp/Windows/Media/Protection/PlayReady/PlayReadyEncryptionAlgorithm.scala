package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

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
  
  /* 1 */ val aes128Ctr: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.aes128Ctr with Double = js.native
  /* 2 */ val cocktail: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.cocktail with Double = js.native
  /* 3 */ val uninitialized: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.uninitialized with Double = js.native
  /* 0 */ val unprotected: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.unprotected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayReadyEncryptionAlgorithm with Double] = js.native
}

