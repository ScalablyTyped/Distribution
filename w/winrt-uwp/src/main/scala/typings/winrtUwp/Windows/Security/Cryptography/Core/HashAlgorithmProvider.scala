package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
trait HashAlgorithmProvider extends js.Object {
  /** Gets the name of the open hash algorithm. */
  var algorithmName: String
  /** Gets the length, in bytes, of the hash. */
  var hashLength: Double
  /**
    * Creates a reusable CryptographicHash object.
    * @return Reusable hash object.
    */
  def createHash(): CryptographicHash
  /**
    * Hashes binary data.
    * @param data Data to be hashed.
    * @return Hashed data.
    */
  def hashData(data: IBuffer): IBuffer
}

object HashAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: () => CryptographicHash,
    hashData: IBuffer => IBuffer,
    hashLength: Double
  ): HashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction0(createHash), hashData = js.Any.fromFunction1(hashData), hashLength = hashLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithmProvider]
  }
}

