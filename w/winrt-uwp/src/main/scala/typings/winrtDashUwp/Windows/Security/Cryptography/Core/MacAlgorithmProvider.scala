package typings.winrtDashUwp.Windows.Security.Cryptography.Core

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
abstract class MacAlgorithmProvider () extends js.Object {
  /** Gets the name of the open MAC algorithm. */
  var algorithmName: String = js.native
  /** Gets the length, in bytes, of the message authentication code. */
  var macLength: Double = js.native
  /**
    * Creates a CryptographicHash object that supports incremental hash operations.
    * @param keyMaterial Random data used to help generate the hash. You can call the GenerateRandom method to create the random data.
    * @return A CryptographicHash object that supports incremental hash operations.
    */
  def createHash(keyMaterial: IBuffer): CryptographicHash = js.native
  /**
    * Creates a symmetric key that can be used to create the MAC value.
    * @param keyMaterial Random data used to help generate the key. You can call the GenerateRandom method to create the random data.
    * @return Symmetric key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmProvider")
@js.native
object MacAlgorithmProvider extends js.Object {
  /**
    * Creates a MacAlgorithmProvider object and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a provider that implements MAC algorithms.
    */
  def openAlgorithm(algorithm: String): MacAlgorithmProvider = js.native
}

