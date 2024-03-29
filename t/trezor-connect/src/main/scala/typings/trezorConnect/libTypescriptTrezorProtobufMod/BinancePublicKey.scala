package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinancePublicKey extends StObject {
  
  var public_key: String
}
object BinancePublicKey {
  
  inline def apply(public_key: String): BinancePublicKey = {
    val __obj = js.Dynamic.literal(public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinancePublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinancePublicKey] (val x: Self) extends AnyVal {
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
  }
}
