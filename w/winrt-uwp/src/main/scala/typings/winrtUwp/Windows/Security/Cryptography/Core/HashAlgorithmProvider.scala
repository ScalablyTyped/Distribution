package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
@js.native
trait HashAlgorithmProvider extends js.Object {
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
  @scala.inline
  implicit class HashAlgorithmProviderOps[Self <: HashAlgorithmProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithmName(value: String): Self = this.set("algorithmName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateHash(value: () => CryptographicHash): Self = this.set("createHash", js.Any.fromFunction0(value))
    @scala.inline
    def setHashData(value: IBuffer => IBuffer): Self = this.set("hashData", js.Any.fromFunction1(value))
    @scala.inline
    def setHashLength(value: Double): Self = this.set("hashLength", value.asInstanceOf[js.Any])
  }
  
}

