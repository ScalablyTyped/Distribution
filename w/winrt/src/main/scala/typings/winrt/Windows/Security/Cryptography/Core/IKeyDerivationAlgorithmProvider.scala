package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyDerivationAlgorithmProvider extends StObject {
  
  var algorithmName: String
  
  def createKey(keyMaterial: IBuffer): CryptographicKey
}
object IKeyDerivationAlgorithmProvider {
  
  inline def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): IKeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProvider]
  }
  
  extension [Self <: IKeyDerivationAlgorithmProvider](x: Self) {
    
    inline def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    inline def setCreateKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
  }
}
