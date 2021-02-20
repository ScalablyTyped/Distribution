package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashAlgorithmProvider extends StObject {
  
  var algorithmName: String = js.native
  
  def createHash(): CryptographicHash = js.native
  
  def hashData(data: IBuffer): IBuffer = js.native
  
  var hashLength: Double = js.native
}
object IHashAlgorithmProvider {
  
  @scala.inline
  def apply(
    algorithmName: String,
    createHash: () => CryptographicHash,
    hashData: IBuffer => IBuffer,
    hashLength: Double
  ): IHashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction0(createHash), hashData = js.Any.fromFunction1(hashData), hashLength = hashLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHashAlgorithmProvider]
  }
  
  @scala.inline
  implicit class IHashAlgorithmProviderMutableBuilder[Self <: IHashAlgorithmProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateHash(value: () => CryptographicHash): Self = StObject.set(x, "createHash", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHashData(value: IBuffer => IBuffer): Self = StObject.set(x, "hashData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
  }
}
