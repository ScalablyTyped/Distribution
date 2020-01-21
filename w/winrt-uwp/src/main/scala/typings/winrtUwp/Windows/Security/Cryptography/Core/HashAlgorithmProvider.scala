package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
abstract class HashAlgorithmProvider () extends js.Object {
  /** Gets the name of the open hash algorithm. */
  var algorithmName: String = js.native
  /** Gets the length, in bytes, of the hash. */
  var hashLength: Double = js.native
  /**
    * Creates a reusable CryptographicHash object.
    * @return Reusable hash object.
    */
  def createHash(): CryptographicHash = js.native
  /**
    * Hashes binary data.
    * @param data Data to be hashed.
    * @return Hashed data.
    */
  def hashData(data: IBuffer): IBuffer = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
object HashAlgorithmProvider extends js.Object {
  /**
    * Creates a HashAlgorithmProvider object and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a provider that implements hash algorithms.
    */
  def openAlgorithm(algorithm: String): HashAlgorithmProvider = js.native
}

