package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAddress extends StObject {
  
  var address_n: js.Array[Double]
  
  var coin_name: js.UndefOr[String] = js.undefined
  
  var ignore_xpub_magic: js.UndefOr[Boolean] = js.undefined
  
  var multisig: js.UndefOr[MultisigRedeemScriptType] = js.undefined
  
  var script_type: js.UndefOr[InputScriptType] = js.undefined
  
  var show_display: js.UndefOr[Boolean] = js.undefined
}
object GetAddress {
  
  inline def apply(address_n: js.Array[Double]): GetAddress = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setCoin_name(value: String): Self = StObject.set(x, "coin_name", value.asInstanceOf[js.Any])
    
    inline def setCoin_nameUndefined: Self = StObject.set(x, "coin_name", js.undefined)
    
    inline def setIgnore_xpub_magic(value: Boolean): Self = StObject.set(x, "ignore_xpub_magic", value.asInstanceOf[js.Any])
    
    inline def setIgnore_xpub_magicUndefined: Self = StObject.set(x, "ignore_xpub_magic", js.undefined)
    
    inline def setMultisig(value: MultisigRedeemScriptType): Self = StObject.set(x, "multisig", value.asInstanceOf[js.Any])
    
    inline def setMultisigUndefined: Self = StObject.set(x, "multisig", js.undefined)
    
    inline def setScript_type(value: InputScriptType): Self = StObject.set(x, "script_type", value.asInstanceOf[js.Any])
    
    inline def setScript_typeUndefined: Self = StObject.set(x, "script_type", js.undefined)
    
    inline def setShow_display(value: Boolean): Self = StObject.set(x, "show_display", value.asInstanceOf[js.Any])
    
    inline def setShow_displayUndefined: Self = StObject.set(x, "show_display", js.undefined)
  }
}
