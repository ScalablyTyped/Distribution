package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayReadyEncryptionAlgorithm extends StObject
/** Indicates the type of encryption algorithm specified in a PlayReady content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm")
@js.native
object PlayReadyEncryptionAlgorithm extends StObject {
  
  /** AES-128 Counter-mode encryption. */
  @js.native
  sealed trait aes128Ctr
    extends StObject
       with PlayReadyEncryptionAlgorithm
  
  /** Cocktail encryption. */
  @js.native
  sealed trait cocktail
    extends StObject
       with PlayReadyEncryptionAlgorithm
  
  /** The encryption method has not been set. */
  @js.native
  sealed trait uninitialized
    extends StObject
       with PlayReadyEncryptionAlgorithm
  
  /** Content is not encrypted. */
  @js.native
  sealed trait unprotected
    extends StObject
       with PlayReadyEncryptionAlgorithm
}
