package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /** The address of the first byte of data returned.
  				Treated as a hex value if prefixed with `0x`, or as a decimal value otherwise.
  			*/
  var address: String
  
  /** The bytes read from memory, encoded using base64. */
  var data: js.UndefOr[String] = js.undefined
  
  /** The number of unreadable bytes encountered after the last successfully read byte.
  				This can be used to determine the number of bytes that should be skipped before a subsequent `readMemory` request succeeds.
  			*/
  var unreadableBytes: js.UndefOr[Double] = js.undefined
}
object Address {
  
  inline def apply(address: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setUnreadableBytes(value: Double): Self = StObject.set(x, "unreadableBytes", value.asInstanceOf[js.Any])
    
    inline def setUnreadableBytesUndefined: Self = StObject.set(x, "unreadableBytes", js.undefined)
  }
}
