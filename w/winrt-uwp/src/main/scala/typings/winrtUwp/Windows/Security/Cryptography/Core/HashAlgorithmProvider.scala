package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a cryptographic hash provider. For more information about hashes, see MACs, hashes, and signatures. */
trait HashAlgorithmProvider extends StObject {
  
  /** Gets the name of the open hash algorithm. */
  var algorithmName: String
  
  /**
    * Creates a reusable CryptographicHash object.
    * @return Reusable hash object.
    */
  def createHash(): CryptographicHash
  
  /**
    * Hashes binary data.
    * @param data Data to be hashed.
    * @return Hashed data.
    */
  def hashData(data: IBuffer): IBuffer
  
  /** Gets the length, in bytes, of the hash. */
  var hashLength: Double
}
object HashAlgorithmProvider {
  
  inline def apply(
    algorithmName: String,
    createHash: () => CryptographicHash,
    hashData: IBuffer => IBuffer,
    hashLength: Double
  ): HashAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction0(createHash), hashData = js.Any.fromFunction1(hashData), hashLength = hashLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithmProvider]
  }
  
  extension [Self <: HashAlgorithmProvider](x: Self) {
    
    inline def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    inline def setCreateHash(value: () => CryptographicHash): Self = StObject.set(x, "createHash", js.Any.fromFunction0(value))
    
    inline def setHashData(value: IBuffer => IBuffer): Self = StObject.set(x, "hashData", js.Any.fromFunction1(value))
    
    inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
  }
}
