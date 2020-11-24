package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyDerivationAlgorithmProviderStatics extends js.Object {
  
  def openAlgorithm(algorithm: String): KeyDerivationAlgorithmProvider = js.native
}
object IKeyDerivationAlgorithmProviderStatics {
  
  @scala.inline
  def apply(openAlgorithm: String => KeyDerivationAlgorithmProvider): IKeyDerivationAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProviderStatics]
  }
  
  @scala.inline
  implicit class IKeyDerivationAlgorithmProviderStaticsOps[Self <: IKeyDerivationAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    
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
    def setOpenAlgorithm(value: String => KeyDerivationAlgorithmProvider): Self = this.set("openAlgorithm", js.Any.fromFunction1(value))
  }
}
