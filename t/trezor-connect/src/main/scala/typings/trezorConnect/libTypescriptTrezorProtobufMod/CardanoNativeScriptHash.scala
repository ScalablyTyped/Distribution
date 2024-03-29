package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoNativeScriptHash extends StObject {
  
  var script_hash: String
}
object CardanoNativeScriptHash {
  
  inline def apply(script_hash: String): CardanoNativeScriptHash = {
    val __obj = js.Dynamic.literal(script_hash = script_hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoNativeScriptHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoNativeScriptHash] (val x: Self) extends AnyVal {
    
    inline def setScript_hash(value: String): Self = StObject.set(x, "script_hash", value.asInstanceOf[js.Any])
  }
}
