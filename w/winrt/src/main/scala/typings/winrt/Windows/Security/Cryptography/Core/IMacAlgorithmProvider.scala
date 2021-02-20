package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMacAlgorithmProvider extends StObject {
  
  var algorithmName: String = js.native
  
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
  
  var macLength: Double = js.native
}
object IMacAlgorithmProvider {
  
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey, macLength: Double): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
  
  @scala.inline
  implicit class IMacAlgorithmProviderMutableBuilder[Self <: IMacAlgorithmProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMacLength(value: Double): Self = StObject.set(x, "macLength", value.asInstanceOf[js.Any])
  }
}
