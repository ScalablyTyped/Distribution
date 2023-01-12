package typings.winrt.Windows.Security.Cryptography.Core

import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashAlgorithmProvider extends StObject {
  
  var algorithmName: String
  
  def createHash(): CryptographicHash
  
  def hashData(data: IBuffer): IBuffer
  
  var hashLength: Double
}
object IHashAlgorithmProvider {
  
  inline def apply(
    algorithmName: String,
    createHash: () => CryptographicHash,
    hashData: IBuffer => IBuffer,
    hashLength: Double
  ): IHashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction0(createHash), hashData = js.Any.fromFunction1(hashData), hashLength = hashLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHashAlgorithmProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHashAlgorithmProvider] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    inline def setCreateHash(value: () => CryptographicHash): Self = StObject.set(x, "createHash", js.Any.fromFunction0(value))
    
    inline def setHashData(value: IBuffer => IBuffer): Self = StObject.set(x, "hashData", js.Any.fromFunction1(value))
    
    inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
  }
}
