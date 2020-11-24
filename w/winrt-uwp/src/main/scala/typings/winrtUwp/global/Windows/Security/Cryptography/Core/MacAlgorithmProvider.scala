package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
abstract class MacAlgorithmProvider ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
object MacAlgorithmProvider extends js.Object {
  
  /**
    * Creates a MacAlgorithmProvider object and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a provider that implements MAC algorithms.
    */
  def openAlgorithm(algorithm: String): typings.winrtUwp.Windows.Security.Cryptography.Core.MacAlgorithmProvider = js.native
}
