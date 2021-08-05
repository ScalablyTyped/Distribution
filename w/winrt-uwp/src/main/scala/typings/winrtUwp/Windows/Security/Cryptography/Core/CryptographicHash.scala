package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a reusable hashing object and contains the result of a hashing operation. */
trait CryptographicHash extends StObject {
  
  /**
    * Appends a binary encoded string to the data stored in the CryptographicHash object.
    * @param data Data to append.
    */
  def append(data: IBuffer): Unit
  
  /**
    * Gets hashed data from the CryptographicHash object and resets the object.
    * @return Hashed data.
    */
  def getValueAndReset(): IBuffer
}
object CryptographicHash {
  
  inline def apply(append: IBuffer => Unit, getValueAndReset: () => IBuffer): CryptographicHash = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getValueAndReset = js.Any.fromFunction0(getValueAndReset))
    __obj.asInstanceOf[CryptographicHash]
  }
  
  extension [Self <: CryptographicHash](x: Self) {
    
    inline def setAppend(value: IBuffer => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setGetValueAndReset(value: () => IBuffer): Self = StObject.set(x, "getValueAndReset", js.Any.fromFunction0(value))
  }
}
