package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a provider of symmetric key algorithms. For more information, see Cryptographic keys. */
@js.native
trait SymmetricKeyAlgorithmProvider extends js.Object {
  /** Gets the name of the open symmetric algorithm. */
  var algorithmName: String = js.native
  /** Gets the size, in bytes, of the cipher block for the open algorithm. */
  var blockLength: Double = js.native
  /**
    * Creates a symmetric key.
    * @param keyMaterial Data used to generate the key. You can call the GenerateRandom method to create random key material.
    * @return Symmetric key.
    */
  def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object SymmetricKeyAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, blockLength: Double, createSymmetricKey: IBuffer => CryptographicKey): SymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any], createSymmetricKey = js.Any.fromFunction1(createSymmetricKey))
    __obj.asInstanceOf[SymmetricKeyAlgorithmProvider]
  }
  @scala.inline
  implicit class SymmetricKeyAlgorithmProviderOps[Self <: SymmetricKeyAlgorithmProvider] (val x: Self) extends AnyVal {
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
    def setBlockLength(value: Double): Self = this.set("blockLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateSymmetricKey(value: IBuffer => CryptographicKey): Self = this.set("createSymmetricKey", js.Any.fromFunction1(value))
  }
  
}

