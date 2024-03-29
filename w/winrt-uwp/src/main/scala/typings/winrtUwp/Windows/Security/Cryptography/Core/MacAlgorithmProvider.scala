package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a message authentication code (MAC). A MAC uses symmetric key cryptography to prevent message tampering. For more information, see MACs, hashes, and signatures. */
trait MacAlgorithmProvider extends StObject {
  
  /** Gets the name of the open MAC algorithm. */
  var algorithmName: String
  
  /**
    * Creates a CryptographicHash object that supports incremental hash operations.
    * @param keyMaterial Random data used to help generate the hash. You can call the GenerateRandom method to create the random data.
    * @return A CryptographicHash object that supports incremental hash operations.
    */
  def createHash(keyMaterial: IBuffer): CryptographicHash
  
  /**
    * Creates a symmetric key that can be used to create the MAC value.
    * @param keyMaterial Random data used to help generate the key. You can call the GenerateRandom method to create the random data.
    * @return Symmetric key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey
  
  /** Gets the length, in bytes, of the message authentication code. */
  var macLength: Double
}
object MacAlgorithmProvider {
  
  inline def apply(
    algorithmName: String,
    createHash: IBuffer => CryptographicHash,
    createKey: IBuffer => CryptographicKey,
    macLength: Double
  ): MacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createHash = js.Any.fromFunction1(createHash), createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacAlgorithmProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacAlgorithmProvider] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    inline def setCreateHash(value: IBuffer => CryptographicHash): Self = StObject.set(x, "createHash", js.Any.fromFunction1(value))
    
    inline def setCreateKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
    
    inline def setMacLength(value: Double): Self = StObject.set(x, "macLength", value.asInstanceOf[js.Any])
  }
}
