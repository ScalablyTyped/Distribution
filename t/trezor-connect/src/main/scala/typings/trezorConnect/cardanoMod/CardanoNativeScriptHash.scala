package typings.trezorConnect.cardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoNativeScriptHash extends StObject {
  
  var scriptHash: String
}
object CardanoNativeScriptHash {
  
  inline def apply(scriptHash: String): CardanoNativeScriptHash = {
    val __obj = js.Dynamic.literal(scriptHash = scriptHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoNativeScriptHash]
  }
  
  extension [Self <: CardanoNativeScriptHash](x: Self) {
    
    inline def setScriptHash(value: String): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
  }
}
