package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMacAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): MacAlgorithmProvider
}
object IMacAlgorithmProviderStatics {
  
  @scala.inline
  def apply(openAlgorithm: String => MacAlgorithmProvider): IMacAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IMacAlgorithmProviderStatics]
  }
  
  @scala.inline
  implicit class IMacAlgorithmProviderStaticsMutableBuilder[Self <: IMacAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenAlgorithm(value: String => MacAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
