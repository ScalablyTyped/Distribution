package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  sealed trait aes128Ctr
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyEncryptionAlgorithm
  
  /** Cocktail encryption. */
  @js.native
  sealed trait cocktail
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyEncryptionAlgorithm
  
  /** The encryption method has not been set. */
  @js.native
  sealed trait uninitialized
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyEncryptionAlgorithm
  
  /** Content is not encrypted. */
  @js.native
  sealed trait unprotected
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyEncryptionAlgorithm
  
  val aes128Ctr: aes128Ctr with java.lang.String = js.native
  val cocktail: cocktail with java.lang.String = js.native
  val uninitialized: uninitialized with java.lang.String = js.native
  val unprotected: unprotected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyEncryptionAlgorithm with java.lang.String
  ] = js.native
}

