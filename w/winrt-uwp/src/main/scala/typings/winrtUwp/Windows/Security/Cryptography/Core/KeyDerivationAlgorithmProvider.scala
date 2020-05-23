package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a key derivation algorithm provider. */
trait KeyDerivationAlgorithmProvider extends js.Object {
  /** Gets the name of the open key derivation function (KDF) algorithm. */
  var algorithmName: String
  /**
    * Creates a KDF key.
    * @param keyMaterial Data used to create the key.
    * @return Represents the KDF key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey
}

object KeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): KeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[KeyDerivationAlgorithmProvider]
  }
}

