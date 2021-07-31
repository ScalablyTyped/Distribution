package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyDerivationAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): KeyDerivationAlgorithmProvider
}
object IKeyDerivationAlgorithmProviderStatics {
  
  @scala.inline
  def apply(openAlgorithm: String => KeyDerivationAlgorithmProvider): IKeyDerivationAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProviderStatics]
  }
  
  @scala.inline
  implicit class IKeyDerivationAlgorithmProviderStaticsMutableBuilder[Self <: IKeyDerivationAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenAlgorithm(value: String => KeyDerivationAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
