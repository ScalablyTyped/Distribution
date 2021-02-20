package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISymmetricKeyAlgorithmProvider extends StObject {
  
  var algorithmName: String = js.native
  
  var blockLength: Double = js.native
  
  def createSymmetricKey(keyMaterial: IBuffer): CryptographicKey = js.native
}
object ISymmetricKeyAlgorithmProvider {
  
  @scala.inline
  def apply(algorithmName: String, blockLength: Double, createSymmetricKey: IBuffer => CryptographicKey): ISymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], blockLength = blockLength.asInstanceOf[js.Any], createSymmetricKey = js.Any.fromFunction1(createSymmetricKey))
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProvider]
  }
  
  @scala.inline
  implicit class ISymmetricKeyAlgorithmProviderMutableBuilder[Self <: ISymmetricKeyAlgorithmProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSymmetricKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createSymmetricKey", js.Any.fromFunction1(value))
  }
}
