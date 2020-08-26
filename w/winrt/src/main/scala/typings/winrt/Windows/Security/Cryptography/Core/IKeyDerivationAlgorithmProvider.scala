package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationAlgorithmProvider extends js.Object {
  var algorithmName: String = js.native
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object IKeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): IKeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProvider]
  }
  @scala.inline
  implicit class IKeyDerivationAlgorithmProviderOps[Self <: IKeyDerivationAlgorithmProvider] (val x: Self) extends AnyVal {
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
    def setCreateKey(value: IBuffer => CryptographicKey): Self = this.set("createKey", js.Any.fromFunction1(value))
  }
  
}

