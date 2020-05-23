package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmProvider")
@js.native
abstract class HashAlgorithmProvider ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider {
  /** Gets the name of the open hash algorithm. */
  /* CompleteClass */
  override var algorithmName: String = js.native
  /** Gets the length, in bytes, of the hash. */
  /* CompleteClass */
  override var hashLength: Double = js.native
  /**
    * Creates a reusable CryptographicHash object.
    * @return Reusable hash object.
    */
  /* CompleteClass */
  override def createHash(): typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicHash = js.native
  /**
    * Hashes binary data.
    * @param data Data to be hashed.
    * @return Hashed data.
    */
  /* CompleteClass */
  override def hashData(data: IBuffer): IBuffer = js.native
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
  def openAlgorithm(algorithm: String): typings.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmProvider = js.native
}

