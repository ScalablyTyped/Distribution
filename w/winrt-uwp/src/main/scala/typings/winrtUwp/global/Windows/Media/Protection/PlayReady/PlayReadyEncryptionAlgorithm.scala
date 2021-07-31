package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the type of encryption algorithm specified in a PlayReady content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm")
@js.native
object PlayReadyEncryptionAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm & Double
  ] = js.native
  
  /* 1 */ val aes128Ctr: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.aes128Ctr & Double = js.native
  
  /* 2 */ val cocktail: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.cocktail & Double = js.native
  
  /* 3 */ val uninitialized: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.uninitialized & Double = js.native
  
  /* 0 */ val unprotected: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm.unprotected & Double = js.native
}
