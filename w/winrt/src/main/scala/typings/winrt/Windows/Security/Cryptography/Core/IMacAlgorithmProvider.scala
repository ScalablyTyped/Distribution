package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMacAlgorithmProvider extends js.Object {
  var algorithmName: String = js.native
  var macLength: Double = js.native
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object IMacAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey, macLength: Double): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
  @scala.inline
  implicit class IMacAlgorithmProviderOps[Self <: IMacAlgorithmProvider] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setMacLength(value: Double): Self = this.set("macLength", value.asInstanceOf[js.Any])
  }
  
}

