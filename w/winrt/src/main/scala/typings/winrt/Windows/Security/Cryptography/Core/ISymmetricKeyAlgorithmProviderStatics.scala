package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISymmetricKeyAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): SymmetricKeyAlgorithmProvider
}
object ISymmetricKeyAlgorithmProviderStatics {
  
  inline def apply(openAlgorithm: String => SymmetricKeyAlgorithmProvider): ISymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProviderStatics]
  }
  
  extension [Self <: ISymmetricKeyAlgorithmProviderStatics](x: Self) {
    
    inline def setOpenAlgorithm(value: String => SymmetricKeyAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
