package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
abstract class HashAlgorithmProvider ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
object HashAlgorithmProvider extends js.Object {
  
  /**
    * Creates a HashAlgorithmProvider object and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a provider that implements hash algorithms.
    */
  def openAlgorithm(algorithm: String): typings.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider = js.native
}
