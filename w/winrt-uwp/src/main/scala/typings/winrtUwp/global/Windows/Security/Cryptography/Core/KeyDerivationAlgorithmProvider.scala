package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a key derivation algorithm provider. */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
abstract class KeyDerivationAlgorithmProvider ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
object KeyDerivationAlgorithmProvider extends js.Object {
  
  /**
    * Creates an instance of the KeyDerivationAlgorithmProvider class and opens the specified algorithm for use.
    * @param algorithm Represents a KDF algorithm provider.
    * @return The algorithm provider.
    */
  def openAlgorithm(algorithm: String): typings.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider = js.native
}
