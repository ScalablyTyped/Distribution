package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISymmetricKeyAlgorithmProvider extends js.Object {
  var algorithmName: String = js.native
  var blockLength: Double = js.native
  def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object ISymmetricKeyAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, blockLength: Double, createSymmetricKey: IBuffer => CryptographicKey): ISymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any], createSymmetricKey = js.Any.fromFunction1(createSymmetricKey))
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProvider]
  }
  @scala.inline
  implicit class ISymmetricKeyAlgorithmProviderOps[Self <: ISymmetricKeyAlgorithmProvider] (val x: Self) extends AnyVal {
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

