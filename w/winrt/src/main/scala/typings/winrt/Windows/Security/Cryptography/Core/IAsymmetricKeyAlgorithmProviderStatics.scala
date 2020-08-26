package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsymmetricKeyAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): AsymmetricKeyAlgorithmProvider = js.native
}

object IAsymmetricKeyAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => AsymmetricKeyAlgorithmProvider): IAsymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IAsymmetricKeyAlgorithmProviderStatics]
  }
  @scala.inline
  implicit class IAsymmetricKeyAlgorithmProviderStaticsOps[Self <: IAsymmetricKeyAlgorithmProviderStatics] (val x: Self) extends AnyVal {
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
    def setOpenAlgorithm(value: String => AsymmetricKeyAlgorithmProvider): Self = this.set("openAlgorithm", js.Any.fromFunction1(value))
  }
  
}

