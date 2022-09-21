package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TezosPublicKey extends StObject {
  
  var public_key: String
}
object TezosPublicKey {
  
  inline def apply(public_key: String): TezosPublicKey = {
    val __obj = js.Dynamic.literal(public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TezosPublicKey]
  }
  
  extension [Self <: TezosPublicKey](x: Self) {
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
  }
}
