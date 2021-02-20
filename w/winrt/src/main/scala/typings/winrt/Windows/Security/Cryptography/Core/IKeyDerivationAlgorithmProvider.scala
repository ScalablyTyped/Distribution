package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyDerivationAlgorithmProvider extends StObject {
  
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
  implicit class IKeyDerivationAlgorithmProviderMutableBuilder[Self <: IKeyDerivationAlgorithmProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
  }
}
