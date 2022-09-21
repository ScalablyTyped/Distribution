package typings.trezorConnect.anon

import typings.node.bufferMod.global.Buffer
import typings.trezorConnect.protobufMod.StellarMemoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  // Proto: "memo_text"
  var hash: js.UndefOr[String | Buffer] = js.undefined
  
  // Proto: "memo_type"
  var id: js.UndefOr[String] = js.undefined
  
  // Proto: "memo_id"
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: StellarMemoType
}
object Hash {
  
  inline def apply(`type`: StellarMemoType): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setHash(value: String | Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: StellarMemoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
