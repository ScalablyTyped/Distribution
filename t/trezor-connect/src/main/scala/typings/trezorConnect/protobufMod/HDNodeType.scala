package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HDNodeType extends StObject {
  
  var chain_code: String
  
  var child_num: Double
  
  var depth: Double
  
  var fingerprint: Double
  
  var private_key: js.UndefOr[String] = js.undefined
  
  var public_key: String
}
object HDNodeType {
  
  inline def apply(chain_code: String, child_num: Double, depth: Double, fingerprint: Double, public_key: String): HDNodeType = {
    val __obj = js.Dynamic.literal(chain_code = chain_code.asInstanceOf[js.Any], child_num = child_num.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDNodeType]
  }
  
  extension [Self <: HDNodeType](x: Self) {
    
    inline def setChain_code(value: String): Self = StObject.set(x, "chain_code", value.asInstanceOf[js.Any])
    
    inline def setChild_num(value: Double): Self = StObject.set(x, "child_num", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: Double): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
    
    inline def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
  }
}
