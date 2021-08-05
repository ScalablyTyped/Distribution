package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): HashAlgorithmProvider
}
object IHashAlgorithmProviderStatics {
  
  inline def apply(openAlgorithm: String => HashAlgorithmProvider): IHashAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IHashAlgorithmProviderStatics]
  }
  
  extension [Self <: IHashAlgorithmProviderStatics](x: Self) {
    
    inline def setOpenAlgorithm(value: String => HashAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
