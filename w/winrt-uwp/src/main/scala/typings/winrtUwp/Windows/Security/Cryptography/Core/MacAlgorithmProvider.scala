package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
trait MacAlgorithmProvider extends js.Object {
  /** Gets the name of the open MAC algorithm. */
  var algorithmName: String
  /** Gets the length, in bytes, of the message authentication code. */
  var macLength: Double
  /**
    * Creates a CryptographicHash object that supports incremental hash operations.
    * @param keyMaterial Random data used to help generate the hash. You can call the GenerateRandom method to create the random data.
    * @return A CryptographicHash object that supports incremental hash operations.
    */
  def createHash(keyMaterial: IBuffer): CryptographicHash
  /**
    * Creates a symmetric key that can be used to create the MAC value.
    * @param keyMaterial Random data used to help generate the key. You can call the GenerateRandom method to create the random data.
    * @return Symmetric key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey
}

object MacAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: IBuffer => CryptographicHash,
    createKey: IBuffer => CryptographicKey,
    macLength: Double
  ): MacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction1(createHash), createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacAlgorithmProvider]
  }
}

