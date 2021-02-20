package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsymmetricKeyAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): AsymmetricKeyAlgorithmProvider = js.native
}
object IAsymmetricKeyAlgorithmProviderStatics {
  
  @scala.inline
  def apply(openAlgorithm: String => AsymmetricKeyAlgorithmProvider): IAsymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IAsymmetricKeyAlgorithmProviderStatics]
  }
  
  @scala.inline
  implicit class IAsymmetricKeyAlgorithmProviderStaticsMutableBuilder[Self <: IAsymmetricKeyAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenAlgorithm(value: String => AsymmetricKeyAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
