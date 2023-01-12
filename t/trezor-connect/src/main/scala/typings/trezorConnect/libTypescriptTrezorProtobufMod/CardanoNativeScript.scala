package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoNativeScript extends StObject {
  
  var invalid_before: js.UndefOr[UintType] = js.undefined
  
  var invalid_hereafter: js.UndefOr[UintType] = js.undefined
  
  var key_hash: js.UndefOr[String] = js.undefined
  
  var key_path: js.UndefOr[js.Array[Double]] = js.undefined
  
  var required_signatures_count: js.UndefOr[Double] = js.undefined
  
  var scripts: js.UndefOr[js.Array[CardanoNativeScript]] = js.undefined
  
  var `type`: CardanoNativeScriptType
}
object CardanoNativeScript {
  
  inline def apply(`type`: CardanoNativeScriptType): CardanoNativeScript = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoNativeScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoNativeScript] (val x: Self) extends AnyVal {
    
    inline def setInvalid_before(value: UintType): Self = StObject.set(x, "invalid_before", value.asInstanceOf[js.Any])
    
    inline def setInvalid_beforeUndefined: Self = StObject.set(x, "invalid_before", js.undefined)
    
    inline def setInvalid_hereafter(value: UintType): Self = StObject.set(x, "invalid_hereafter", value.asInstanceOf[js.Any])
    
    inline def setInvalid_hereafterUndefined: Self = StObject.set(x, "invalid_hereafter", js.undefined)
    
    inline def setKey_hash(value: String): Self = StObject.set(x, "key_hash", value.asInstanceOf[js.Any])
    
    inline def setKey_hashUndefined: Self = StObject.set(x, "key_hash", js.undefined)
    
    inline def setKey_path(value: js.Array[Double]): Self = StObject.set(x, "key_path", value.asInstanceOf[js.Any])
    
    inline def setKey_pathUndefined: Self = StObject.set(x, "key_path", js.undefined)
    
    inline def setKey_pathVarargs(value: Double*): Self = StObject.set(x, "key_path", js.Array(value*))
    
    inline def setRequired_signatures_count(value: Double): Self = StObject.set(x, "required_signatures_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_signatures_countUndefined: Self = StObject.set(x, "required_signatures_count", js.undefined)
    
    inline def setScripts(value: js.Array[CardanoNativeScript]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: CardanoNativeScript*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setType(value: CardanoNativeScriptType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
